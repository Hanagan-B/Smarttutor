/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.smarttutor;

import generated.grpc.smarttutor.ContentReply;
import generated.grpc.smarttutor.DoubtsServiceGrpc;
import generated.grpc.smarttutor.Essay;
import generated.grpc.smarttutor.EssayGraded;
import generated.grpc.smarttutor.GradeEssayServiceGrpc;
import generated.grpc.smarttutor.QuizAnswers;
import generated.grpc.smarttutor.QuizQuestions;
import generated.grpc.smarttutor.RequestContent;
import generated.grpc.smarttutor.RequestQuestion;
import generated.grpc.smarttutor.ReviewContentServiceGrpc;
import generated.grpc.smarttutor.SmartAnswer;
import generated.grpc.smarttutor.StudentQuizServiceGrpc;
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

    public static void main(String[] args) throws InterruptedException {
        //Connect to the server
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        //Create a blocking stub for each service
        DoubtsServiceGrpc.DoubtsServiceBlockingStub stub;
        stub = DoubtsServiceGrpc.newBlockingStub(channel);

        ReviewContentServiceGrpc.ReviewContentServiceStub reviewStub;
        reviewStub = ReviewContentServiceGrpc.newStub(channel);

        GradeEssayServiceGrpc.GradeEssayServiceStub essayStub;
        essayStub = GradeEssayServiceGrpc.newStub(channel);

        StudentQuizServiceGrpc.StudentQuizServiceStub quizStub;
        quizStub = StudentQuizServiceGrpc.newStub(channel);

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
        latch.await(30, TimeUnit.SECONDS);

        //third Service
        StreamObserver<EssayGraded> responseObserver = new StreamObserver<EssayGraded>() {
            @Override
            public void onNext(EssayGraded essayGraded) {
                System.out.println("Feedback from SmartTutor: " + essayGraded.getFeedback());
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error: " + t.getMessage());
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Essay streaming completed.");
                latch.countDown();
            }
        };

        StreamObserver<Essay> requestObserver = essayStub.studentEssay(responseObserver);

        requestObserver.onNext(Essay.newBuilder().setPartEssay("essay essay.").build());
        requestObserver.onNext(Essay.newBuilder().setPartEssay("We send a feedback.").build());
        requestObserver.onNext(Essay.newBuilder().setPartEssay("dog cat cat.").build());

        requestObserver.onCompleted();
        latch.await(30, TimeUnit.SECONDS);

        //fourth Service
        
        CountDownLatch quizLatch = new CountDownLatch(1);
        Scanner quizScanner = new Scanner(System.in);

        StreamObserver<QuizQuestions> quizRequestObserver = quizStub.smartQuiz(new StreamObserver<QuizAnswers>() {
            
             

           @Override
           public void onNext(QuizAnswers value) {
                 
                 if (!value.getAnswerCorrect()) {
                 System.out.println("SmartTutor asks: " + value.getAnswer());
                 System.out.print("Your answer: ");
                 String userAnswer = quizScanner.nextLine();

                 QuizQuestions quizQ = QuizQuestions.newBuilder()
                         .setQuestion(userAnswer)
                         .build();

                 System.out.println("Sending your answer to the server: " + userAnswer);
                 /*quizRequestObserver.onNext(quizQ);*/
                    
                } else {
                    
                    System.out.println(value.getAnswer() + " | Correct: " + value.getAnswerCorrect());
                    
                }
            }
            
            
            @Override
            public void onError(Throwable t) {
                System.err.println("Quiz error: " + t.getMessage());
                quizLatch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("SmartQuiz stream completed.");
                quizLatch.countDown();
            }
        });
        
        System.out.println("Waiting for the SmartTutor to start the quiz...");

        try {
            quizLatch.await(); // Wait indefinitely until the server completes or errors
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Interrupted while waiting for quiz completion.");
        }
        
        

        // Wait for server to finish
        quizLatch.await(30, TimeUnit.SECONDS);

        //Shut down
        channel.shutdown();
    }
}
