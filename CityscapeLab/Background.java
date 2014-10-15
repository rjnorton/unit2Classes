import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
/**
 * Creates a background rectangle
 * 
 * @author Rob Norton
 * @version 10/14/14
 */
public class Background
{
    /** Top of grass rectangle in pixels */
    private int top;
    
    /** Left of grass rectangle in pixels */
    private int left;
    
    /** Color of background rectangle */
    private Color c;

    /**
     * Sets the instance variables equal to the parameters
     */
    public Background(int up, int side, Color color)
    {
        this.top = up;
        this.left = side;
        this.c = color;        
    }


    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double rect = new Rectangle2D.Double(this.left,this.top,800,400);
        g2.draw(rect);
        g2.setColor(this.c);
        g2.fill(rect);
    }
}
