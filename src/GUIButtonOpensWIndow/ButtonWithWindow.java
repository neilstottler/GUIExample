package GUIButtonOpensWIndow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonWithWindow {

	public static void main(String[] args) {
		//first button
		JFrame frame = new JFrame("Test");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		JPanel panel = new JPanel();
		frame.add(panel);
		JButton button = new JButton("Click Here");
		panel.add(button);
		
		//listener 
		button.addActionListener(new Action());

	}
	//listener for button then performs action
	static class Action implements ActionListener {
//		button = (JButton)e.getSource();
//		frame.dispose();
		public void actionPerformed (ActionEvent e) {
			//new window with message
			JFrame frame = new JFrame("Clicked");
			frame.setVisible(true);
			frame.setSize(200,200);
			JLabel label = new JLabel("You clicked me!");
			JPanel panel = new JPanel();
			frame.add(panel);
			panel.add(label);


		}
	}
}

