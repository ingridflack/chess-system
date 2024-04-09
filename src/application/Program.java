package application;

import boardgame.Board;
import boardgame.Position;

public class Program {
    public static void main(String[] args) {
        Board board = new Board(2, 3);

        System.out.println(board);
    }
}