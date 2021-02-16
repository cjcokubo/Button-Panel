package question2;

import javax.swing.JFrame;

public class PanelwithButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame ("Button  Frame");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new ButtonDigicode());

		frame.pack();
		frame.setVisible(true); 
	}

}
