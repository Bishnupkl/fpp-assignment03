package prob1;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter the base number"));
        double x = sc.nextDouble();
        System.out.println(("Enter the exponent number"));
        int n = sc.nextInt();
        System.out.println(STR."The \{n} Power of \{x} is \{power(x, n)}");


    }

    static double power(double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }
}
