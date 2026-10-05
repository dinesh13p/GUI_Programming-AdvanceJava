import javax.swing.*;
import java.awt.*;

public class ShapeExample extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D graphics2d = (Graphics2D) g;

        // Line
        graphics2d.drawLine(30, 50, 250, 60);

        // Circle
        graphics2d.drawOval(100, 100, 150, 150);

        // Rectangle
        graphics2d.drawRect(50, 300, 150, 100);

        // Square
        graphics2d.drawRect(250, 300, 100, 100);

        // Triangle
        int[] xPoints = { 150, 100, 200 };
        int[] yPoints = { 600, 500, 500 };
        graphics2d.drawPolygon(xPoints, yPoints, 3);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shape Example");
        frame.setSize(500, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ShapeExample());

        frame.setVisible(true);

    }

}
