package de.p7s1.manager;

import de.p7s1.Board;
import de.p7s1.User;

import java.util.ArrayList;
import java.util.List;
//TODO Weise dem Board einen Owner zu – Abstrakte Klasse

public class BoardManager {

    public static void bordObjects() {
        for (Object inBoardObjects : getBoardObjects()){
            System.out.println(inBoardObjects);

        }
        n();
    }

    private static List getBoardObjects() {
        List<Board> board = new ArrayList<>();
        board.add(new Board(null, 120));
        System.out.println(board);
        return board;
    }

    private static void n() {
        User user = new User(1, "dia002m", "h.g-2M?!", "Mohamed",
                "Diallo", "06/07/2014");
        Board board = new Board(user.getVorName(), 10);
        System.out.println(board);

    }

}
