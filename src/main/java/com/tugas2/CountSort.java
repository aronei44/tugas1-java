package com.tugas2;

import java.util.Arrays;

public class CountSort {

    public static void countingSort(int[] array) {
        if (array == null || array.length == 0)
            return;

        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        int range = max - min + 1;

        int[] count = new int[range];
        int[] output = new int[array.length];

        // Store the count of each element in count array
        for (int value : array) {
            count[value - min]++;
        }

        // Modify the count array to store the sum of previous counts
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = array.length - 1; i >= 0; i--) {
            output[count[array[i] - min] - 1] = array[i];
            count[array[i] - min]--;
        }


        // Copy the sorted elements into original array
        System.arraycopy(output, 0, array, 0, array.length);
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        countingSort(arr);
        long endTime = System.nanoTime();
        System.out.println("Array after sorting: " + Arrays.toString(arr));

        double timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);

        // get memory used
        Runtime runtime = Runtime.getRuntime();

        double memory = (runtime.totalMemory() - runtime.freeMemory())/1024.0;
        System.out.println("Memory used in kilobytes: " + memory);
    }
}
