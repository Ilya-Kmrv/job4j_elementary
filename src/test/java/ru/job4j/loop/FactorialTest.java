package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void calculate() {
        int number = 1;
        int result = Factorial.calculate(number);
        int expected = 1;
        assertEquals(expected, result);

    }
}