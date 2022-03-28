package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double getSumDiffAndDiv(double first, double second) {
        return sum(diff(first, second), div(first, second));
    }

    public static double getSumSumAndDiffAndMultiplyAndDiv(double first, double second) {
        return sum(first, second) + diff(first, second) + multiply(first, second) + diff(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета 1 равно: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета 2 равно: " + getSumDiffAndDiv(10, 5));
        System.out.println("Результат расчета 3 равно: " + getSumSumAndDiffAndMultiplyAndDiv(4, 100));
    }
}
