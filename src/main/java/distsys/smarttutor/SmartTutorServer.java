/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.smarttutor;

import distsys.smarttutor.Server.DoubtsServiceImpl;
import distsys.smarttutor.Server.GradeEssayServiceImpl;
import distsys.smarttutor.Server.StudentQuizServiceImpl;
import distsys.smarttutor.Server.ReviewContentServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

/**
 *
 * @author bruol
 */
public class SmartTutorServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        
        Server server;
        server = ServerBuilder.forPort(50051)  
                .addService(new DoubtsServiceImpl())
                .addService(new ReviewContentServiceImpl())
                .addService(new GradeEssayServiceImpl())
                .addService(new StudentQuizServiceImpl())
                .build();

        System.out.println("Server started, listening on port 50051...");

        server.start();
        server.awaitTermination();  
    }
}
