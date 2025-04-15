/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.smarttutor;

import generated.grpc.smarttutor.Essay;
import generated.grpc.smarttutor.EssayGraded;
import generated.grpc.smarttutor.GradeEssayServiceGrpc;
import io.grpc.stub.StreamObserver;

/**
 *
 * @author bruol
 */
public class GradeEssayServiceImpl extends GradeEssayServiceGrpc.GradeEssayServiceImplBase {
    @Override
    public StreamObserver<Essay> studentEssay(StreamObserver<EssayGraded> responseObserver) {
        

        return new StreamObserver<Essay>() {
            StringBuilder fullEssay = new StringBuilder();
            
            
            @Override
            public void onNext(Essay essayPart) {
                fullEssay.append(essayPart.getPartEssay()).append(" ");
                System.out.println("Received essay part: " + essayPart.getPartEssay());
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                String essayText = fullEssay.toString().trim();
                String feedback = generateFeedback(essayText);

                EssayGraded graded = EssayGraded.newBuilder()
                        .setFeedback(feedback)
                        .build();

                responseObserver.onNext(graded);
                responseObserver.onCompleted();
            }
            //change to create a good feedback
            private String generateFeedback(String essayText) {
                if (essayText.toLowerCase().contains("text")) {
                    return " Consider expanding your conclusion.";
                } else if (essayText.length() < 50) {
                    return "The essay is too short. Please provide more content.";
                } else {
                    return "Well-written essay. Watch out for grammar issues.";
                }
            }
            
        };
    }
}
