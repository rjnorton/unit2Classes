import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Target
{
    private int xLeft;
    private int yTop;
    private Color c1;
    private Color c2;
    private int size;
    
    public Target(int x, int y, Color color1, Color color2)
    {
        this.yTop = y;
        this.xLeft = x;
        this.c1 = color1;
        this.c2 = color2;
        this.size = 60;
    }
    public Target(int x, int y, Color color1, Color color2, int circleSize)
    {
        this.yTop = y;
        this.xLeft = x;
        this.c1 = color1;
        this.c2 = color2;
        this.size = circleSize;
    }

    public void draw(Graphics2D g2)
    {
        int num = this.size/10;
        int count = 0;
        for(int i=1; i<num; i++)
        {
            Ellipse2D.Double circle = new Ellipse2D.Double(this.xLeft + (5*count), this.yTop + (5*count), this.size - (10*count), this.size - (10*count));
            
            g2.draw(circle);
            if ((count % 2) == 0){g2.setColor(c1);}
            else{g2.setColor(c2);}
            g2.fill(circle);
            count++;
        }
    }

}
