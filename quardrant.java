import java.util.Scanner;
public class quardrant {
    public static void main(String[] args) {
    
        Scanner abhi = new Scanner(System.in);

        System.out.println("enter  x  cordinate");
        int x = abhi.nextInt();

        System.out.println("enter y cordinate");
        int y = abhi.nextInt();

        if (x == 0 && y == 0){
            System.out.println("point on x axis");
        }

            else if (x == 0){
                System.out.println("point on y axis");
            }
         
            else if(y == 0){
                System.out.println("point on y axis");
            }

            else if(x>0 && y>0){
                System.out.println("point is oon 1st quard");
            }

            else if(x<0 && y>0){
                System.out.println("point on 2nd quard");
            }

            else if(x>0 && y<0){
                System.out.println("point on 3rd quard");
            }

            else{
                System.out.println("point on 4th quard");
            }
        
            abhi.close();


    }

}
