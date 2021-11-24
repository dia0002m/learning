package de.p7s1.manager;

import de.p7s1.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager {

    public  List userObjects() {
        for (Object inUserObject : getUserObjects())
            System.out.println(inUserObject);


        return getUserObjects();
    }

    private static TodoManager todoManager;

    private  List getUserObjects() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "dia002m", "h.g-2M?!", "Mohamed",
                "Diallo", "06/07/2014"));
        users.add(new User(2, "sch032a", "h.hf-2M?!", "Alexander",
                "Schneider", "06/07/2001"));
        users.add(new User(3, "wag003m", "h.zr-2M?!", "Marie",
                "Wagner", "06/07/2014"));
        users.add(new User(4, "joh0034t", "rtzh.-2M?!", "Thomas",
                "Johnson", "06/07/2000"));
        users.add(new User(5, "joy003a", "hihj.-2M?!", "Alice",
                "Joy", "06/07/1999"));
        // todoManager.toDosObject(users);


        return users;

    }


    public static TodoManager getTodoManager() {
        return todoManager;
    }

    public void setTodoManager(TodoManager todoManager) {
        this.todoManager = todoManager;
    }
}
