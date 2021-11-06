package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int f = i + 1;
                int s = j + 1;
                table[i][j] = f * s;
            }
        }

        return table;
    }
}