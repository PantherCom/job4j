package job4j.condition;

import org.junit.Assert;
import org.junit.Test;


public class PointTest {
    @Test
    public void distance() {
        double expected = 2;
        double result = Point.distance(0, 0, 2, 0);
        Assert.assertEquals(expected, result, 0.01);
    }
}