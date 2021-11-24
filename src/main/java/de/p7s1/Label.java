package de.p7s1;

public class Label {
    private int id;
    private String title;
    public Label(int id, String title) {
        this.id = id;
        this.title = title;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Label{" +
                "id: " + id +
                ", title=: " + title + '\'' +
                '}'+ '\n';
    }
}
