/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.smarttutor.Server;

import generated.grpc.smarttutor.DoubtsServiceGrpc;
import generated.grpc.smarttutor.RequestQuestion;
import generated.grpc.smarttutor.SmartAnswer;
import io.grpc.stub.StreamObserver;

/**
 * This class implement the Doubts Service
 *
 * @author bruol
 */
public class DoubtsServiceImpl extends DoubtsServiceGrpc.DoubtsServiceImplBase {

    /**
     *
     * @param request
     * @param responseObserver
     */
    @Override
    public void studentQuestion(RequestQuestion request, StreamObserver<SmartAnswer> responseObserver) {
        //taking the student Question
        String question = request.getQuestion();

        //getting back the answer
        String answer;
        answer = getAnswerForQuestion(question);

        SmartAnswer response = SmartAnswer.newBuilder()
                .setAnswer(answer)
                .build();

        //sending back to client
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    //to simulate this service i have set a simple set of questions
    private String getAnswerForQuestion(String question) {

        String lowerCaseQuestion = question.toLowerCase();

        if (lowerCaseQuestion.contains("capital of ireland")) {
            return "The capital of Ireland is Dublin";
        } else if (lowerCaseQuestion.contains("what is 4 + 2")) {
            return "4 + 2 is 6";
        } else if (lowerCaseQuestion.contains("king of united kingdom")) {
            return "The King of United Kingdom is Charles III";
        } else if (lowerCaseQuestion.contains("yuri gagarin")) {
            return "He was the first person to go to space";
        } else if (lowerCaseQuestion.contains("spin around itself")) {
            return "It takes around 24 hours to Earth to complete a spin around itself";
        } else {
            return "That's a good question! But I dont have the answer yet. I recommend reviewing your study material or asking your tutor.";
        }
    }

}
