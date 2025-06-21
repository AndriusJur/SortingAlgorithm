package com.excercise;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {4, 1, 4, 84, 7, 3, 100, 1, 100, 0, 5, 99, 3, 12, 1};
        sort(array);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int indexOfSmallest = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < array[indexOfSmallest]) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp= array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = indexOfSmallestFrom(array, i);
            swap(array, i, minIndex);
            System.out.println(Arrays.toString(array));
        }
    }
}