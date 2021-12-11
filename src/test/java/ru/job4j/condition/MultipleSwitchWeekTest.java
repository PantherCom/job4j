package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.condition.MultipleSwitchWeek.numberOfDay;

public class MultipleSwitchWeekTest {
    @Test
    public void whenSunday() {
        String name = "Sunday";
        int rst = numberOfDay(name);
        int expect = 7;
        assertThat(rst, is(expect));
    }
}
