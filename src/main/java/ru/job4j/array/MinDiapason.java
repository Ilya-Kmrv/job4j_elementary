package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        if (array == null || array.length == 0) {
            System.out.println("Массив нулевой длинны");
            return 0;
        }

        if (start<0 || finish >= array.length){
            System.out.println("вне предела массива");
            return 0;
        }

        int min = array[start];
               for (int i = start; i <= finish; i++) {
                   if (array[i] < min) {
                       min = array[i];
                   }
               }
        return min;
    }
}