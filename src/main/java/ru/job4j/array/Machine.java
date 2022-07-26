package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[1];
        int change = money - price;
        int index = 0;
        for (int i = 0; i < coins.length; i++) {
            while (change >= coins[i]) {
                change -= coins[i];
                rsl[index] = coins[i];
                index++;
                rsl = Arrays.copyOf(rsl, index + 1);
            }
        }
        return Arrays.copyOf(rsl, index);
    }
}
