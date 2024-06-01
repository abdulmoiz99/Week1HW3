package Problem5;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Problem5MainTest {

    @Test
    public void testArrayMaxWithPositiveNumbers() {
        int[] arr = {5, -3, 6, 1, 9, 4};
        int result = Main.arrayMax(arr, arr.length - 1);
        assertEquals(9, result);
    }

    @Test
    public void testArrayMaxWithNegativeNumbers() {
        int[] arr = {-5, -3, -6, -1, -9, -4};
        int result = Main.arrayMax(arr, arr.length - 1);
        assertEquals(-1, result);
    }

    @Test
    public void testArrayMaxWithSingleElement() {
        int[] arr = {7};
        int result = Main.arrayMax(arr, arr.length - 1);
        assertEquals(7, result);
    }

    @Test
    public void testArrayMaxWithAllSameElements() {
        int[] arr = {3, 3, 3, 3, 3, 3};
        int result = Main.arrayMax(arr, arr.length - 1);
        assertEquals(3, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayMaxWithEmptyArray() {
        int[] arr = {};
        Main.arrayMax(arr, arr.length - 1);
    }
}