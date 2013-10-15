package de.simplepaint.view;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import de.simplepaint.model.ObjectInterface;

public class PaintPanel extends JPanel implements MouseListener, MouseMotionListener {
	
	private ArrayList<ObjectInterface> objectList = null;
	
	public PaintPanel(ArrayList<ObjectInterface> objectList)
	{
		this.objectList = objectList;
		
		setLayout(new GridLayout(1,1));
		
		addMouseListener(this);
		addMouseMotionListener(this);
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

	// Mouse-Listener
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	// Mouse-Listener - ENDE

	// Mouse-MotionListener
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	// Mouse-MotionListener - ENDE
	

}
