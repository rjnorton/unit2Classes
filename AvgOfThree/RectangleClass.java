import java.util.Scanner;

public class RectangleClass
{
    public void methodthing()
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("What is the length of the rectangle?: ");
        double length = s.nextDouble();
        
        System.out.print("What is the width of the rectangle?: ");
        double width = s.nextDouble();
        
        double area = length*width;
        double perimeter = 2*(length+width);
        double diagonal = Math.hypot(length,width);
        
        System.out.println("Area: "+area);
        System.out.println("Perimeter: "+perimeter);
        System.out.println("Diagonal: "+diagonal);
    }

}
