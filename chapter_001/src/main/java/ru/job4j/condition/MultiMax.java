package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int comp = first > second ? first : second;
        return comp > third ? comp : third;
    }
}
