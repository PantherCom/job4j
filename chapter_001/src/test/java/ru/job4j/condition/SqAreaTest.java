package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.SqArea;

public class SqAreaTest {
    @Test
    public void square() {
        double expected =2;
        double result1 = SqArea.square(6, 2);
        Assert.assertEquals(expected, result1, 0.01);
    }
}