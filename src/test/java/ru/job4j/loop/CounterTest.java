package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void whenSumFrom0to10Then55() {
        int start = 0;
        int finish = 10;
        int output = Counter.sum(start, finish);
        int expected = 55;
        assertEquals(expected, output);
    }

    @Test
    void whenSumFrom3to8Then33() {
        int start = 3;
        int finish = 8;
        int output = Counter.sum(start, finish);
        int expected = 33;
        assertEquals(expected, output);
    }

    @Test
    void whenSumFrom1to1Then1() {
        int start = 1;
        int finish = 1;
        int output = Counter.sum(start, finish);
        int expected = 1;
        assertEquals(expected, output);
    }

    @Test
    void whenSumFrom5to55Then1530() {
        int start = 5;
        int finish = 55;
        int output = Counter.sum(start, finish);
        int expected = 1530;
        assertEquals(expected, output);
    }

    @Test
    void whenSumFrom40to30Then0() {
        int start = 40;
        int finish = 30;
        int output = Counter.sum(start, finish);
        int expected = 0;
        assertEquals(expected, output);
    }

    @Test
    void whenSumByEvenFrom0to10Then30() {
        int start = 0;
        int finish = 10;
        int output = Counter.sumByEven(start, finish);
        int expected = 30;
        assertEquals(expected, output);
    }

    @Test
    void whenSumByEvenFrom3to8Then18() {
        int start = 3;
        int finish = 8;
        int output = Counter.sumByEven(start, finish);
        int expected = 18;
        assertEquals(expected, output);
    }

    @Test
    void whenSumByEvenFrom1to1Then0() {
        int start = 1;
        int finish = 1;
        int output = Counter.sumByEven(start, finish);
        int expected = 0;
        assertEquals(expected, output);
    }

    @Test
    void whenSumByEvenFrom10to100Then2530() {
        int start = 10;
        int finish = 100;
        int output = Counter.sumByEven(start, finish);
        int expected = 2530;
        assertEquals(expected, output);
    }

    @Test
    void whenSumByEvenFromMinus2to10Then28() {
        int start = -2;
        int finish = 10;
        int output = Counter.sumByEven(start, finish);
        int expected = 28;
        assertEquals(expected, output);
    }
}