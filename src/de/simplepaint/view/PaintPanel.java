package de.simplepaint.view;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

import de.simplepaint.model.ObjectInterface;


public class PaintPanel extends JPanel {
	
	private ArrayList<ObjectInterface> objectList = null;
	
	public PaintPanel(ArrayList<ObjectInterface> objectList)
	{
		this.objectList = objectList;
		
		setLayout(new GridLayout(1,1));
	}
	
	public void paint(Graphics g)
	{
		super.paintComponents(g);
		
		Graphics2D g2d = (Graphics2D)g;
		
		ObjectInterface object = null;
		
		g2d.clearRect(0,  0,  getWidth(),  getHeight());
		
		for(int i=0; i<objectList.size(); i++)
		{
			object = objectList.get(i);
			
			g2d.setColor(object.getLineColor());
			if(!(object.getLineWidth()==1f)) g2d.setStroke(object.getStroke());
			g2d.draw(object);
			
//			System.out.println(object.toString());
		}
		
		
	}

}
