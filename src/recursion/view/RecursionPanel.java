package recursion.view;

import java.awt.Color;
import recursion.controller.RecursionController;
import javax.swing.*;

public class RecursionPanel extends JPanel
{
	private RecursionController baseController;
	private SpringLayout baseLayout;
	private JButton fibonacciButton;
	private JButton factorialButton;
	private JTextField inputField;
	private JTextArea resultsArea;
	
	public RecursionPanel(RecursionController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		fibonacciButton = new JButton("Get the Fibonacci sequence for this number");
		factorialButton = new JButton("Get n!");
		inputField = new JTextField(20);
		resultsArea = new JTextArea(10, 20);
		
		setupPanel();
		setupLayout();
		setupListeners();
		
		private void setupPanel()
		{
			this.setLayout(baseLayout);
			this.add(fibonacciButton);
			this.add(factorialButton);
			this.add(inputField);
			this.add(resultsArea);
			this.setBackground(Color.MAGENTA);
			resultsArea.setWrapStyleWord(true);
			resultsArea.setLineWrap(true);
		}
		
		private void setupLayout;
	}
}
