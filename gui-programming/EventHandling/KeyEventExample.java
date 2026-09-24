import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Layout example");
        frame.setSize(700, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());

        JTextField textField = new JTextField(40);
        frame.add(textField);

        JLabel label = new JLabel("No Details");
        frame.add(label);

        textField.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e){
                System.out.println("Key Typed: "+ e.getKeyChar());
            }
            public void keyPressed(KeyEvent e){
                label.setText("Key Pressed: "+ e.getKeyChar());
            }
            public void keyReleased(KeyEvent e){
                label.setText("Key Released: "+ e.getKeyChar());
            }

        });



        frame.setVisible(true);
    }

}
