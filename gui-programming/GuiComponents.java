import javax.swing.JButton;
import javax.swing.JFrame;

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
        //JTextArea
        //JPassowrdField
        //JTextField
        //JSlider


        // Set Visibility
        jFrame.setVisible(true);
    }
}
