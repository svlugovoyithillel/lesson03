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
        int[] sortedIntArray = Arrays.copyOf(intArr, intArr.length);
        Arrays.sort(sortedIntArray);
        return sortedIntArray;
    }

    public static int[] findMinAndMaxFromIntArray(int[] intArr) {
        int max = intArr[0];
        int min = intArr[0];
        for (int i = 1; i < intArr.length; i++) {
            if (intArr[i] > max) {
                max = intArr[i];
            }
            if (intArr[i]< min) {
                min = intArr[i];
            }
        }
        return new int[]{min, max};
    }

    public static String toOneStringInCamelCase(String[] strArr) {
       String camelCase = strArr[0];
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
        int[] mergedAndSorted = new int[ints1.length+ints2.length];
        System.arraycopy(ints1, 0, mergedAndSorted,0, ints1.length);
        System.arraycopy(ints2, 0, mergedAndSorted, ints1.length, ints2.length);
        Arrays.sort(mergedAndSorted);
       return mergedAndSorted;
    }

    public static int calculateAbsAverageElementValueInIntArray(int[] intArr) {
        int sum = 0;
        for (int i = 0; i < intArr.length; i++) {
            sum += Math.abs(intArr[i]);
        }
                return  sum/intArr.length;
    }

    public static int[] removeElementFromIntArray(int i, int[] ints) {
        int elAmount = 0;
        for (int j = 0; j < ints.length; j++)
            if (ints[j]==i) {
                elAmount++;
            }
       int[] newInts = new int[ints.length-elAmount];
        for (int j = 0; j < newInts.length; j++) {
            if (ints[j] != i) {
                newInts[j] = ints[j];
            }
            else {
                newInts[j] = ints[j+1];
            }
        }
       return newInts;
    }

    public static int[] generateRandomIntArrayWithSizeMinMax(int size, int min, int max) {
        int[] randArr = new int[size];
        for (int i = 0; i < size; i++) {
            randArr[i] = (int)(Math.random()*(max - min + 1)  + min);
        }
        return randArr;
    }
}
