import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventExample{

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Grid Layout example");
        frame.setSize(700, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Click Me");
        frame.add(button);

        // add event handling in button component
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("Button Clicked");
            }
        });

        frame.setVisible(true);
    }
}