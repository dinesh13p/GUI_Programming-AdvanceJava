import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
 
public class MouseClick {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Mouse Coordinates");

        frame.setSize(700, 800);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.addMouseListener(new MouseListener() {
            
            public void mouseClicked(MouseEvent e){
                int X = e.getX();
                int Y = e.getY();

                JOptionPane.showMessageDialog(frame, "X = " + X + "  Y = " + Y);

            }
            public void mousePressed(MouseEvent e){

            }
            public void mouseReleased(MouseEvent e){

            }
            public void mouseEntered(MouseEvent e){

            }
            public void mouseExited(MouseEvent e){

            }

        });
        frame.setVisible(true);
    }
}







/*
 * // Using MouseAdapter:
 * ```
 * 
 * import javax.swing.*;
 * import java.awt.event.*;
 * 
 * public class MouseCoordinatesExample {
 * public static void main(String[] args) {
 * JFrame frame = new JFrame("Mouse Coordinates");
 * frame.setSize(600, 400);
 * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 * JLabel label = new JLabel("Click anywhere", SwingConstants.CENTER);
 * frame.add(label);
 * 
 * label.addMouseListener(new MouseAdapter() {
 * public void mouseClicked(MouseEvent e) {
 * label.setText(e.getX() + ", " + e.getY());
 * }
 * });
 * 
 * frame.setVisible(true);
 * }
 * }
 * ```
 */