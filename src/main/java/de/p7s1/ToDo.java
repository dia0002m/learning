package de.p7s1;

import java.util.ArrayList;
import java.util.List;

public class ToDo {
    private int id;
    private List<String> name;
    private String description;

    public ToDo(int id, String description) {
        this.id = id;
        this.name = new ArrayList<>();
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id: " + id +
                ", name: " + name +
                ", description: '" + description + '\n' +
                '}';
    }
}
