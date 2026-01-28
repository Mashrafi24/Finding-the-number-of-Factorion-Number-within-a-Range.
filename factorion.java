public class FactorionUtil {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isFactorion(int number) {
        int original = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        return sum == original;
    }

   
    public static void main(String[] args) {
        int[] testNumbers = {1, 2, 145, 40585, 123};

        for (int num : testNumbers) {
            System.out.println(num + " is factorion? " + isFactorion(num));
        }
    }
}
