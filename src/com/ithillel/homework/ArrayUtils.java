package ithillel.homework;

import org.apache.commons.lang3.text.WordUtils;

import static java.lang.System.out;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

public class ArrayUtils {

    public static void printObjArray(Object[] objArr) {
        stream(objArr).forEach(out::println);
    }

    public static void printIntArray(int[] intArr) {
        stream(intArr).forEach(out::println);
    }

    public static int[] sortIntArray(int[] intArr) {
        return stream(intArr).sorted().toArray();
    }

    public static int[] findMinAndMaxFromIntArray(int[] intArr) {
        int min = stream(intArr).min().getAsInt();
        int max = stream(intArr).max().getAsInt();
        return new int[]{min, max};
    }

    public static String toOneStringInCamelCase(String[] strArr) {
        //java 8
//        return stream(strArr).map(s -> Character.toTitleCase(s.charAt(0)) + s.substring(1).toLowerCase())
//                .collect(Collectors.joining());

        //apache commons
//        StringBuilder res = new StringBuilder();
//        for (String s : strArr) {
//            res.append(capitalizeFully(s));
//        }
//        return res.toString();

        //java 8 + commons
        return stream(strArr).map(WordUtils::capitalizeFully).collect(joining());
    }

    public static int calculateSumElementsInIntArray(int[] intArr) {
        return stream(intArr).sum();
    }

    public static int[] mergeAndSortTwoIntArray(int[] ints1, int[] ints2) {
        int[] merge = org.apache.commons.lang3.ArrayUtils.addAll(ints1, ints2);
        return stream(merge).sorted().toArray();
    }

    public static int calculateAbsAverageElementValueInIntArray(int[] intArr) {
        return (int) stream(intArr).map(Math::abs).summaryStatistics().getAverage();
    }

    public static int[] removeElementFromIntArray(int i, int[] ints) {
        return stream(ints);
    }

    public static int[] generateRandomIntArrayWithSizeMinMax(int size, int min, int max) {
        return new int[0];
        // todo: implement this method
    }
}
