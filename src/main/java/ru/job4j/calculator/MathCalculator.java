package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double subAndDiv(double first, double second) {
        return MathFunction.sub(first, second)
                + MathFunction.div(first, second);
    }

    public static double sumSubDivMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.sub(first, second)
                + MathFunction.multiply(first, second)
                + MathFunction.div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета суммы и умножения равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета суммы разности и деления равен: " + subAndDiv(10, 20));
        System.out.println("Результат расчета суммы, разности, деления и умножения равен: " + sumSubDivMultiply(10, 20));
    }
}
