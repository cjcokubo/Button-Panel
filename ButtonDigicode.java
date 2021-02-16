package question2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDigicode extends JPanel{
	private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
	private JLabel label;
	private JPanel buttonPanel;

	public ButtonDigicode(){
		// constructor, sets up the GUI
		
		button0 = new JButton("0");
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		
		button0.setAlignmentX(Component.CENTER_ALIGNMENT);
		button1.setAlignmentX(Component.CENTER_ALIGNMENT);
		button2.setAlignmentX(Component.CENTER_ALIGNMENT);
		button3.setAlignmentX(Component.CENTER_ALIGNMENT);
		button4.setAlignmentX(Component.CENTER_ALIGNMENT);
		button5.setAlignmentX(Component.CENTER_ALIGNMENT);
		button6.setAlignmentX(Component.CENTER_ALIGNMENT);
		button7.setAlignmentX(Component.CENTER_ALIGNMENT);
		button8.setAlignmentX(Component.CENTER_ALIGNMENT);
		button9.setAlignmentX(Component.CENTER_ALIGNMENT);

		ButtonListener listener = new ButtonListener();
		button0.addActionListener(listener);
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		button3.addActionListener(listener);
		button4.addActionListener(listener);
		button5.addActionListener(listener);
		button6.addActionListener(listener);
		button7.addActionListener(listener);
		button8.addActionListener(listener);
		button9.addActionListener(listener);

		label = new JLabel("Indicate a number between 0 and 9");

		buttonPanel = new JPanel();
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.PAGE_AXIS));
		buttonPanel.setPreferredSize(new Dimension(200,300));
		buttonPanel.setBackground(Color.blue);
		buttonPanel.add(button0);
		buttonPanel.add(button1);
		buttonPanel.add(button2);
		buttonPanel.add(button3);
		buttonPanel.add(button4);
		buttonPanel.add(button5);
		buttonPanel.add(button6);
		buttonPanel.add(button7);
		buttonPanel.add(button8);
		buttonPanel.add(button9);

		setPreferredSize(new Dimension(350,350));
		setBackground(Color.cyan);
		add(label);
		add(buttonPanel);

	}

	// defining the listener for the buttons

	private class ButtonListener implements ActionListener {
		public void actionPerformed (ActionEvent event){
			JButton button = (JButton) event.getSource();
			String s = button.getText();
			switch(s) {
				case "0": 
					label.setText("0");
					break;
				case "1": 
					label.setText("1");
					break;
				case "2": 
					label.setText("2");
					break;
				case "3": 
					label.setText("3");
					break;
				case "4": 
					label.setText("4");
					break;
				case "5": 
					label.setText("5");
					break;
				case "6": 
					label.setText("6");
					break;
				case "7": 
					label.setText("7");
					break;
				case "8": 
					label.setText("8");
					break;
				case "9": 
					label.setText("9");
					break;
			}
		}
	}
}