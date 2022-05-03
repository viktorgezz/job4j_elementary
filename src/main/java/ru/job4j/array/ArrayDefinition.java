package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surname равен: " + surnames.length);
        System.out.println("Размер массива prices: " + prices.length);

        String[] names = new String[4];
        names[0] = "Viktor";
        names[1] = "Nastya";
        names[2] = "Artem";
        names[3] = "Rita";
        System.out.printf("%s, %s, %s, %s.", names[0], names[1], names[2], names[3]);
    }
}
