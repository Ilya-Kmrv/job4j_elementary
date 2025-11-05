package ru.job4j.array;

public class EqualLast {
    public static boolean check(int[] left, int[] right) {
        int LastLeft = left[left.length - 1];
        int LastRight = right[right.length - 1];

        if (LastLeft == LastRight) {
            return true;
        } else {
            return false;
        }
    }
}