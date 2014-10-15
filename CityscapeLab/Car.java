import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Creates a car that moves across the screen
 * 
 * @author Rob Norton
 * @version 10/14/14
 */
public class Car
{
    /** Counts how many times the frame was redrawn, and sets the car to the side accordingly */
    private int move;
    
    /** Top of the car in pixels */
    private int top;

    public Car(int cartop)
    {
        this.move = 0;
        this.top = cartop;
    }

    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double carbody = new Rectangle2D.Double(this.move,this.top,70,50);
        Rectangle2D.Double carhood = new Rectangle2D.Double(this.move+70,this.top+20,30,30);
        
        g2.setColor(Color.RED);
        g2.draw(carbody);
        g2.draw(carhood);
        g2.fill(carbody);
        g2.fill(carhood);
        
        Ellipse2D.Double backOuter = new Ellipse2D.Double(this.move,this.top+40,20,20);
        Ellipse2D.Double frontOuter = new Ellipse2D.Double(this.move+60,this.top+40,20,20);
        
        g2.setColor(Color.BLACK);
        g2.draw(backOuter);
        g2.fill(backOuter);
        g2.draw(frontOuter);
        g2.fill(frontOuter);
        
        Ellipse2D.Double backInner = new Ellipse2D.Double(this.move+5,this.top+45,10,10);
        Ellipse2D.Double frontInner = new Ellipse2D.Double(this.move+65,this.top+45,10,10);
        
        g2.setColor(Color.GRAY);
        g2.draw(backInner);
        g2.fill(backInner);
        g2.draw(frontInner);
        g2.fill(frontInner);
        
        this.move++;
        
        if (this.move > 700)
        {
            this.move = 0;
        }
    }
}
