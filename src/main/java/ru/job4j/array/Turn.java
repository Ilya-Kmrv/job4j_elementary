package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        temp = array[1];
        array[1] = array[array.length - 2];
        array[array.length - 2] = temp;
        return array;
    }
}
