package de.p7s1;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private String name;
    List<ToDo> toDoList;
    private int id;

    public Board(String name, int id) {
        this.name = name;
        this.toDoList = new ArrayList<ToDo>();
        this.id = id;
    }

    public List printUserInformation(List<ToDo> boards) {

        return boards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ToDo> getToDoList() {
        return toDoList;
    }

    public void setToDoList(List<ToDo> toDoList) {
        this.toDoList = toDoList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Board{" +
                "name: '" + name + '\'' +
                ", toDoList: " + toDoList +
                ", id: " + id +
                '}';
    }
}
