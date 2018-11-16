package ButtonChangesLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

/** @see http://stackoverflow.com/questions/5750068 */
public class DynamicLayout extends JPanel {

    private static final LayoutManager H = new GridLayout(1, 0);
    private static final LayoutManager V = new GridLayout(0, 1);

    //set box width and height
    public DynamicLayout() {
        this.setLayout(H);
        this.setPreferredSize(new Dimension(320, 340));
        
        //tempoary labels for showing prupose
        for (int i = 0; i < 3; i++) {
            this.add(new JLabel("Label " + String.valueOf(i), JLabel.CENTER));
        }
    }

    //this changes display 
    private void display() {
        JFrame f = new JFrame("DynamicLayout");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(this);
        JPanel p = new JPanel();
        
        //add horizontal button
        p.add(new JButton(new AbstractAction("Horizontal") {

        	//set box to horizontal mode
            @Override
            public void actionPerformed(ActionEvent e) {
                DynamicLayout.this.setLayout(H);
                DynamicLayout.this.validate();
            }
        }));
        //add vertical button
        p.add(new JButton(new AbstractAction("Vertical") {

        	//set box to vertical mode
            @Override
            public void actionPerformed(ActionEvent e) {
                DynamicLayout.this.setLayout(V);
                DynamicLayout.this.validate();
            }
        }));
        f.add(p, BorderLayout.SOUTH);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new DynamicLayout().display();
            }
        });
    }
}