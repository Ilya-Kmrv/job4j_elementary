package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prost = true;
        if (number <= 1) return false;
        for (int n = 2; n < number - 1; n++)
            if (number % n == 0) {
                prost = false;
                break;
            }
        return prost;
    }
}
