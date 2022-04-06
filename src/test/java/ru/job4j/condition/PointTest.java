package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    static double delta = 0.01;

    @Test
    public void when00To44Then5() {
        double expected = 5.65;
        int x1 = 0;
        int y1 = 0;
        int x2 = 4;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void when14To02Then2() {
        double expected = 2.23;
        int x1 = 1;
        int y1 = 4;
        int x2 = 0;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void when66To77Then1() {
        double expected = 1.41;
        int x1 = 6;
        int y1 = 6;
        int x2 = 7;
        int y2 = 7;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void when1314to88Then7() {
        double expected = 7.81;
        int x1 = 13;
        int y1 = 14;
        int x2 = 8;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, delta);
    }
}