import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyEventMovingExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Move example");
        frame.setSize(700, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Move me");
        label.setBounds(300, 250, 80, 30);
        frame.add(label);

        frame.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int x = label.getX();
                int y = label.getY();
                int key = e.getKeyCode();

                if (key == KeyEvent.VK_UP) {
                    y = y - 10;
                }
                if (key == KeyEvent.VK_DOWN) {
                    y = y + 10;
                }
                if (key == KeyEvent.VK_LEFT) {
                    x = x - 10;
                }
                if (key == KeyEvent.VK_RIGHT) {
                    x = x + 10;
                }

                label.setLocation(x, y);
            }
        });

        frame.setVisible(true);
    }
}