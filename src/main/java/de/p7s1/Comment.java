package de.p7s1;

public class Comment {
    private int id;
    private int userReference;
    private String text;

    public Comment(int id, int userReference, String text) {
        this.id = id;
        this.userReference = userReference;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserReference() {
        return userReference;
    }

    public void setUserReference(int userReference) {
        this.userReference = userReference;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id: " + id +
                ", userReference: " + userReference +
                ", text: '" + text + '\n' +
                '}';
    }
}
