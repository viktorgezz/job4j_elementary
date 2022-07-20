package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {
    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[]{60, 2, 31, 43, 25};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{2, 25, 31, 43, 60};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[]{30, 1, 25};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 25, 30};
        Assert.assertArrayEquals(expected, result);
    }
}