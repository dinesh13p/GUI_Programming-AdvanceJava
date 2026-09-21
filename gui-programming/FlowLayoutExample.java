import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class FlowLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bhanu bhakta");
        frame.setSize(900, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // frame.setLayout(new FlowLayout()); //CENTER
        // frame.setLayout(new FlowLayout(FlowLayout.LEFT)); // LEFT
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT)); // RIGHT

        JButton firstButton = new JButton("first button");
        JButton secondButton = new JButton("second button");
        JButton thirdButton = new JButton("third button");
        JButton fourthButton = new JButton("fourth button");

        frame.add(firstButton);
        frame.add(secondButton);
        frame.add(thirdButton);
        frame.add(fourthButton);

        frame.setVisible(true);
    }
}