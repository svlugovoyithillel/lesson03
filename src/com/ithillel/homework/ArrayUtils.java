package com.ithillel.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtils {

    public static void printObjArray(Object[] objArr) {
        for (int i = 0; i < objArr.length; i++) {
            if (i == objArr.length - 1) {
                System.out.print(objArr[i]);
                System.out.println();
            } else {
                System.out.print(objArr[i] + ", ");

            }
        }
    }

    public static void printIntArray(int[] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            if (i == intArr.length - 1) {
                System.out.print(intArr[i]);
                System.out.println();
            } else {
                System.out.print(intArr[i] + ", ");

            }
        }
    }

    public static int[] sortIntArray(int[] intArr) {
        for (int i = intArr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = temp;
                }
            }
        }
        return intArr;
    }

    public static int[] findMinAndMaxFromIntArray(int[] intArr) {
        int min = 0, max = 0;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] < min) {
                min = intArr[i];
            }
            if (intArr[i] > max) {
                max = intArr[i];
            }
        }
        return new int[]{min, max};

    }

    public static String toOneStringInCamelCase(String[] strArr) {
        int i;
        String s = strArr[0];
        for (i = 1; i < strArr.length; i++) {
            s += strArr[i].substring(0, 1).toUpperCase() + strArr[i].substring(1);
        }
//        for (int i = 0; i < strArr.length; i++) {
//            strArr[i].join(" ");
        return s;
    }

    public static int calculateSumElementsInIntArray(int[] intArr) {
        int summ = 0;
        for (int i = 0; i < intArr.length; i++) {
            summ = intArr[i] + summ;
        }
        return summ;
    }

    public static int[] mergeAndSortTwoIntArray(int[] ints1, int[] ints2) {
        int fullints[] = new int[ints1.length + ints2.length];
        int max = 0;
        System.arraycopy(ints1, 0, fullints, 0, ints1.length);
        System.arraycopy(ints2, 0, fullints, ints1.length, ints2.length);

        for (int i = fullints.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (fullints[j] > fullints[j + 1]) {
                    int temp = fullints[j];
                    fullints[j] = fullints[j + 1];
                    fullints[j + 1] = temp;
                }
            }
        }
        return fullints;
    }

    public static int calculateAbsAverageElementValueInIntArray(int[] intArr) {
        return 0;
        // todo: implement this method
    }

    public static int[] removeElementFromIntArray(int i, int[] ints) {
        int[] thisint = new int [ints.length - 1];
        for (int j = 0; j < thisint.length; j++) {
            if (ints[j] != i) {
                thisint[j] = ints[j];
            } else if (ints[j] == i)
                {   thisint[j] = ints[j+1];}
        }
        return thisint;
    }

    public static int[] generateRandomIntArrayWithSizeMinMax(int size, int min, int max) {
        size = 5; min = 10; max = 100;
        int a  = (int) (10 + Math.random() * 90);
        int b  = (int) (10 + Math.random() * 90);
        int c  = (int) (10 + Math.random() * 90);
        int d  = (int) (10 + Math.random() * 90);
        int e  = (int) (10 + Math.random() * 90);

        return new int[]{a,b,c,d,e};

    }
}
