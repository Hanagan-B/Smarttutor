/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.smarttutor;

import generated.grpc.smarttutor.ContentReply;
import generated.grpc.smarttutor.RequestContent;
import generated.grpc.smarttutor.ReviewContentServiceGrpc;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bruol
 */
public class ReviewContentServiceImpl extends ReviewContentServiceGrpc.ReviewContentServiceImplBase {
    
    @Override
    public void reviewContent (RequestContent request, StreamObserver<ContentReply> responseObserver){
        String contentToReview = request.getContent();
        
        //just to simulat, i need to create actuial content
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
            replies.add("You are reviewing math. Here's a topic on algebra.");
            replies.add("Next, let's review geometry.");
            replies.add("Now, a quick review on calculus.");
        } else if (content.equalsIgnoreCase("science")) {
            replies.add("You are reviewing science. Here's a topic on biology.");
            replies.add("Next, let's review physics.");
            replies.add("Now, a quick review on chemistry.");
        } else {
            replies.add("Content not found. Please try again.");
        }
        return replies;
        
    
    }
}
