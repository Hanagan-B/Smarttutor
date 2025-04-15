/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.smarttutor;

import generated.grpc.smarttutor.ContentReply;
import generated.grpc.smarttutor.DoubtsServiceGrpc;
import generated.grpc.smarttutor.RequestContent;
import generated.grpc.smarttutor.RequestQuestion;
import generated.grpc.smarttutor.ReviewContentServiceGrpc;
import generated.grpc.smarttutor.SmartAnswer;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.CountDownLatch;


/**
 *
 * @author bruol
 */
public class SmartTutorClient {
    public static void main(String[] args) throws InterruptedException{
        //Connect to the server
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        //Create a blocking stub for each service
        DoubtsServiceGrpc.DoubtsServiceBlockingStub stub;
        stub = DoubtsServiceGrpc.newBlockingStub(channel);
        
        ReviewContentServiceGrpc.ReviewContentServiceStub reviewStub = ReviewContentServiceGrpc.newStub(channel);
        
        //First Service
        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your question for the Smart Tutor: ");
        String userQuestion = scanner.nextLine();

        //Build request and send it
        RequestQuestion request = RequestQuestion.newBuilder()
                                                 .setQuestion(userQuestion)
                                                 .build();

        SmartAnswer response = stub.studentQuestion(request);

        //Display response
        System.out.println("SmartTutor's answer: " + response.getAnswer());
        
        //Second Service
        RequestContent requestContent = RequestContent.newBuilder()
                                                      .setContent("math")
                                                      .build();
        
        CountDownLatch latch = new CountDownLatch(1);
         
         
        reviewStub.reviewContent(requestContent, new StreamObserver<ContentReply>() {
            @Override
            public void onNext(ContentReply value) {
                System.out.println("ReviewContentService Response: " + value.getReply());
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error during stream: " + t.getMessage());
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Review content stream completed.");
                latch.countDown();
            }
        });
        latch.await(5, TimeUnit.SECONDS);
        //Shut down
        channel.shutdown();
    }
}
