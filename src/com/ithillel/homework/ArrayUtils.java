package com.ithillel.homework;


import sun.plugin.javascript.navig.Array;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayUtils {

    public static void printObjArray(Object[] objArr) {

        System.out.println(Arrays.toString(objArr));

    }

    public static void printIntArray(int[] intArr) {

        System.out.println(Arrays.toString(intArr));

    }

    public static int[] sortIntArray(int[] intArr) {
        Arrays.sort(intArr);
        return intArr;
    }

    public static int[] findMinAndMaxFromIntArray(int[] intArr) {
        Arrays.sort(intArr);
        return new int[]{intArr[0], intArr[intArr.length-1]};


    }

    public static String toOneStringInCamelCase(String[] strArr) {
        String s = "";
        for (int i = 0; i < strArr.length; i++) {
            s += strArr[i].substring(0,1).toUpperCase() + strArr[i].substring(1);
        }
        return s;

    }

    public static int calculateSumElementsInIntArray(int[] intArr) {
        int sum = 0;
        for (int i = 0; i < intArr.length; i++) {
            sum += intArr[i];
        }
        return sum;

    }

    public static int[] mergeAndSortTwoIntArray(int[] ints1, int[] ints2) {
        int[] array = new int[ints1.length + ints2.length];
        System.arraycopy(ints1,0, array,0,ints1.length);
        System.arraycopy(ints2,0,array,ints1.length,ints2.length);
        Arrays.sort(array);

        return array;

    }

    public static int calculateAbsAverageElementValueInIntArray(int[] intArr) {
        int sum = 0;
        for (int i = 0; i < intArr.length; i++) {
            sum+=Math.abs(intArr[i]);
        }
        return sum/intArr.length;

    }

    public static int[] removeElementFromIntArray(int i, int[] ints) {


        int[] newArray = new int[ints.length - 1];
        for (int j = 0; j < newArray.length; j++) {
                if (ints[j]!=i){
                    newArray[j] = ints[j];
                }else  newArray[j] = ints[j+1];
            }

return newArray;


    }




    public static int[] generateRandomIntArrayWithSizeMinMax(int size, int min, int max) {
        int []random = new int[size];
        for (int i = 0; i < random.length; i++) {
            random[i] = ThreadLocalRandom.current().nextInt(min,max + 1);
        }

        return random;
    }
}
