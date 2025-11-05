package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        int y = word.length - postfix.length;
        for (int i = 0; i < postfix.length; i++) {
            if (word[y + i] != postfix[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
