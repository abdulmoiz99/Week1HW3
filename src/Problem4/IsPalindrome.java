package Problem4;

public class IsPalindrome {
    public static void main(String[] args) {
        IsPalindrome checker = new IsPalindrome();
        int number = 121;
        boolean result = checker.isNbrPalindrome(number);
        System.out.println("Is " + number + " a palindrome? " + result);
    }

    public boolean isNbrPalindrome(int num) {
        String str = Integer.toString(num);
        return isPalindromeRecursive(str, 0, str.length() - 1);
    }

    private boolean isPalindromeRecursive(String str, int left, int right) {

        if (left >= right) {
            return true;
        }

        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        return isPalindromeRecursive(str, left + 1, right - 1);
    }
}
