/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.smarttutor.Server;

import generated.grpc.smarttutor.ContentReply;
import generated.grpc.smarttutor.RequestContent;
import generated.grpc.smarttutor.ReviewContentServiceGrpc;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.List;

/**
 * This class implement the Review Content Service
 *
 * @author bruol
 */
public class ReviewContentServiceImpl extends ReviewContentServiceGrpc.ReviewContentServiceImplBase {

    @Override
    public void reviewContent(RequestContent request, StreamObserver<ContentReply> responseObserver) {
        String contentToReview = request.getContent();

        //just to simulat, i need to create actual content
        List<String> contentReplies = getContentReplies(contentToReview);

        //For loop will allow the multiple responses
        for (String reply : contentReplies) {
            ContentReply contentReply = ContentReply.newBuilder()
                    .setReply(reply)
                    .build();
            responseObserver.onNext(contentReply);
        }
        responseObserver.onCompleted();
    }

    //create all the replies
    private List<String> getContentReplies(String content) {
        List<String> replies;
        replies = new ArrayList<>();
        if (content.equalsIgnoreCase("math")) {
            replies.add("You are reviewing math. Math has a few contents to be studied.");
            replies.add("You can start by studing basic operations.");
            replies.add("Now, that you mastered the basics we can move to Mesuarement and data.");
            replies.add("Next Step to enhance your studies is to check a bit of geometry.");
        } else if (content.equalsIgnoreCase("science")) {
            replies.add("You are reviewing science. Here's a topic on biology.");
            replies.add("Have fun researching a bit about Earth and Space science.");
            replies.add("Now, you can step foward and check a bit of chemistry.");
        } else if (content.equalsIgnoreCase("reading and language")) {
            replies.add("You are reviewing Reading and Language. You can start with basic vocabulary.");
            replies.add("Do not forget to check a bit about Grammar.");
            replies.add("Now, it is usefull to read a few classic books.");
            replies.add("Please, use the Grade Essay Service on this App to get a feedback on your writing skills.");
        }else if (content.equalsIgnoreCase("social studies")) {
            replies.add("You are reviewing Social Studies. For this you can start with early World History");
            replies.add("Anscient civilizations is a fun topic to study.");
            replies.add("Now, you are able to move foward and check how big economies of today were build.");
            replies.add("Do not forget to check a few theories on what can happen in the future.");
        }else {
            replies.add("Content not found. Please try again.");
        }
        return replies;

    }
}
