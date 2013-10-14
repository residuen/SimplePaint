package de.simplepaint.view;
/*
SimplePaint:
A library to enable simple paints of primitives.

Copyright (C) 2013 Karsten Blauel

Dieses Programm ist freie Software. Sie koennen es unter den Bedingungen der GNU General Public License,
wie von der Free Software Foundation veroeffentlicht, weitergeben und/oder modifizieren, entweder gemaess
Version 3 der Lizenz oder (nach Ihrer Option) jeder spaeteren Version.
Die Veroeffentlichung dieses Programms erfolgt in der Hoffnung, dass es Ihnen von Nutzen sein wird, aber
OHNE IRGENDEINE GARANTIE, sogar ohne die implizite Garantie der MARKTREIFE oder der VERWENDBARKEIT FUER
EINEN BESTIMMTEN ZWECK. Details finden Sie in der GNU General Public License.
Sie sollten ein Exemplar der GNU General Public License zusammen mit diesem Programm erhalten haben.
Falls nicht, siehe <http://www.gnu.org/licenses/>.
*/

import java.awt.Color;

import javax.swing.JFrame;


// used sources: http://www.java2s.com/Code/Java/Chart/JFreeChartLineChartDemo1.htm
public class SimplePaintFrame extends JFrame // implements PlotterInterface
{
	private PaintPanel paintPanel; //  = new PaintPanel();
	
	
 	
	public SimplePaintFrame(PaintPanel paintPanel)
	{
		super("SimplePaint");
		
		this.paintPanel = paintPanel;

		// initialise the mainwindow
		initFrame(JFrame.EXIT_ON_CLOSE);
   }

	/**
	 * Init the mainwindow
	 */
	private void initFrame(int closeOp)
	{
		setDefaultCloseOperation(closeOp);
		setBackground(Color.WHITE);
		getContentPane().add(paintPanel);
		setSize(640, 480);
	}
    
    /**
     * Set the mainframe visible
     */
	public void showPaintFrame() {
		
		setVisible(true);
 	}
	
    /**
     * Set the mainframe to invisible
     */
	public void hidePaintFrame() {
		
		setVisible(false);
	}

	/**
	 * return the Chartpanel
	 * @return
	 */
 	public PaintPanel getChartPanel() {
 		
		return paintPanel;
	}
 	
//	private static void printHelp()
//	{
//		System.out.println("XYPlotter: How to use it:\n");
//		System.out.println("java -jar XYPlotter\nnothing will happen, just use it like to see in the examplefiles.\n");
//		System.out.println("java -jar XYPlotter \"2,2;3,7.5;4,3\"\npaints a line between these three points\n");
//		System.out.println("java -jar XYPlotter \"2,2;3,7.5;4,3\" \"2,6;3,5;4,4\"\npaints a line between the first three points and paints 3 points at (2,5) (3,5) and (4,4)");
//	}

}