package de.p7s1.manager;

import de.p7s1.Comment;
import java.util.ArrayList;
import java.util.List;

public class CommentlManger {

    public static void commentObjects() {
        for (Object inCommentObject : CommentlManger.getCommentsObject())
            System.out.println(inCommentObject);
    }

    private static List getCommentsObject() {
        List<Comment> comments = new ArrayList<>();
        comments.add(new Comment(1, 1202, "Well done"));
        comments.add(new Comment(2, 1203, "Not that bad"));
        comments.add(new Comment(3, 1204, "Good job"));
        return comments;
    }

}
