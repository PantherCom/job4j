package job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; // формула перевода рублей в доллоры.
        return rsl;
    }

    public static void main(String[] args) {
        int value = 700;
        int expected = 10;
        int euro = Converter.rubleToEuro(value);
        boolean passed = expected == euro;
        System.out.println( value + " rubles are " + euro + " euro.Test result : " + passed);

        int dollar = Converter.rubleToDollar(value);
        System.out.println( value + " rubles are " + dollar + " dollar.");

    }
}
