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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class TestWindow {

	private JFrame frame;
	private final Action action = new Exit();
	private final Action startGame = new startGame();

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
		
		Panel panel_4 = new Panel();
		frame.getContentPane().add(panel_4, BorderLayout.CENTER);
		
		//makes button for Start Game
		JButton btnNewButton_1 = new JButton("Start Game");
		btnNewButton_1.setAction(startGame);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnNewButton_1);
		
		//makes button for Exit
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setAction(action);
		panel_4.add(btnNewButton_2);
	}

	//what buttons do
	
	//Exit Button
	private class Exit extends AbstractAction {
		public Exit() {
			putValue(NAME, "Exit");
			putValue(SHORT_DESCRIPTION, "Exit Launcher");
		}
		//code for thing to do
		public void actionPerformed(ActionEvent e) {
			frame.dispose();
		}
	}
	
	//Start Game Button
	private class startGame extends AbstractAction {
		public startGame() {
			putValue(NAME, "Start Game");
			putValue(SHORT_DESCRIPTION, "Start casino Game");
		}
		//code for thing to do
		public void actionPerformed(ActionEvent e) {
		}
	}
}
