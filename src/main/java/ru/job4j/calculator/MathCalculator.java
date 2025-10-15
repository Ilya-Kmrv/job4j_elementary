package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumMinusAndDiv(double first, double second) {
        return difference(first, second) + division(first, second);
    }

    public static double all(double first, double second) {
        return difference(first, second)
                + division(first, second)
                + multiply(first, second)
                + sum(first, second);
    }

    public static void main(String[] args) {
        double result1 = sumAndMultiply(10, 20);
        System.out.println("Результат расчета равен: " + result1);
        double result2 = sumMinusAndDiv(10, 20);
        System.out.println("Результат расчета равен: " + result2);
        double result3 = all(10, 20);
        System.out.println("Результат расчета равен: " + result3);
    }
}
