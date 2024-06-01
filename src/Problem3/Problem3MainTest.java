package Problem3;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

public class Problem3MainTest {

    @Test
    public void testReverseArrayWithEvenNumberOfElements() {
        int[] array = {1, 3, 5, 7, 9, 13};
        Problem3Main.reverseArray(array);
        int[] expected = {13, 9, 7, 5, 3, 1};
        assertArrayEquals(expected, array);
    }

    @Test
    public void testReverseArrayWithOddNumberOfElements() {
        int[] array = {2, 4, 6, 8, 10};
        Problem3Main.reverseArray(array);
        int[] expected = {10, 8, 6, 4, 2};
        assertArrayEquals(expected, array);
    }

    @Test
    public void testReverseArrayWithSingleElement() {
        int[] array = {1};
        Problem3Main.reverseArray(array);
        int[] expected = {1};
        assertArrayEquals(expected, array);
    }

    @Test
    public void testReverseArrayWithEmptyArray() {
        int[] array = {};
        Problem3Main.reverseArray(array);
        int[] expected = {};
        assertArrayEquals(expected, array);
    }

    @Test
    public void testReverseArrayWithMismatchedExpectedArray() {
        int[] array = {1, 2, 3, 4, 5};
        Problem3Main.reverseArray(array);
        int[] expected = {5, 4, 3, 2};
        try {
            assertArrayEquals(expected, array);
            fail("Expected an error because of different array lengths");
        } catch (AssertionError ignored) {
        }
    }
}