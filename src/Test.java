import javax.swing.JFrame;

import de.simplepaint.objects.Circle;
import de.simplepaint.objects.Path;
import de.simplepaint.objects.Rectangle;
import de.simplepaint.objects.Line;


public class Test {
	
	public Test()
	{
		Controller c = new Controller();
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(640, 480);
		frame.add(c.getPaintPanel());
		frame.setVisible(true);
		
//		c.getSimplePaintFrame().showPaintFrame();
		
		Line line = new Line(0, 0, 100, 100);			// Eine Linie
		Rectangle rect = new Rectangle(0, 0, 35, 55);// Ein Rechteck
		Circle circle = new Circle(0, 0, 150, 150);	// Ein Kreis
		Path path = new Path(0, 0, 50, 100);			// Ein Pfad
		
		line.moveObjectAbsolute(10, 10);
		line.moveObjectRelative(100, 0);
		
		rect.moveObjectAbsolute(10, 100);
		
		circle.moveObjectAbsolute(400, 100);
		
		path.addPoint(150, 25);
		path.moveObjectAbsolute(150, 300);

		c.addObject(line);
		c.addObject(rect);
		c.addObject(circle);
		c.addObject(path);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		new Test();
		
	}

}
