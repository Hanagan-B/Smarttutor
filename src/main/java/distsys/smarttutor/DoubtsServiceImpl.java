/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.smarttutor;

import generated.grpc.smarttutor.DoubtsServiceGrpc;
import generated.grpc.smarttutor.RequestQuestion;
import generated.grpc.smarttutor.SmartAnswer;
import io.grpc.stub.StreamObserver;

/**
 *
 * @author bruol
 */
public class DoubtsServiceImpl extends DoubtsServiceGrpc.DoubtsServiceImplBase{
    
    /**
     *
     * @param request
     * @param responseObserver
     */
    @Override
    public void studentQuestion(RequestQuestion request, StreamObserver<SmartAnswer> responseObserver){
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
//implement using switch or nested if/else, to create a range of responses to different subjects
    //still need to work on this one
    private String getAnswerForQuestion(String question) {
        
        String lowerCaseQuestion = question.toLowerCase();
    

    if (lowerCaseQuestion.contains("math")) {
        
            return "maths response";
        }
        
     else if (lowerCaseQuestion.contains("biology")) {
        return "biology response";
        }
     else if (lowerCaseQuestion.contains("chemistry")) {
        return "chemistry response";
        }
     else if (lowerCaseQuestion.contains("english")) {
        return "english response";
        }
      else if (lowerCaseQuestion.contains("history")) {
        return "history response";
        }
        else {
        
        return "That's a good question! But I dont have the answer yet. I recommend reviewing your study material or asking your tutor.";
        }
    }

}

