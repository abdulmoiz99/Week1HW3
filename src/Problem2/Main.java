package Problem2;

public class Main {
    public static void main(String[] args) {
        System.out.println(minimumString("akel"));
    }

    public static char minimumString(String s) {
        if (s.length() == 1) return s.charAt(0);

        char minChar = minimumString(s.substring(1));

        if (s.charAt(0) < minChar)
            return s.charAt(0);
        else return minChar;
    }
}
