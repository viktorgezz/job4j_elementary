package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {

        if (number == 1) {
            return false;
        }

        int maxDiv = (number / 2) + 1;
        boolean primeNum = true;

        for (int i = 2; i < maxDiv; i++) {
            if (number % i == 0) {
                primeNum = false;
                break;
            }
        }

        return primeNum;
    }
}
