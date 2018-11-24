package aquarium;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import aquarium.items.AquariumItem;

public class Aquarium extends JPanel
{
	static int NB_STONES, NB_SEAWEED;
	
    private ArrayList<AquariumItem> items = new ArrayList<AquariumItem>();

    Aquarium()
    {

    }

    public void fill(AquariumItem item)
    {
        this.items.add(item);
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        for(int i = 0; i < items.size(); i++)
        {
            items.get(i).draw(g);
        }
    }
}