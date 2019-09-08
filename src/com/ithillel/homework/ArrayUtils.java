package com.ithillel.homework;

import java.util.Arrays;

public class ArrayUtils {

    public static void printObjArray(Object[] objArr) {
        for (int i = 0; i < objArr.length; i++) {
            System.out.print(objArr[i] + ", ");
        }
        System.out.print("\n");

    }

    public static void printIntArray(int[] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + ", ");
        }
        System.out.print("\n");
    }

    public static int[] sortIntArray(int[] intArr) {
        int Arr2[] = Arrays.copyOf(intArr, intArr.length);
        Arrays.sort(Arr2);
        return Arr2;
    }

    public static int[] findMinAndMaxFromIntArray(int[] intArr) {
        int Arr3[] = Arrays.copyOf(intArr, intArr.length);
        int minimum;
        int maximum;
        minimum = maximum = Arr3[0];
        for (int j = 0; j < Arr3.length; j++) {
            if (Arr3[j] < minimum)
                minimum = Arr3[j];
            if (Arr3[j] > maximum)
                maximum = Arr3[j];
        }
        return new int[]{minimum, maximum};
    }

    public static String toOneStringInCamelCase(String[] strArr) {
        String stringInCamel = strArr[0];
        for (int i = 1; i < strArr.length; i++) {
            stringInCamel += strArr[i].substring(0, 1).toUpperCase() + strArr[i].substring(1);
        }
        return stringInCamel;
    }

    public static int calculateSumElementsInIntArray(int[] intArr) {
        int total = 0;
        for (int i = 0; i < intArr.length; i++) {
            total += intArr[i];
        }
        return total;
    }

    public static int[] mergeAndSortTwoIntArray(int[] ints1, int[] ints2) {
        int[] newArr = new int[ints1.length + ints2.length];
        System.arraycopy(ints1, 0, newArr, 0, ints1.length);
        System.arraycopy(ints2, 0, newArr, ints1.length, ints2.length);
        Arrays.sort(newArr);
        return newArr;
    }

    public static int calculateAbsAverageElementValueInIntArray(int[] intArr) {
        int avg = 0;
        int sum = 0;
        int newintArr[] = Arrays.copyOf(intArr, intArr.length);

        for (int i = 0; i < newintArr.length; i++) {
            newintArr[i] = Math.abs(newintArr[i]);
        }
        for (int j = 0; j < newintArr.length; j++) {
            sum += newintArr[j];
        }
        avg = sum / newintArr.length;
        return avg;
    }

    public static int[] removeElementFromIntArray(int i, int[] ints) {
        int[] updatedInts = new int[ints.length - 1];
        for (int j = 0; j < ints.length; j++) {
            if (ints[j] == i) {
                System.arraycopy(ints, 0, updatedInts, 0, j);
                System.arraycopy(ints, j + 1, updatedInts, j, ints.length - j - 1);
            }
        }
        return updatedInts;
    }

    public static int[] generateRandomIntArrayWithSizeMinMax(int size, int min, int max) {
        int Arr[] = new int[size];
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = (int) ((Math.random() * (max - min)) + min);
        }
        return Arr;
    }
}