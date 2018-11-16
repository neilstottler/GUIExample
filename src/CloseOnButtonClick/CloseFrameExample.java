package CloseOnButtonClick;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CloseFrameExample implements ActionListener
{
	
	JButton button;
	JFrame frame;
	
     public void createUI()
      {         
		frame = new JFrame("Copy Frame Data To File Example");
		frame.setLayout(null);
		frame.setSize(400,300);

		Container pane =frame.getContentPane();
		pane.setLayout(null);
		Insets insets = pane.getInsets();
		Dimension size;

		JPanel p = new JPanel();        

		p = new JPanel();
		pane.add(p);
		button = new JButton("Close Frame");
		button.addActionListener(this);
		p.add(button);
		size = p.getPreferredSize();
		p.setBounds(150 + insets.left, 100 + insets.top,
		size.width, size.height);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

      }// createUI() closed

  public void actionPerformed(ActionEvent e)
	{
		button = (JButton)e.getSource();		
		frame.dispose();		
		System.out.println("Frame Closed.");		
	}
  
  public static void main(String args[])
        {
            CloseFrameExample cfe = new CloseFrameExample();
            cfe.createUI();
        }// main() closed

}// class closed