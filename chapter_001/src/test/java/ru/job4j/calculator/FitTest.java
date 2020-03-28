package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Fit;

public class FitTest {
    @Test
    public void manWeight() {
        double height = 200;
        double expected = 115;
        double man = Fit.manWeight(height);
        Assert.assertEquals(expected, man, 0.01);
    }
    @Test
    public void womanWeight() {
        double height = 200;
        double expected = 103.5;
        double woman = Fit.womanWeight(height);
        Assert.assertEquals(expected, woman, 0.01);
    }
}