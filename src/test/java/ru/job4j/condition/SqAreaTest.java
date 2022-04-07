package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP30K17Square11Dot8() {
        double expected = 11.8;
        int p = 30;
        double k = 17;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP24K15Square8Dot43() {
        double expected = 8.43;
        int p = 24;
        int k = 15;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}