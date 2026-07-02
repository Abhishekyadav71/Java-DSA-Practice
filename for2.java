import java.util.Scanner;

public class for2 {
    public static void main(String[] args) {

        Scanner abhi = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = abhi.nextInt();

        for (int i = 1; i <= x; i++) {
            System.out.println("Abhishek");
        }

        abhi.close();
    }
}