package Problem5;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, -3, 6, 1, 9, 4};
        System.out.println(arrayMax(arr, arr.length - 1));
    }

    public static int arrayMax(int[] arr, int index) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        if (index == 0) return arr[0];

        int max = arrayMax(arr, index - 1);

        return (max > arr[index]) ? max : arr[index];
    }
}
