import javax.swing.*;
import java.awt.event.*;

public class MouseCoordinatesExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Coordinates");
        JLabel label = new JLabel("Click anywhere", SwingConstants.CENTER);

        label.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                label.setText("(" + e.getX() + ", " + e.getY() + ")");
            }
        });

        frame.add(label);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}