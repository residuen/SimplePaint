package de.simplepaint.objects;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import de.simplepaint.model.ObjectInterface;
import de.simplepaint.model.PaintConstants;
 
public class Line extends Line2D.Double implements ObjectInterface {

	private Color lineColor = Color.black;
	private Color fillColor = Color.white;
	
	private float lineWidth = 1.0f;
	
	private int typ = PaintConstants.LINE_OBJECT;
	
	private BasicStroke stroke = new BasicStroke(lineWidth);
	
	public BasicStroke getStroke() {
		return stroke;
	}

	public Line() {
		super();
	}

	public Line(double arg0, double arg1, double arg2, double arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public Line(Point2D arg0, Point2D arg1) {
		super(arg0, arg1);
	}
	
	public void movePoint(int n, double x, double y)
	{
		if(n==1)
			setLine(x, y, getX2(), getY2());
		else
			if(n==2)
				setLine(getX1(), getY1(), x, y);
	}

	@Override
	public void moveObjectAbsolute(double x, double y) {
		setLine(x, y, getBounds2D().getWidth() + x, getBounds2D().getHeight() + y);
	}

	@Override
	public void moveObjectRelative(double x, double y) {
		setLine(getX1() + x, getY1() + y, getX2() + x, getY2() + y);
		
	}

	
	public void setLineColor(Color color)
	{
		this.lineColor = color;
	}

	public Shape getShape() { return null; }
	
	
	
	@Override
	public int getTyp() {

		return typ;
	}

	@Override
	public Color getLineColor() {

		return lineColor;
	}

	@Override
	public Color getFillColor() {

		return fillColor;
	}

	@Override
	public float getLineWidth() {
		// TODO Auto-generated method stub
		return lineWidth;
	}

	@Override
	public void addPoint(double x, double y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePoint(int n) {
		// TODO Auto-generated method stub
		
	}

}
