package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortA() {
        int[] data = new int[]{2, 10, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{2, 5, 10};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortB() {
        int[] data = new int[]{2, 10, 5, 6, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{2, 5, 6, 8, 10};
        assertThat(result).containsExactly(expected);
    }


}