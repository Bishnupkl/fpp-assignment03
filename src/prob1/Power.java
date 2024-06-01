package prob1;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(("Enter the base number: "));
        double x = sc.nextDouble();
        System.out.print(("Enter the exponent number:"));
        int n = sc.nextInt();
        System.out.println(STR."The \{n} Power of \{x} is \{power(x, n)}");
    }

    static double power(double x, int n) {
        if (n < 0) return Math.pow(x, n);
        if (n == 0) {
            return 1;
        } else {  // Negative power case
            if (x == 0) {  // Handle division by zero for negative base and exponent
                throw new ArithmeticException("Cannot raise zero to a negative power");
            }
            return 1.0 / power(x, -n);
        }
    }
}