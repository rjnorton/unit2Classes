import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
 * Creates a road underneath the bulidings
 * 
 * @author Rob Norton
 * @version 10/7/2014
 */
public class Road
{
    /** The length of the road in pixels */
    private int length;
    
    /** The width of the road in pixels */
    private int width;
    
    /**Where the building and road road meet, in pixels*/
    private int roadTop;

    /**
     * @param    len    length of the road in pixels
     * @param    wid    width of road in pixels
     */
    public Road(int len, int wid, int top)
    {
        this.length = len;
        this.width = wid;
        this.roadTop = top;
    }

    /**
     * Draws a black road with yellow marks down the middle
     */
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double road = new Rectangle2D.Double(0,this.roadTop + 30, this.length, this.width);
        
        int numDashes = this.length/40;
        int widthDashes = this.width/4;
        
        g2.setColor(Color.BLACK);
        g2.draw(road);        
        g2.fill(road);
        
        for(int i=1; i < numDashes; i++)
        {
            Rectangle2D.Double dash = new Rectangle2D.Double(i*40, this.roadTop+(this.width/2)+(widthDashes/2), this.length/40, widthDashes);
            g2.setColor(Color.YELLOW);
            g2.draw(dash);            
            g2.fill(dash);
        }
        
        Rectangle2D.Double topCurb = new Rectangle2D.Double(0, this.roadTop + 25, this.length, 5);
        
        g2.setColor(Color.GRAY);
        g2.draw(topCurb);        
        g2.fill(topCurb);
        
        Rectangle2D.Double topSidewalk = new Rectangle2D.Double(0, this.roadTop, this.length, 15);
        
        g2.draw(topSidewalk);
        g2.fill(topSidewalk);
        
        Rectangle2D.Double botCurb = new Rectangle2D.Double(0, this.roadTop + 30 + this.width, this.length, 5);
        
        g2.draw(botCurb);
        g2.fill(botCurb);
        
        Rectangle2D.Double botSidewalk = new Rectangle2D.Double(0, this.roadTop + 45 + this.width, this.length, 15);
        
        g2.draw(botSidewalk);
        g2.fill(botSidewalk);
    }

}
