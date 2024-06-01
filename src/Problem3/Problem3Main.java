package Problem3;

public class Problem3Main {

    public static void reverseArray(int[] array) {
        reverseArrayRecursive(array, 0, array.length - 1);
    }

    private static void reverseArrayRecursive(int[] array, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }

        int temp = array[startIndex];
        array[startIndex] = array[endIndex];
        array[endIndex] = temp;

        reverseArrayRecursive(array, startIndex + 1, endIndex - 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 13};
        System.out.println("Before Reverse: " + java.util.Arrays.toString(array));
        reverseArray(array);
        System.out.println("After Reverse: " + java.util.Arrays.toString(array));
    }
}
