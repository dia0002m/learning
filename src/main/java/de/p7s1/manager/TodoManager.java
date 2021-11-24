package de.p7s1.manager;

import de.p7s1.ToDo;

import java.util.ArrayList;
import java.util.List;

public class TodoManager {
    public static void todoObjects(){
        for(Object inTodoObjects: TodoManager.toDosObject())
        System.out.println(inTodoObjects);
    }

    private static List  toDosObject() {

        List<ToDo> toDos = new ArrayList<>();

          // toDos.add(new ToDo(list.get(0).getId(), "Intermediate"));
            toDos.add(new ToDo(2, "Beginner"));
            toDos.add(new ToDo(3, "Expert"));
            toDos.add(new ToDo(4, "Intermediate"));
            toDos.add(new ToDo(5, "Expert"));


        return toDos;

    }

}
