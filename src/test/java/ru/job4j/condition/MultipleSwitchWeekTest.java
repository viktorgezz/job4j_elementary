package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void numberOfDay() {
        String in = "Wednesday";
        int out = MultipleSwitchWeek.numberOfDay(in);
        int expect = 3;
        Assert.assertEquals(expect, out);
    }
}