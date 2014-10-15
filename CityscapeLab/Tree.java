import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Creates a tree at a speicified location
 * 
 * @author Rob Norton
 * @version 10/14/14
 */
public class Tree
{
    /** Top of tree trunk in pixels (leaves will extend above) */
    private int top;
    
    /** Left of tree trunk in pixels (leaves will be farther left) */
    private int left;
    
    /** Width of tree in pixels */
    private int width;
    
    /** Length of tree in pixels */
    private int length;

    /**
     * Sets the instance variables equal to the parameters
     */
    public Tree(int topPos, int leftPos, int wid, int len)
    {
        this.top = topPos;
        this.left = leftPos;
        this.width = wid;
        this.length = len;
    }


    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double trunk = new Rectangle2D.Double(this.left, this.top, this.length, this.width);
        
        Color brown = new Color(101,67,33);
        g2.setColor(brown);
        g2.draw(trunk);
        g2.fill(trunk);
        

        Ellipse2D.Double leaves = new Ellipse2D.Double(this.left - 20, this.top - 30, this.length + 40, this.width/2);
        
        g2.setColor(Color.GREEN);
        g2.draw(leaves);
        g2.fill(leaves);

    }
}
