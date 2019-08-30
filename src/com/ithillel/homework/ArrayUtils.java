package com.ithillel.homework;

import java.util.Random;

public class ArrayUtils {

    public static void printObjArray(Object[] objArr) {

        for (int i = 0; i < objArr.length; i++) {

            System.out.print(objArr[i] + " ");
        }
        System.out.print("\n");
    }
    // todo: implement this method


    public static void printIntArray(int[] intArr) {

        for (int i = 0; i < intArr.length; i++) {

            System.out.print(intArr[i] + " ");
        }
        System.out.print("\n");

        // todo: implement this method
    }

    public static int[] sortIntArray(int[] intArr) {

        int i, j, c;

        System.out.println(" ");
        for (i = 0; i < intArr.length - 1; i++) {
            for (j = intArr.length - 2; j >= i; j--)
                if (intArr[j] > intArr[j + 1]) {
                    c = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = c;
                }
        }

        for (i = 0; i < intArr.length; i++) {

        }
        return intArr;

    }

    // todo: implement this method


    public static int[] findMinAndMaxFromIntArray(int[] intArr) {
        int i = 0;
        int max = 0;
        int min = 0;
        int minPos = 0;
        int maxPos = 0;


        for (; i < intArr.length; i++) {

            if (min > intArr[i]) {
                min = intArr[i];
                minPos = i;
            }
            if (max < intArr[i]) {
                max = intArr[i];
                maxPos = i;
            }
        }

        System.out.println("\n");

        return new int[]{min, max};
        // todo: implement this method
    }

    public static String toOneStringInCamelCase(String[] strArr) {
        String str = strArr [0];
        for (int i = 1; i < strArr.length; i++) {
            str += strArr[i].substring(0, 1).toUpperCase() + strArr[i].substring(1);
        }
        return str;
        // todo: implement this method
    }

    public static int calculateSumElementsInIntArray(int[] intArr) {
        int sum = 0;


        for (int i = 0; i < intArr.length; i++) {
            sum += intArr[i];
        }
        System.out.print("\n");


        return sum;
        // todo: implement this method
    }

    public static int[] mergeAndSortTwoIntArray(int[] a, int[] b) {
        int[] array1and2 = new int[a.length + b.length];
        System.arraycopy(a, 0, array1and2, 0, a.length);
        System.arraycopy(b, 0, array1and2, a.length, b.length);
        int i, j, c;

        for (i = 0; i < array1and2.length; i++) {
            System.out.print(array1and2[i] + " "); // выводим

        }
        System.out.println(" ");
        for (i = 0; i < array1and2.length - 1; i++) {
            for (j = array1and2.length - 2; j >= i; j--)
                if (array1and2[j] > array1and2[j + 1]) {
                    c = array1and2[j];
                    array1and2[j] = array1and2[j + 1];
                    array1and2[j + 1] = c;
                }
            //System.out.print("1" + array1and2[i] + " "); // выводим
        }

        return array1and2;
        // todo: implement this method
    }

    public static int calculateAbsAverageElementValueInIntArray(int[] intArr) {
        int sum = 0;


        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] < 0) {
                intArr[i] = intArr[i] * -1;
            }
            //System.out.print(intArr [i] + " ");


            sum += intArr[i];
        }
        System.out.print("\n");

        return sum / intArr.length;
        // todo: implement this method
    }

    public static int[] removeElementFromIntArray(int i, int[] ints) {
        int  c, Pos;

        for (int j = 0; j < ints.length; j++) {
            //System.out.print(ints [j]);

            if (ints[j] == i) {
                c = ints[j];
                ints[j] = i;
                i = c;
                Pos = j;

               // System.out.print(Pos);

                int[] n = new int[ints.length - 1];
                System.arraycopy(ints, 0, n, 0, Pos);
                System.arraycopy(ints, Pos + 1, n, Pos, ints.length - Pos - 1);

                return n;
            }
        }
            return new int[0];
            // todo: implement this method
        }

        public static int[] generateRandomIntArrayWithSizeMinMax ( int size, int min, int max){
            Random rand = new Random();
            int i;
            int generate[] = new int[size];
            for (i = 0; i < size; i++) {
                generate[i] = rand.nextInt((max) - min); // заполняем массив
            }
            //System.out.print("\n"); // выводим

                return generate;

            // todo: implement this m ethod
        }
    }