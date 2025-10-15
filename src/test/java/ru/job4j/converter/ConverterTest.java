package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert180RblThen2Euro() {
        double input = 180;
        double expected = 2;
        double output = Converter.rubleToEuro(input);
        double value = 0.0001;
        assertEquals(expected, output, value);
    }

    @Test
    void whenConvert200RblThen3dot3333Euro() {
        double input = 200;
        double expected = 3.3333;
        double output = Converter.rubleToEuro(input);
        double value = 0.0001;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert225RblThen3Dollar() {
        double input = 225;
        double expected = 3;
        double output = Converter.rubleToDollar(input);
        double value = 0.0001;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}