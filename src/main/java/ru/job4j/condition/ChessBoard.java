package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValidate(x1) && isValidate(x2) && isValidate(y1) && isValidate(y2)) {
            if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
                return Math.abs(x2 - x1);
            }
        }
        return rsl;
    }

    public static boolean isValidate(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }
}
