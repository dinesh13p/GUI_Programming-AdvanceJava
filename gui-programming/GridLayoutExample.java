import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Layout Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //setlayout
        frame.setLayout(new GridLayout(2, 3));
        for(int i = 1; i <= 9; i++){
            JButton button = new JButton("Button" + i);
        frame.add(button);
        }
    
    
        frame.setVisible(true);
    }
}


/*
Events:                         Listeners:
ActionEvent                     ActionListener (buttons)
ItemEvent                       ItemListener (list items)
WindowEvent                     WindowListener (window)
KeyEvent                        KeyListener (keyboard)
MouseEvent                      MouseListener (mouse)
*/