import javax.swing.*;
import java.awt.*;

public class ShapeExample extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D graphics2d = (Graphics2D) g;

        // Line
        graphics2d.drawLine(30, 50, 250, 60);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shape Example");
        frame.setSize(500, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ShapeExample());

        frame.setVisible(true);

    }

}
