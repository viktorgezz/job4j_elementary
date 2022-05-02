package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        boolean debt = true;

        while (debt) {
            amount =  amount * (1 + percent / 100) - salary;
            year++;
            if (amount <= 0) {
                debt = false;
            }
        }
        return year;
    }
}
