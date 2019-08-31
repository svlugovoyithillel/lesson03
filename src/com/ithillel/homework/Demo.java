package com.ithillel.homework;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {


        int[] intArr = { 10, 20, 15, 22, 35, -100, 1, 250, 55, -52 };
        String[] strArr = { "HeLLo", "123World", "", "JAVA", "Python", "kotliN", "!@#$%^&*()_+{}:<>?\";:'/.," };


        System.out.println("------------------------------------------------\nPRINT INT ARRAY");
        ArrayUtils.printIntArray(intArr);
//        [10, 20, 15, 22, 35, -100, 1, 250, 55, -52]
        System.out.println("________________________________________________\n");


        System.out.println("------------------------------------------------\nPRINT OBJ ARRAY");
        ArrayUtils.printObjArray(strArr);
//        [hello, world, java, python, kotlin]
        System.out.println("________________________________________________\n");


        System.out.println("------------------------------------------------\nPRINT SORTED ARRAY");
        int[] sortedInts = ArrayUtils.sortIntArray(intArr);
        ArrayUtils.printIntArray(sortedInts);
//        [-100, -52, 1, 10, 15, 20, 22, 35, 55, 250]
        System.out.println("________________________________________________\n");


        System.out.println("------------------------------------------------\nPRINT MIN AND MAX ARRAY");
        int[] minAndMaxInts = ArrayUtils.findMinAndMaxFromIntArray(intArr);
        ArrayUtils.printIntArray(minAndMaxInts);
//        [-100, 250]
        System.out.println("________________________________________________\n");


        System.out.println("------------------------------------------------\nPRINT CAMEL CASE");
        String str = ArrayUtils.toOneStringInCamelCase(strArr);
        System.out.println(str);
//        helloWorldJavaPythonKotlin
        System.out.println("________________________________________________\n");

        System.out.println("------------------------------------------------\nPRINT SUMMED ARRAY");
        int sum = ArrayUtils.calculateSumElementsInIntArray(intArr);
        System.out.println(sum);
//        256
        System.out.println("________________________________________________\n");


        System.out.println("------------------------------------------------\nPRINT ABSOLUTE AVERAGED ARRAY");
        int avg = ArrayUtils.calculateAbsAverageElementValueInIntArray(intArr); // берем абсолютные значения (без учета знака)
        System.out.println(avg);
//        56
        System.out.println("________________________________________________\n");


        System.out.println("------------------------------------------------\nPRINT MERGED ARRAY");
        int[] mergedAndSortedInts = ArrayUtils.mergeAndSortTwoIntArray(new int[]{5, 3, 42, 24}, new int[]{100, 101, 195});
        ArrayUtils.printIntArray(mergedAndSortedInts);
//        [1, 2, 3, 4, 5]
        System.out.println("________________________________________________\n");


        System.out.println("------------------------------------------------\nPRINT UPDATED ARRAY");
        int[] updatedInts = ArrayUtils.removeElementFromIntArray(42, new int[]{1, 42, 3, 5, 54, 24, 11, 100});
        ArrayUtils.printIntArray(updatedInts);
//        [1, 5]
        System.out.println("________________________________________________\n");


        System.out.println("------------------------------------------------\nPRINT RANDOM ARRAY");
        int[] generatedInts = ArrayUtils.generateRandomIntArrayWithSizeMinMax(20, 5, 100);
        ArrayUtils.printIntArray(generatedInts);
//        [11, 33, 45, 99, 70]
        System.out.println("________________________________________________\n");
    }
}
