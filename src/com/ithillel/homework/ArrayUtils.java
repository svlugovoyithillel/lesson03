package com.ithillel.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayUtils {

    public static void printObjArray(Object[] objArr) {
        for (Object x: objArr ) {
            System.out.print(x + " ");
        }
        System.out.println();
        // todo: implement this method
    }

    public static void printIntArray(int[] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }
        System.out.println();
        // todo: implement this method
    }

    public static int[] sortIntArray(int[] intArr) {
        Arrays.sort(intArr);
        return intArr;
        // todo: implement this method
    }

    public static int[] findMinAndMaxFromIntArray(int[] intArr) {
        Arrays.sort(intArr);

        return new int[]{intArr[0], intArr[intArr.length-1]};
        // todo: implement this method
    }

    public static String toOneStringInCamelCase(String[] strArr) {
        StringBuilder oneString = new StringBuilder();
        for (String x: strArr ) {
            String newFormat = (x.substring(0,1)).toUpperCase() + x.substring(1);
            oneString.append(newFormat);
        }
        String newString = oneString.toString();
        return newString;
        // todo: implement this method
    }

    public static int calculateSumElementsInIntArray(int[] intArr) {
        int sum = 0;
        for (int i = 0; i <intArr.length ; i++) {
            sum+=intArr[i];
        }
        return sum;
        // todo: implement this method
    }

    public static int[] mergeAndSortTwoIntArray(int[] ints1, int[] ints2) {


        int [] result = IntStream.concat(Arrays.stream(ints1),Arrays.stream(ints2)).sorted().toArray();
        return result ;
        // todo: implement this method
    }

    public static int calculateAbsAverageElementValueInIntArray(int[] intArr) {
        int sum = 0;
        int result = 0;
        for (int i = 0; i < intArr.length ; i++) {
            sum  += Math.abs(intArr[i]);
        }
        result = sum/intArr.length;
        return result;
        // todo: implement this method
    }

    public static int[] removeElementFromIntArray(int i, int[] ints) {
        ArrayList <Integer>res = (ArrayList) Arrays.asList(ints);
        for (int x: res) {
          if(x==i)
              res.remove(x);
        }
        int[] result = new int[res.size()];

        return null;
        // todo: implement this method
    }

    public static int[] generateRandomIntArrayWithSizeMinMax(int size, int min, int max) {
        return new int[0];
        // todo: implement this method
    }
}
