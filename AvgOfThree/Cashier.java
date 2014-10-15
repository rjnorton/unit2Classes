import java.util.Scanner;
public class Cashier
{
    public void sampleMethod()
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("What is the amount due?(in pennies): ");
        int due = s.nextInt();
        
        System.out.print("What is the amount recieved?(in pennies): ");
        int recieved = s.nextInt();
        
        int change = recieved - due;
        int dollars = change/100;
        int quarters = (change - (dollars*100))/25;
        int dimes = (change - (quarters*25) - (dollars*100))/10;
        int nickels = (change - (quarters*25) - (dimes*10) - (dollars*100))/5;
        int pennies = (change - (dollars*100) - (quarters*25) - (dimes*10) - (nickels*5));
        
        
        System.out.println("Dollars: "+dollars);
        System.out.println("Quarters: "+quarters);
        System.out.println("Dimes: "+dimes);
        System.out.println("Nickels: "+nickels);
        System.out.println("Pennies: "+change);
        
    }

}
