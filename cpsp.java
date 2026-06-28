import java.util.Scanner;

public class cpsp {
    public static void main(String[] args) {
        Scanner abhi = new Scanner(System.in);

        System.out.println("Enter CP");
        double cp = abhi.nextDouble();

        System.out.println("Enter SP");
        double sp = abhi.nextDouble();

        if (sp > cp) {
            double profit = sp - cp;
            double profitPercent = (profit / cp) * 100;

            System.out.println("Profit is " + profit);
            System.out.println("Profit Percentage is " + profitPercent + "%");
        }
        else if (cp > sp) {
            double loss = cp - sp;
            double lossPercent = (loss / cp) * 100;

            System.out.println("Loss is " + loss);
            System.out.println("Loss Percentage is " + lossPercent + "%");
        }
        else {
            System.out.println("No Profit No Loss");
        }

        abhi.close(); // Close Scanner
    }
}