package de.p7s1.manager;

import de.p7s1.Label;

import java.util.ArrayList;
import java.util.List;

public class LabelManager {


    public static void labelObjects() {
        for (Object inLabelObject : LabelManager.getLabelObjects())
            System.out.println(inLabelObject);


    }

    private static List getLabelObjects() {

        List<Label> labels = new ArrayList<>();
        labels.add(new Label(1, "Java Core"));
        labels.add(new Label(2, "React"));
        labels.add(new Label(3, "JS"));
        labels.add(new Label(4, "Python"));
        labels.add(new Label(5, "Vue"));
        return labels;

    }
}
