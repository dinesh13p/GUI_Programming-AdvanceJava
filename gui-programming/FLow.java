import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class FLow {
    public static void main(String[] args) {
        // Creating a frame
        JFrame frame = new JFrame("GUI Components");

        // Setting height and width of the frame
        frame.setSize(900, 900);

        // Using FlowLayout instead of null - components will be
        // arranged left-to-right, top-to-bottom automatically
        frame.setLayout(new FlowLayout());

        // Creating a button
        JButton button = new JButton("Click Me !!");
        JButton secondButton = new JButton("Hello!!");

        // Creating a label
        JLabel l = new JLabel("Select Languages");

        // Creating a check box
        JCheckBox hindi = new JCheckBox("hindi");
        JCheckBox english = new JCheckBox("english");
        JCheckBox nepali = new JCheckBox("nepali");

        // Creating the third button for the submission of the checkbox information
        JButton thirdButton = new JButton("New Button");

        // Adding the components to the frame
        frame.add(l);
        frame.add(hindi);
        frame.add(english);
        frame.add(nepali);
        frame.add(button);
        frame.add(secondButton);
        frame.add(thirdButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

/*
JRadioButton
JCheckBox
JOptionPane
JComboBox
JSlider
*/