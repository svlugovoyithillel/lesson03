package com.ithillel.homework;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtils {

    public static void printObjArray(Object[] objArr) {
        System.out.println(Arrays.toString(objArr));
    }

    public static void printIntArray(int[] intArr) {
        System.out.println(Arrays.toString(intArr));
    }

    public static int[] sortIntArray(int[] intArr) {
        int[] intArrSort = intArr;
        Arrays.sort(intArrSort);
        return intArrSort;
    }

    public static int[] findMinAndMaxFromIntArray(int[] intArr) {
        int min = intArr[0];
        int max = intArr[0];
        for (int i = 1; i < intArr.length; i++) {
            min = Math.min(min, intArr[i]);
        }
        for (int i = 1; i < intArr.length; i++) {
            max = Math.max(max, intArr[i]);
        }
        return new int[]{min, max};
    }

    public static String toOneStringInCamelCase(String[] strArr) {
        String stringInCamelCase = strArr[0];
        for (int i = 1; i<strArr.length; i++){
            stringInCamelCase += strArr[i].substring(0,1).toUpperCase() + strArr[i].substring(1);
        }
        return stringInCamelCase;
    }

    public static int calculateSumElementsInIntArray(int[] intArr) {
        int sum = intArr[0];
        for (int i = 1; i < intArr.length; i++) {
            sum += intArr[i];
        }
        return sum;
    }

    public static int[] mergeAndSortTwoIntArray(int[] ints1, int[] ints2) {
        int [] mergeAndSortInt = new int[ints1.length + ints2.length];
        System.arraycopy(ints1, 0, mergeAndSortInt, 0, ints1.length );
        System.arraycopy(ints2, 0, mergeAndSortInt, ints1.length, ints2.length);
        Arrays.sort(mergeAndSortInt);
        return mergeAndSortInt;
    }

    public static int calculateAbsAverageElementValueInIntArray(int[] intArr) {
        int sumAbs = Math.abs(intArr[0]);
        for (int i = 1; i < intArr.length; i++) {
            sumAbs += Math.abs(intArr[i]);
        }
        return sumAbs;
    }

    public static int[] removeElementFromIntArray(int i, int[] ints) {
        int count = 0;
        for (int j = 0; j < ints.length; j++) {
            if (ints[j] == i) {
                count++;
            }
        }
        int[] newArrInt = new int[ints.length - count];
        count = 0;
        for (int j = 0; j < ints.length; j++) {
            if (ints[j] == i) {
                j++;
            }
            if (count == newArrInt.length){
                break;
            }
            newArrInt[count] = ints[j];
            count++;
        }
        return newArrInt;
    }

    public static int[] generateRandomIntArrayWithSizeMinMax(int size, int min, int max) {
        Random random = new Random();
        int[] intGenereted = new int[size];
        for (int i = 0; i < intGenereted.length; i++){
            intGenereted [i] = random.nextInt(max - min) + min;
        }
        return intGenereted;
    }
}
