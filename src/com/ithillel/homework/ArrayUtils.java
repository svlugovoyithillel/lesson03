package com.ithillel.homework;

import java.util.Arrays;

public class ArrayUtils {

    public static void printObjArray(Object[] objArr) {
        System.out.print("[");
        for (int i = 0; i < objArr.length; i++){
            System.out.print(objArr[i] + " ");
        }
        System.out.println("]");
    }

    public static void printIntArray(int[] intArr) {
        System.out.print("[");
        for (int i = 0; i< intArr.length; i++){
            System.out.print(intArr[i] + " ");
        }
        System.out.println("]");
    }

    public static int[] sortIntArray(int[] intArr) {
        return new int[]{1, 2, 3, 4, 5};
        // todo: implement this method
    }

    public static int[] findMinAndMaxFromIntArray(int[] intArr) {
        return new int[]{-1, 1};
        // todo: implement this method
    }

    public static String toOneStringInCamelCase(String[] strArr) {
        return null;
        // todo: implement this method
    }

    public static int calculateSumElementsInIntArray(int[] intArr) {
        return 0;
        // todo: implement this method
    }

    public static int[] mergeAndSortTwoIntArray(int[] ints1, int[] ints2) {
        return new int[0];
        // todo: implement this method
    }

    public static int calculateAbsAverageElementValueInIntArray(int[] intArr) {
        return 0;
        // todo: implement this method
    }

    public static int[] removeElementFromIntArray(int i, int[] ints) {
        return new int[0];
        // todo: implement this method
    }

    public static int[] generateRandomIntArrayWithSizeMinMax(int size, int min, int max) {
        return new int[0];
        // todo: implement this method
    }
}
