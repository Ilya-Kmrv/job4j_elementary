package ru.job4j.array;

public class ArrayDefenition {
    static short[] ages = new short[10];
    static String[] surnames = new String[100500];
    static float[] prices = new float[40];

    public static void main(String[] args) {
        String[] name = new String[4];
        name[0] = "Хорошего дня всем проверяющим!";
        System.out.println(name[0]);
        System.out.println("Размер массива равен:  " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);
    }
}
