package main;
import javax.swing.SwingUtilities;

import animation.Animation;

public class Start
{
    public static void main(String[] args) {
    	SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				new Animation("Aquarium");
			}
    	});
    }
}