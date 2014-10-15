import java.util.Scanner;

public class StringParsing
{
    public void sampleMethod()
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter an integer between 1,000 and 999,999: ");
        
        long num = s.nextLong();
        
        String numStr = ""+num;
        
        System.out.println(numStr);
        
        
        
    }

}
