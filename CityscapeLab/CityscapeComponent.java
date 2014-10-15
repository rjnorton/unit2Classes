import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author Rob Norton
 * @version 10/14/14
 */
public class CityscapeComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Background grass = new Background(400,0,Color.GREEN);
        Background sky = new Background(0,0,Color.BLUE);
        Building buildingOne = new Building(1,12,100);
        Building buildingTwo = new Building(9,6,340);
        Road road = new Road(800,100,580);
        Tree tree = new Tree(350,300,120,40);
        Tree tree2 = new Tree(360,400,200,60);
        Sun sun = new Sun(80,650);
        Car car = new Car(630);
        
        sky.draw(g2);
        grass.draw(g2);
        buildingOne.draw(g2);
        buildingTwo.draw(g2);
        road.draw(g2);
        tree.draw(g2);
        tree2.draw(g2);
        sun.draw(g2);
        car.draw(g2);       
        
    }

}
