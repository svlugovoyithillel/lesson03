package com.ithillel.homework;

import java.util.Arrays;

public class ArrayUtils {

    public static void printObjArray(Object[] objArr) {
        System.out.println(Arrays.toString(objArr));
    }

    public static void printIntArray(int[] intArr) {
        System.out.println(Arrays.toString(intArr));
    }

    public static int[] sortIntArray(int[] intArr) {
        int[] sortedIntArr =  Arrays.copyOf(intArr, intArr.length);
        Arrays.sort(sortedIntArr);
        return sortedIntArr;
    }

    public static int[] findMinAndMaxFromIntArray(int[] intArr) {
        int min = intArr[0];
        int max = intArr[0];
        for (int i = 1; i < intArr.length; i++) {
            if (intArr[i] > max) { max = intArr[i]; }
            if (intArr[i] < min) { min = intArr[i]; }
        }
        return new int[]{min, max};
    }

    public static String toOneStringInCamelCase(String[] strArr) {
        String camelCase = strArr[0].substring(0).toLowerCase();
        for (int i = 1; i < strArr.length; i++) {
            camelCase += strArr[i].substring(0, 1).toUpperCase() + strArr[i].substring(1).toLowerCase();
        }
        return camelCase;
    }

    public static int calculateSumElementsInIntArray(int[] intArr) {
        int sum = 0;
        for (int i = 0; i < intArr.length; i++) {
            sum += intArr[i];
        }
        return sum;
    }

    public static int[] mergeAndSortTwoIntArray(int[] ints1, int[] ints2) {
        int[] newArr = new int[ints1.length+ints2.length];
        System.arraycopy(ints1, 0, newArr, 0, ints1.length);
        System.arraycopy(ints2, 0, newArr, ints1.length, ints2.length);
        Arrays.sort(newArr);
        return newArr;
    }

    public static int calculateAbsAverageElementValueInIntArray(int[] intArr) {
        int absAver = 0;
        for (int i = 0; i < intArr.length; i++) {
            absAver += Math.abs(intArr[i]);
        }
        return absAver / intArr.length;
    }

    public static int[] removeElementFromIntArray(int i, int[] ints) {
        int counter1 = 0;
        for (int j = 0; j < ints.length; j++) {
            if (ints[j] == i) {
                counter1++;
            }
        }
            int[] newArr = new int[ints.length - counter1];
            int counter2 = 0;
            for (int k = 0; k < newArr.length; k++) {
                if (ints[k] != i) {
                    newArr[k] = ints[k + counter2];
                }
                else {
                    counter2++;
                    newArr[k] = ints[k + counter2];
                }
            }
        return newArr;
        }

    public static int[] generateRandomIntArrayWithSizeMinMax(int size, int min, int max) {
        int[] randArr = new int[size];
        for (int i = 0; i < randArr.length; i++) {
            randArr[i] =(int) (Math.random() * (max - min + 1)) + min;
        }
        return randArr;
    }
}
