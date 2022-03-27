package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static void main(String[] args) {
        short heightMan = 173;
        short heightWoman = 150;
        double man = Fit.manWeight(heightMan);
        double woman = Fit.manWeight(heightWoman);
        System.out.println("Man 173 is " + man);
        System.out.println("Woman 150 is " + woman);
    }
}
