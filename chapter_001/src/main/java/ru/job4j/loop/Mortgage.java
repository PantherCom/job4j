package ru.job4j.loop;

public class Mortgage {

    public int year(int amount, int salary, double percent) {
        int year = 0;
        double per = percent / 100;

        while (amount >= 0) {
            double growth = amount * per;
            double sum = growth + amount;
            amount = (int) (sum - salary);

            year++;
        }
        return year;
    }
}
