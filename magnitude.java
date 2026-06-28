import java.util.Scanner;
public class magnitude {
    public static void main (String [] args){
        Scanner abhi = new Scanner(System.in);
        System.out.println("enter a numbers");

        int n = abhi.nextInt();


        if (n > -69 && n < 69) {
            System.out.println("Magnitude is smaller than 69");
        } else {
            System.out.println("Magnitude is not smaller than 69");


        }
        abhi.close();

    }
}


