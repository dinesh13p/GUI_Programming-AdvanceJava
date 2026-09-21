import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class BorderLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout Example");
        frame.setSize(700, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout());

        JButton header = new JButton("Header");
        frame.add(header, BorderLayout.NORTH);

        JButton footer = new JButton("Footer");
        frame.add(footer, BorderLayout.SOUTH);

        JButton leftSidebar = new JButton("Left Sidebar");
        frame.add(leftSidebar, BorderLayout.WEST);

        JButton rightSidebar = new JButton("Right Sidebar");
        frame.add(rightSidebar, BorderLayout.EAST);

        JButton center = new JButton("Center");
        frame.add(center, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}


/*
JComboBox (drop down)
JSlider
JRadioButton
JCheckBox
JOptionPane (dialog box)
*/