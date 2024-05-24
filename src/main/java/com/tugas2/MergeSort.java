package com.tugas2;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] list) { 
        if (list.length > 1) {

            int[] firstHalf = new int[list.length / 2]; 

            System.arraycopy(list, 0, firstHalf, 0, list.length / 2); //runs n times 
            mergeSort(firstHalf); //runs n times 

            int secondHalfLength = list.length - list.length / 2; //runs n times 
            int[] secondHalf = new int[secondHalfLength]; //runs n times 

            System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength); //runs n times 
            mergeSort(secondHalf); //runs n times 

            int[] temp = merge(firstHalf, secondHalf); //runs n times 
            System.arraycopy(temp, 0, list, 0, temp.length); //runs n times 

        }
    }
    private static int[] merge(int[] listl, int[] list2) { 
        int[] temp = new int[listl.length + list2.length]; 
        int current1 = 0; // Current index in listl 
        int current2 = 0; // Current index in list2 
        int current3 = 0; // Current index in temp 
        //Loop the elements 
        while (current1 < listl.length && current2 < list2.length) { 
            //Runs n - 1 
            //Compare the elements in each list and add to the merge list 
            if (listl[current1] < list2[current2]) temp[current3++] = listl[current1++]; 
            else temp[current3++] = list2[current2++]; 
        } 
        //Copy the rest of elements into the list 
        while (current1 < listl.length) temp[current3++] = listl[current1++]; 
        //Copy the rest of elements into the list 
        while (current2 < list2.length) temp[current3++] = list2[current2++]; 
        return temp;
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        mergeSort(arr);
        long endTime = System.nanoTime();
        System.out.println("Array after sorting: " + Arrays.toString(arr));
        
        double timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);

        // get memory used
        Runtime runtime = Runtime.getRuntime();

        double memory = (runtime.totalMemory() - runtime.freeMemory()) / 1024.0;
        System.out.println("Memory used in kilobytes: " + memory);
    }

}
