import java.util.Scanner;
public class prority {
    public static void main(String[]args){
        Scanner abhi=new Scanner(System.in);

        System.out.println("enter number");
        int n = abhi.nextInt();
        if (n%5==0 && n%3 == 0)
            System.out.println("abhishek");

        else if (n%3 == 0)
            System.out.println("kunal");

        else if (n%5 == 0)
            System.out.println("chotu");
        
        else 
            System.out.println("yadav");

    abhi.close();
}

}

    


