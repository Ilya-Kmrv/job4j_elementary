package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] prefix = {'H', 'e'};
        boolean result = ArrayChar.startWith(word, prefix);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] prefix = {'H', 'i'};
        boolean result = ArrayChar.startWith(word, prefix);
        assertThat(result).isFalse();
    }

    @Test
    public void whenNotStartWithPrefixThenTruee() {
        char[] word = {'F', 'i', 'r', 's', 't', 'N', 'a', 'm', 'e'};
        char[] prefix = {'F', 'i', 'r'};
        boolean result = ArrayChar.startWith(word, prefix);
        assertThat(result).isTrue();
    }
}