package ru.job4j.condition;


public class MultiMax {
    public int max(int first, int second, int third) {
        int comp = Math.max(first, second);
        return Math.max(comp, third);
    }
}
