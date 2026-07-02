import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {

        Scanner abhi = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = abhi.nextInt();

        System.out.println("Enter second number:");
        int b = abhi.nextInt();

        System.out.println("Enter third number:");
        int c = abhi.nextInt();

        int greatest = (a >= b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("Greatest number is: " + greatest);

        abhi.close();
    }
}