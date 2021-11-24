package de.p7s1;

import de.p7s1.manager.*;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        LabelManager.labelObjects();
        BoardManager.bordObjects();
        // List user = UserManager.userObjects();
        UserManager userManager = new UserManager();
        userManager.userObjects();
        TodoManager.todoObjects();

        List userObjects = userManager.userObjects();

        CommentlManger.commentObjects();


        //Todo extra Klasse anlegen z.B todoManager Static / andere object instanz
        // Todo Commentar gegeben userName ausgeben

        //TODO gib mir user Mohamed BoardManager soll neues board für den Mohamed bauen (Method)

    }
}
