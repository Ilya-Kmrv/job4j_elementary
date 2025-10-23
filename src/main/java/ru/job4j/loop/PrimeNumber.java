package ru.job4j.loop;

public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;
        for (int n = 2; n <= finish; n++) {
            if (CheckPrimeNumber.check(n)) {
                count = count + 1;
            }
        }
        return count;
    }
}