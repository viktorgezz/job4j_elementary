package ru.job4j;

public class Calculator {
    public static void main(String[] args) {
        int six = 6;
        int five = 5;
        int four = 4;
        int one = 1;
        int two = 2;

        int onePlusTwo = one + two;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.printf("%s %s %s", sixDivTwo, fiveMinusTwo, fourTimeTwo);
    }
}
