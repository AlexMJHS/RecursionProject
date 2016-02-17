package recursion.view;

import recursion.controller.RecursionController;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
			resultsArea.setText(baseController.getCalculatedValue());
		}
		
		private void setupLayout()
		{
			
		}
		
		private void setupListeners()
		{
			fibonacciButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent click)
				{
					String userInput = inputField.getText();
					if(checkInput(userInput))
					{
						resultsArea.setText(baseController.doFibonacci(userInput));
					}
				}
			});
			
			factorialButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent click)
				{
					String userInput = inputField.getText();
					if(checkInput(userInput))
					{
						resultsArea.append(baseController.doFactorial(userInput));
					}
				}
			});
		}
		
		private boolean checkInput(String input)
		{
			boolean isNumber = false;
			
			try
			{
				Integer.parseInt(input);
				isNumber = true;
			}
			catch(Exception numberException)
			{
				resultsArea.setText("type in a number!");
			}
			
			return isNumber;
		}
}
