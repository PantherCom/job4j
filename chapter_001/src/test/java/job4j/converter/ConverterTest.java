package job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {
    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    public static int rubleToDollar(int value) {
        return -1;
    }

    @Test
    public void rubleToDollar() {
        int in = 180;

        int expected = 3; //ОТРИЦАТЕЛЬНЫЙ ТЕСТ
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}