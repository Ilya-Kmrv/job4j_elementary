package ru.job4j.loop;

public class NumberPyramid {
    public static void draw(int n) {
        for (int i = 1; i <= n; i++) {
            // Печатаем пробелы
            for (int row = n - i; row > 0; row--) {
                System.out.print(" ");
            }
            // Печатаем числа в прямом порядке
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Печатаем числа в обратном порядке
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            // Переход на новую строчку
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Number pyramid of height 3:");
        draw(1);
        System.out.println("Number pyramid of height 5:");
        draw(9);
    }
}
