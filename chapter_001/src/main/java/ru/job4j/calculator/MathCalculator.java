package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subAndDiv(double first, double second) {
        return sub(first, second)
                + div(first, second);
    }

    public static double sumSubDivMultiply(double first, double second) {
        return sum(first, second)
                + sub(first, second)
                + multiply(first, second)
                + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета суммы и умножения равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета суммы разности и деления равен: " + subAndDiv(10, 20));
        System.out.println("Результат расчета суммы, разности, деления и умножения равен: " + sumSubDivMultiply(10, 20));
    }
}
