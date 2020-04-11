package ru.job4j.loop;


public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int ci = result;  ci <= n ; ci++){

                result = result * ci ;
            }
        return result;
    }
}
