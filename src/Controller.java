import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import de.simplepaint.model.ObjectInterface;
import de.simplepaint.objects.Line;
import de.simplepaint.view.PaintPanel;
import de.simplepaint.view.SimplePaintFrame;


public class Controller {
	
	private DataModel dataModel = new DataModel();
	
	private PaintPanel paintPanel = new PaintPanel(dataModel.getObjectList());
	
	private SimplePaintFrame simplePaintFrame = null;

	public Controller() {
		
		super();
	}
	
	public Controller(boolean ownFrame) {
		
		super();
		
		if(ownFrame)
			simplePaintFrame = new SimplePaintFrame(paintPanel);
	}


	public DataModel getDataModel() {
		return dataModel;
	}

	public PaintPanel getPaintPanel() {
		return paintPanel;
	}

	public SimplePaintFrame getSimplePaintFrame() {
		
		return simplePaintFrame;
	}
	
	public boolean isSimplePaintFrame() {
		
		return simplePaintFrame!=null;
	}
	
	public void addObject(ObjectInterface object)
	{
		dataModel.getObjectList().add(object);
	}
	
	/**
	 * update data
	 */
	public void updateObject(int i, Object o) {
		
	}
	
	/**
	 * Adds a new value to the function-plot (the red linechart)
	 */
	public void addObject(Object o) {

	}
	
	public void message(final String messageText) {
		
		doMessage(messageText);
	}
	
	private void doMessage(final String messageText) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				JOptionPane.showMessageDialog(null, messageText);
				System.err.println(messageText);
			}
		} );
	}
	

}
