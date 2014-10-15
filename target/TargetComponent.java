import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;


public class TargetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Target target1 = new Target(200,200, Color.BLACK, Color.WHITE);
        Target target2 = new Target(80,80, Color.RED, Color.GREEN);
        Target target3 = new Target(140,140, Color.ORANGE, Color.BLUE);
        Target target4 = new Target(80,140, Color.YELLOW, Color.BLUE);
        Target target5 = new Target(80,200, Color.BLACK, Color.RED);
        Target target6 = new Target(140,200, Color.GREEN, Color.MAGENTA);
        Target target7 = new Target(200,140, Color.GREEN, Color.BLUE);
        Target target8 = new Target(200,80, Color.CYAN, Color.MAGENTA);
        Target target9 = new Target(140,80, Color.ORANGE, Color.GREEN);
        Target target10 = new Target(300,300, Color.BLACK, Color.RED, 100);
        Target target11 = new Target(400,400, Color.GREEN, Color.BLUE, 400);
        
        target1.draw(g2);
        target2.draw(g2);
        target3.draw(g2);
        target4.draw(g2);
        target5.draw(g2);
        target6.draw(g2);
        target7.draw(g2);
        target8.draw(g2);
        target9.draw(g2);
        target10.draw(g2);
        target11.draw(g2);
    }

}
