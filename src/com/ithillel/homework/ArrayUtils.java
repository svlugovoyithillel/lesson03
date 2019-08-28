package com.ithillel.homework;

        import java.util.Arrays;

public class ArrayUtils {

    public static void printObjArray(Object[] objArr) {
        System.out.println(Arrays.toString(objArr));
        // todo: 1 method
    }

    public static void printIntArray(int[] intArr) {
        System.out.println(Arrays.toString(intArr));
        // todo: 2 method
    }

    public static int[] sortIntArray(int[] intArr) {
        Arrays.sort(intArr);
        return intArr;
        // todo: 3 method
    }

    public static int[] findMinAndMaxFromIntArray(int[] intArr) {
        Arrays.sort(intArr);
        int min = intArr[0];
        int max = intArr[intArr.length - 1];

        return new int[]{min, max};
        // todo: 4 method
    }

    public static String toOneStringInCamelCase(String[] strArr) {
        String str = strArr[0];
        for (int i = 1; i < strArr.length; i++) {
            str += strArr[i].substring(0, 1).toUpperCase() + strArr[i].substring(1);
        }
        return str;
        // todo: 5 method
    }

    public static int calculateSumElementsInIntArray(int[] intArr) {
        int sum = 0;
        for (int i : intArr) {
            sum += i;
        }
        return sum;
        // todo: 6 method

    }

    public static int[] mergeAndSortTwoIntArray(int[] ints1, int[] ints2) {

        int[] mergedAndSortedInts = new int[ints1.length + ints2.length];

        System.arraycopy(ints1, 0, mergedAndSortedInts, 0, ints1.length);
        System.arraycopy(ints2, 0, mergedAndSortedInts, ints1.length, ints2.length);
        Arrays.sort(mergedAndSortedInts);

        return mergedAndSortedInts;
        // todo: 7 method

    }

    public static int calculateAbsAverageElementValueInIntArray(int[] intArr) {
        int sum = 0;
        for (int i : intArr) {
            sum += Math.abs(i);
        }
        int avg = sum / intArr.length;
        return avg;
        // todo: 8 method

    }

    public static int[] removeElementFromIntArray(int i, int[] ints) {
        int[] updatedInts = new int[ints.length - 1];
        int index = 1;
        System.arraycopy(ints, 0, updatedInts, 0, index);
        System.arraycopy(ints, index + 1, updatedInts, index, ints.length - index - 1);

        return updatedInts;
        // todo: 9 method

    }

    public static int[] generateRandomIntArrayWithSizeMinMax(int size, int min, int max) {

        int[] generatedInt = new int[5];
        for (int i = 0; i < generatedInt.length; i++) {
            generatedInt[i] = 10 + (int) (Math.random() * 90);
        }
        return generatedInt;

        // todo: 10 method

    }

}
