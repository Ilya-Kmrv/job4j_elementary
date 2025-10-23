package ru.job4j.array;

public class ArrayDefenition {
    static short[] ages = new short[10];
    static String[] surnames = new String[100500];
    static float[] prices = new float[40];

    public static void main(String[] args) {

        System.out.println("Размер массива равен:  " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);
    }
}
