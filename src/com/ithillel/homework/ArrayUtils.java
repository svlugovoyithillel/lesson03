package com.ithillel.homework;

import java.util.Arrays;

public class ArrayUtils {

    public static void printObjArray(Object[] objArr) {
        System.out.println(Arrays.toString(objArr));
        // todo: implement this method
    }

    public static void printIntArray(int[] intArr) {
        System.out.println(Arrays.toString(intArr));
        // todo: implement this method
    }

    public static int[] sortIntArray(int[] intArr) {
        //bubble sort
        for (int i = intArr.length-1; i >0 ; i--) {
            for (int j = 0; j < i; j++) {
                if(intArr[j] > intArr[j+1]){
                    int tmp = intArr[j];
                    intArr[j] = intArr[j+1];
                    intArr[j+1] = tmp;
                }
            }
        }
        return intArr;
        // todo: implement this method
    }

    public static int[] findMinAndMaxFromIntArray(int[] intArr) {
        int tmpMax = intArr[0];
        int tmpMin = intArr[0];
        //loop enumeration of values and replace tmp
        for (int i =0; i < intArr.length; i++) {
            //find max value and replace tmp
            if(intArr[i] > tmpMax){
                tmpMax = intArr[i];
            }
            //find min value and replace tmp
            if(intArr[i] < tmpMin){
                tmpMin = intArr[i];
            }
        }
        return new int[]{tmpMin, tmpMax};
        // todo: implement this method
    }

    public static String toOneStringInCamelCase(String[] strArr) {
        String strArrAll = strArr[0];
        //loop and use camel style
        for (int i = 1; i < strArr.length; i++) {
            strArrAll += strArr[i].substring(0, 1).toUpperCase()+strArr[i].substring(1);
        }
        return strArrAll;
        // todo: implement this method
    }

    public static int calculateSumElementsInIntArray(int[] intArr) {
        int sum =0;
        //sum all values
        for (int i : intArr) {
            sum += i;
        }
        return sum;
        // todo: implement this method
    }

    public static int[] mergeAndSortTwoIntArray(int[] ints1, int[] ints2) {
        int[] newArr = new int[ints1.length+ints2.length];
        //arrays merge
        System.arraycopy(ints1,0, newArr, 0, ints1.length);
        System.arraycopy(ints2,0, newArr, ints1.length, ints2.length);
        return sortIntArray(newArr);
        // todo: implement this method
    }

    public static int calculateAbsAverageElementValueInIntArray(int[] intArr) {
        int sum =0;
        //sum all ABS values
        for (int i : intArr) {
            sum += Math.abs(i);
        }
        return sum/intArr.length;
        // todo: implement this method
    }

    public static int[] removeElementFromIntArray(int i, int[] ints) {
        int cuntSize =0;
        for (int j = 0; j < ints.length; j++) {
            if(ints[j] != i){
                cuntSize ++;
            }
        }

        for (int k = ints.length-1; k >0 ; k--) {
            for (int j = 0; j < k; j++) {
                if(ints[j] == i ){
                    int tmp = ints[j];
                    ints[j] = ints[j+1];
                    ints[j+1] = tmp;
                }
            }
        }
        int[] newArr = Arrays.copyOf(ints, cuntSize);
        return newArr;
        // todo: implement this method
    }

    public static int[] generateRandomIntArrayWithSizeMinMax(int size, int min, int max) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < randomNumbers.length; i++) {
            max -= min;//for multyply Math.random
            randomNumbers[i] = (int) (Math.random() * ++max) + min;
        }
        return randomNumbers;
        // todo: implement this method
    }
}
