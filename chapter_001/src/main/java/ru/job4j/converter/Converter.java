package ru.job4j.converter;

/**
 * Класс для конвертирования валют
 *
 * @author Могилатов Артем
 * @version 1
 * @since 10.05.2020
 **/

public class Converter {

    /**
     * вычисляет количество сконвертированой валюты
     *
     * @param value
     * @return количество сконвертированой валюты
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    /**
     * вычисляет количество сконвертированой валюты
     *
     * @param value
     * @return количество сконвертированой валюты
     */

    public static int rubleToDollar(int value) {
        int rsl = value / 60; // формула перевода рублей в доллоры.
        return rsl;
    }

    /**
     * вывод на экран количества конвертируемой и сконвертированой валюты.
     * вывод результата теста на корректность вычесления
     *
     * @param args
     */
    public static void main(String[] args) {
        int value = 700;
        int expected = 10;
        int euro = Converter.rubleToEuro(value);
        boolean passed = expected == euro;
        System.out.println(value + " rubles are " + euro + " euro.Test result : " + passed);

        int dollar = Converter.rubleToDollar(value);
        System.out.println(value + " rubles are " + dollar + " dollar.");

    }
}
