/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.smarttutor;

import generated.grpc.smarttutor.QuizAnswers;
import generated.grpc.smarttutor.QuizQuestions;
import generated.grpc.smarttutor.StudentQuizServiceGrpc;
import io.grpc.stub.StreamObserver;
import java.util.Arrays;
import java.util.List;

/**
 * This class implement the Student Quiz Service
 *
 * @author bruol
 */
public class StudentQuizServiceImpl extends StudentQuizServiceGrpc.StudentQuizServiceImplBase {

    @Override
    public StreamObserver<QuizQuestions> smartQuiz(StreamObserver<QuizAnswers> responseObserver) {
        return new StreamObserver<QuizQuestions>() {
            int questionIndex = 0;
            //I have created a general simple range of questions
            List<String> questions = Arrays.asList(
                    "What is the capital of Ireland?",
                    "What is 4 + 2?",
                    "Who is the King of United Kingdom?",
                    "Who was the first person to go to space?",
                    "How long it takes to Earth to complete a spin around itself?",
                    "What pandas eat?"
            );

            //i have provide the answers that we can compare to user input
            List<String> correctAnswers = Arrays.asList(
                    "Dublin",
                    "6",
                    "Charles III",
                    "Yuri Gagarin",
                    "24 hours",
                    "bamboo"
            );

            boolean firstQuestionSent = false;
            
            StreamObserver<QuizQuestions> requestObserver; // To hold the incoming request observer

       
            @Override
            public void onNext(QuizQuestions inputAnswer) {
                if (!firstQuestionSent) {
                }

                if (questionIndex < questions.size()) {
                    String userResponse = inputAnswer.getQuestion();
                    String correctAnswer = correctAnswers.get(questionIndex);

                    boolean isCorrect = userResponse.equalsIgnoreCase(correctAnswer);

                    responseObserver.onNext(QuizAnswers.newBuilder()
                            .setAnswer("Correct answer: " + correctAnswer)
                            .setAnswerCorrect(isCorrect)
                            .build());
                    
                    if (++questionIndex < questions.size()) {
                        String nextQuestion = questions.get(questionIndex);
                        responseObserver.onNext(QuizAnswers.newBuilder()
                                .setAnswer(nextQuestion)
                                .setAnswerCorrect(false)
                                .build());
                } else {
                    responseObserver.onCompleted();
                    }
                }
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error during quiz: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Quiz session completed.");
                responseObserver.onCompleted();
            }
            

            

        };
    }
}
