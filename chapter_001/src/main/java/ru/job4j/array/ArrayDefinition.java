package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surname = new String[100500];
        float[] prices = new float[40];

        String[] names = new String[4];
        names[1] = "first";
        names[2] = "second";
        names[3] = "thrid";
        names[0] = "fourth";

        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[0]);


    }
}
