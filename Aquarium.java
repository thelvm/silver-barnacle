import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Aquarium extends JPanel
{
    private List<AquariumItem> items = new List<AquariumItem>();

    Aquarium()
    {}

    public fill(AquariumItem item)
    {
        this.items.add(item);
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        for(int i = 0; i < items.size(); i++)
        {
            items.elementAt(i).draw(g);
        }
    }
}

abstract class AquariumItem
{
    protected Point position;
    protected int width;
    protected int height;

    AquariumItem(int width)
    {
        this.width = width;
        this.height = width / 3;
    }

    public void setPosition(Point p)
    {
        this.position = p;
    }

    public Rectangle rectangle()
    {
        return new Rectangle(this.position.x, this.position.y, this.width, this.height);
    }

    public abstract void draw (Graphics g);

    public boolean intersects(Collection<AquariumItem> c)
    {
        for (AquariumItem a : c) {
            if (a.rectangle().intersects(this.rectangle()))
            {
                return true;
            }
        }
        return false;
    }
}

class Stone extends AquariumItem
{
    Stone(int width)
    {
        super(width);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.gray);
        // Different from the "consigne" but looks better
        g.fillOval(this.position.x, this.position.y, this.width, this.height);
    }
}

// TODO Create Seaweed implementing AquariumItem
