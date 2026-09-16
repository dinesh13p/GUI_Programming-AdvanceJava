import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuiComponents {
    public static void main(String[] args) {
        // 1. Creating JFrame
        JFrame jFrame = new JFrame("GUI Components");

        // 2. Set Default size
        jFrame.setSize(800, 900);

        // 3. Close Operation
        // jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //termination

        // jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //disabled

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit -> running

        //Set Layout
        jFrame.setLayout(null);

        //JButton

        JButton firstButton = new JButton("First Button");
        firstButton.setBounds(100, 200, 150, 80);
        jFrame.add(firstButton);

        JButton secondButton = new JButton("Second Button");
        secondButton.setBounds(100, 300, 150, 80);
        jFrame.add(secondButton);

        JButton thirdButton = new JButton("Third Button");
        thirdButton.setBounds(100, 400, 150, 80);
        jFrame.add(thirdButton);

        //JLabel

        JLabel firstLabel = new JLabel("this is label");
        firstLabel.setBounds(300, 200, 200, 30);
        jFrame.add(firstLabel);

        //JTextArea

        JTextArea firstTextArea = new JTextArea("Type here...");
        firstTextArea.setLineWrap(true);
        firstTextArea.setWrapStyleWord(true);
        firstTextArea.setBounds(300, 250, 200, 80);
        jFrame.add(firstTextArea);

        //JPasswordField

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(300, 350, 200, 30);
        jFrame.add(passwordField);

        //JTextField

        JTextField textField = new JTextField();
        textField.setBounds(300, 400, 200, 30);
        jFrame.add(textField);

        //JSlider

        JSlider slider = new JSlider(0, 100, 50);
        slider.setMajorTickSpacing(25);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setBounds(300, 450, 250, 60);
        jFrame.add(slider);


        // Set Visibility
        jFrame.setVisible(true);
    }
}
