package recursion.view;

import javax.swing.*;

public class RecursionFrame extends JFrame
{
	private RecursionPanel basePanel;
	private RecursionController baseCo
	
	public RecursionFrame(RecursionController baseController)
	{
		this.baseController = baseController;
		basePanel = new RecursionPanel(baseController)
	}
}
