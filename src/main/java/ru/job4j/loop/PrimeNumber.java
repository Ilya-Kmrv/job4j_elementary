package ru.job4j.loop;

public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;
        for (int n = 2; n <= finish; n++) {
            if (check(n) == true) {
                count = count + 1;
            }
        }
        return count;
    }


    public static boolean check(int number) {
        boolean prost = true;
        if (number <= 1) {
            return false;
        }
        for (int n = 2; n < number; n++) {
            if (number % n == 0) {
                prost = false;
                break;
            }
        }
        return prost;
    }
}