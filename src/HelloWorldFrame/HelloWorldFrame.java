package HelloWorldFrame;
import javax.swing.JFrame;
import javax.swing.JLabel;
//http://www.wideskills.com/java-tutorial/java-swing-tutorial

public class HelloWorldFrame extends JFrame {

	public static void main(String args[]) {
		new HelloWorldFrame();
	}
	HelloWorldFrame() {
		JLabel jlbHelloWorld = new JLabel("Hello World");
		add(jlbHelloWorld);
		this.setSize(200, 200);
		// pack();
		setVisible(true);
	}
}
