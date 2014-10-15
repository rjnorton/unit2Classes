import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
/**
 * Creates a sun.
 * 
 * @author Rob Norton
 * @version 10/14/14
 */
public class Sun
{
   /** Top of sun in pixels */
    private int top;
    
    /** Left of sun in pixels */
    private int left;
    /**
     * Sets the instance variables equal to parameters
     */
    public Sun(int topPos, int leftPos)
    {
        this.top = topPos;
        this.left = leftPos;
    }

    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double sun = new Ellipse2D.Double(this.left,this.top,90,90);
        
        g2.setColor(Color.YELLOW);
        g2.draw(sun);
        g2.fill(sun);
    }
}
