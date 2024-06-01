package Problem1;

public class Exponential {
    public double power(double x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        Exponential exponent = new Exponential();
        double result = exponent.power(2, 10);
        System.out.println(result);
    }
}
