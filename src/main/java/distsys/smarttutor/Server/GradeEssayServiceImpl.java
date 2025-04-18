/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.smarttutor.Server;

import generated.grpc.smarttutor.Essay;
import generated.grpc.smarttutor.EssayGraded;
import generated.grpc.smarttutor.GradeEssayServiceGrpc;
import io.grpc.stub.StreamObserver;

/**
 * This class implement the Grade Essay Service
 *
 * @author bruol
 */
public class GradeEssayServiceImpl extends GradeEssayServiceGrpc.GradeEssayServiceImplBase {

    @Override
    public StreamObserver<Essay> studentEssay(StreamObserver<EssayGraded> responseObserver) {

        return new StreamObserver<Essay>() {
            StringBuilder fullEssay = new StringBuilder();
            //appending parts
            @Override
            public void onNext(Essay essayPart) {
                fullEssay.append(essayPart.getPartEssay());
                
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error during essay grading: " + t.getMessage());
            }
            //generating feedback
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

            //range of feedback, can be improved to consider more relevant aspects
            private String generateFeedback(String essayText) {
                if (essayText.length() > 100) {
                    return "Well-written essay. Watch out for grammar issues.";
                } else if (essayText.length() < 50) {
                    return "The essay is too short. Please provide more content.";
                } else if (essayText.length() > 150) {
                    return "Good Syntax usage. To improve just check to use the correct style.";
                }
                else {
                    return "Please, watch your ponctuation.";
                }
            }

        };
    }
}
