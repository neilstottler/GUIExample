package WindowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import java.awt.Button;
import java.awt.Panel;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JDesktopPane;
import javax.swing.JTextPane;
import java.awt.FlowLayout;

public class TestWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestWindow window = new TestWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnPress = new JButton("Press To Start");
		btnPress.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(btnPress, BorderLayout.CENTER);
		
		Panel panel = new Panel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setHgap(70);
		frame.getContentPane().add(panel, BorderLayout.WEST);
		
		Panel panel_1 = new Panel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
		flowLayout_1.setHgap(70);
		frame.getContentPane().add(panel_1, BorderLayout.EAST);
		
		Panel panel_2 = new Panel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_2.getLayout();
		flowLayout_2.setVgap(25);
		frame.getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		Panel panel_3 = new Panel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_3.getLayout();
		flowLayout_3.setVgap(25);
		frame.getContentPane().add(panel_3, BorderLayout.NORTH);
	}

}
