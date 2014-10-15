import java.util.Scanner;

public class PhoneNumber
{
    public void sampleMethod()
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the 10 digit phone number: ");
        long num = s.nextLong();
        
        String numStr = ""+num;
        
        String areaCode = numStr.substring(0,3);
        areaCode = "("+areaCode+")";
        String firstThree = numStr.substring(3,6);
        String lastFour = numStr.substring(6);
        
        String formatted = areaCode+firstThree+"-"+lastFour;
        
        System.out.println(formatted);
    }

}
