/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.smarttutor;

import generated.grpc.smarttutor.DoubtsServiceGrpc;
import generated.grpc.smarttutor.RequestQuestion;
import generated.grpc.smarttutor.SmartAnswer;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.Scanner;

/**
 *
 * @author bruol
 */
public class SmartTutorClient {
    public static void main(String[] args) {
        // 1. Connect to the server
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        // 2. Create a blocking stub (for unary call)
        DoubtsServiceGrpc.DoubtsServiceBlockingStub stub;
        stub = DoubtsServiceGrpc.newBlockingStub(channel);

        // 3. Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your question for the Smart Tutor: ");
        String userQuestion = scanner.nextLine();

        // 4. Build request and send it
        RequestQuestion request = RequestQuestion.newBuilder()
                                                 .setQuestion(userQuestion)
                                                 .build();

        SmartAnswer response = stub.studentQuestion(request);

        // 5. Display response
        System.out.println("SmartTutor's answer: " + response.getAnswer());

        // 6. Shut down
        channel.shutdown();
    }
}
