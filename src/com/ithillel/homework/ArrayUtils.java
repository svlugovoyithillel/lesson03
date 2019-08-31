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
        int[] sortedArray = Arrays.copyOf(intArr, intArr.length);

        Arrays.sort(sortedArray);

        return sortedArray;
    }


    public static int[] findMinAndMaxFromIntArray(int[] intArr) {
        int[] minMax = new int[2];
        int[] sortedArray = sortIntArray(intArr);

        minMax[0] = sortedArray[0]; // minimum is the first element in a sorted array
        minMax[1] = sortedArray[sortedArray.length - 1];  // maximum is the last element in a sorted array

        return minMax;
    }


    public static String toOneStringInCamelCase(String[] strArr) {
        int length = strArr.length;
        char[] charSeq = null;
        StringBuilder result = new StringBuilder(strArr[0].toLowerCase());

        for (int i = 0; i < length; i++) {
            if (i != 0 && strArr[i].length() != 0) {            // ignore fist and empty strings
                charSeq = strArr[i].toLowerCase().toCharArray();
                // if a lower case letter make it in upper case according to ASCII
                if (charSeq[0] >= 97 && charSeq[0] <= 122) charSeq[0] -= 32;
                result.append(new String(charSeq));
            }
        }

        return result.toString();
    }


    public static int calculateSumElementsInIntArray(int[] intArr) {
        int sum = 0;

        for (int element : intArr) sum += element;

        return sum;
    }


    public static int[] mergeAndSortTwoIntArray(int[] ints1, int[] ints2) {
        int ints1Length = ints1.length;
        int ints2Length = ints2.length;
        int totalLength = ints1Length + ints2Length;
        int[] mergedArray = new int[totalLength];

        for (int i = 0; i < totalLength; i++) {
            if (i < ints1Length) {
                mergedArray[i] = ints1[i];
            } else {
                mergedArray[i] = ints2[(i - 1) % ints2Length]; // index must start at the beginning of the second array
            }
        }

        Arrays.sort(mergedArray);

        return mergedArray;
    }


    public static int calculateAbsAverageElementValueInIntArray(int[] intArr) {
        int sum = 0;

        for (int element : intArr) sum += Math.abs(element);

        return sum / intArr.length;
    }


    public static int[] removeElementFromIntArray(int i, int[] ints) {

        //ensure element is present in the array
        boolean elementFound = false;
        for (int element : ints)
            if (element == i) {
                elementFound = true;
                break;
            }

        //remove element
        int length = ints.length;
        int[] shortenedArray = elementFound ? new int[length - 1] : new int[length];
        for (int intsIndex = 0, shortenedArrayIndex = 0; intsIndex < length; intsIndex++)
            if (ints[intsIndex] != i) shortenedArray[shortenedArrayIndex++] = ints[intsIndex];

        return shortenedArray;
    }


    public static int[] generateRandomIntArrayWithSizeMinMax(int size, int min, int max) {
        int[] randomArray = new int[size];

        for (int i = 0; i < size; i++) randomArray[i] = min + (int) (Math.random() * ((max - min) + 1));

        return randomArray;
    }
}
