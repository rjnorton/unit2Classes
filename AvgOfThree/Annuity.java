import java.util.Scanner;

public class Annuity
{
    public void annuity()
    {
        Scanner s = new Scanner(System.in);
        double i, n, pmt;
        System.out.print("What is the annual rate?(decimal form): ");
        i = s.nextDouble();
        System.out.print("How many payments will there be?: ");
        n = s.nextDouble();
        System.out.print("What is the initial amount put in?: ");
        pmt = s.nextDouble();
        
        double annuity = ((Math.pow((1+i),(n-1)))-1);
        annuity = annuity / i;
        annuity = annuity/(Math.pow((1+i),(n-1)));
        annuity++;
        annuity = annuity * pmt;
        System.out.println(annuity);
    }

}
