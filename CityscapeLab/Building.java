import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
 * Creates buildings in the cityscape with specified bottom left positions and numbers of floors
 * 
 * @Rob Norton 
 * @10/7/2014
 */
public class Building
{
    /** Top of building in pixels */
    private int topPos;
    
    /** Left of building in pixels */
    private int leftPos;
    
    /** Integer value of number of floors */
    private int numFloors;
    
    /**
     * Creates a building object 
     * 
     * @param   buildingNum     The number of the building (from left to right), used in calculations to
     * set up the left side of the building
     * 
     * @param   floors  The number of floors in the building
     */
    public Building(int buildingNum, int floors, int top)
    {
        // initialise instance variables
        this.topPos = top;
        this.leftPos = buildingNum * 60;
        this.numFloors = floors;
    }

    /**
     * Draws the building with the set coordinates
     */
    public void draw(Graphics2D g2)
    {
       Rectangle2D.Double rect = new Rectangle2D.Double(this.leftPos,this.topPos,140,this.numFloors*40);
       
       g2.setColor(Color.LIGHT_GRAY);
       g2.draw(rect);       
       g2.fill(rect);
       
       for(int i=1; i < this.numFloors; i++)
       {
           Rectangle2D.Double columnOne = new Rectangle2D.Double(this.leftPos + 20,this.topPos + (i*40),20,20);
           g2.setColor(Color.WHITE);
           g2.draw(columnOne);
           g2.fill(columnOne);
       }
       
       for(int i=1; i < this.numFloors; i++)
       {
           Rectangle2D.Double columnTwo = new Rectangle2D.Double(this.leftPos + 60, this.topPos + (i*40),20,20);
           g2.draw(columnTwo);
           g2.fill(columnTwo);        
       }
       
       for (int i=1; i < this.numFloors; i++)
       {
           Rectangle2D.Double columnThree = new Rectangle2D.Double(this.leftPos + 100, this.topPos + (i*40),20,20);
           g2.draw(columnThree);
           g2.fill(columnThree);
       }
    }

}
