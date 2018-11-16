package OtherDynamicGUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutChanger implements ActionListener{
  JButton b1;
  JButton b2;
  JButton b3;
  JButton b4;
  JButton b5;
  JButton b6;
  /** This button set the flowlayout on panel2 with left orientation */
  JButton flowLayout;

  /** This button set the Gridlayout of 2,3 grid on panel2 */
  JButton gridLayout;

  /** This button set the Borderlayout on panel2*/
  JButton borderLayout;

  /** 
   * This panel is control panel where we use button to change
   * layout of another panel
   */
  JPanel panel;

  /** This panel contain multiple button from b1 to b6 */
  JPanel panel2;

  JFrame frame;
  public LayoutChanger() {
    //set Default Look and Feel on frame
    JFrame.setDefaultLookAndFeelDecorated(true);

    frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container con = frame.getContentPane();
    con.setLayout(new BorderLayout());

    panel = new JPanel();
    panel2 = new JPanel();
    //This button are used to only showing the layout effect
    b1 = new JButton("HelloButton1");
    b2 = new JButton("HelloButton2");
    b3 = new JButton("HelloButton3");
    b4 = new JButton("HelloButton4");
    b5 = new JButton("HelloButton5");
    b6 = new JButton("HelloButton6");
    // By default panel have layout
    panel2.add(b1);
    panel2.add(b2);
    panel2.add(b3);
    panel2.add(b4);
    panel2.add(b5);
    panel2.add(b6);
    // Layout changer button
    flowLayout = new JButton("FlowLayout");
    gridLayout = new JButton("GridLayout");
    borderLayout = new JButton("BorderLayout");

    //call Action listener on  every layout changer button
    flowLayout.addActionListener(this);
    gridLayout.addActionListener(this);
    borderLayout.addActionListener(this);

    panel.add(flowLayout);
    panel.add(gridLayout);
    panel.add(borderLayout);

    // add layout changer button panel at a top 
    //button panel at the center of container
    con.add(panel, BorderLayout.PAGE_START);
    con.add(panel2, BorderLayout.CENTER);

    frame.setVisible(true);
    frame.pack();

  }

  public void actionPerformed(ActionEvent e) {

    //set the flowlayout on panel2
    if(e.getSource() == flowLayout) {
      FlowLayout flow = new FlowLayout(FlowLayout.LEFT);
      panel2.setLayout(flow);
      panel2.validate();
    }

    //set the gridlayout on panel2
    if(e.getSource() == gridLayout) {
      GridLayout grid = new GridLayout(2,3);
      panel2.setLayout(grid);
      panel2.validate();
    }
    //set the gridlayout but the problem if we don't set the constraint
    //all button are set on center. So you remove the all button from panel
    //Then set grid layout on panel and add them with constraints.
    if(e.getSource() == borderLayout) {
      panel2.remove(b1);
      panel2.remove(b2);
      panel2.remove(b3);
      panel2.remove(b4);
      panel2.remove(b5);
      panel2.remove(b6);

      BorderLayout border = new BorderLayout();
      panel2.setLayout(border);

      panel2.add(b1,BorderLayout.NORTH);
      panel2.add(b2,BorderLayout.SOUTH);
      panel2.add(b3,BorderLayout.EAST);
      panel2.add(b4,BorderLayout.WEST);
      panel2.add(b5,BorderLayout.CENTER);
      panel2.add(b6,BorderLayout.BEFORE_FIRST_LINE);

      panel2.validate();
    }
  }
  public static void main(String args[]) {
    new LayoutChanger();
  }
}