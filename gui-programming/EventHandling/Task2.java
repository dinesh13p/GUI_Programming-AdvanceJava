import javax.swing.*;
import java.awt.event.*;

public class Task2 implements ActionListener {
    JFrame frame;
    JLabel label1,label2,result;
    JTextField input1,input2;
    JButton addButton,subButton;

    Task2(){
        frame = new JFrame("Mouse Coordinates");

        label1 = new JLabel("Input1");
        label1.setBounds(50, 50, 150, 30);
        label2 = new JLabel("Input2");
        label2.setBounds(400, 50, 150, 30);

        input1 = new JTextField();
        input1.setBounds(50,100,150,30);
        input2 = new JTextField();
        input2.setBounds(400,100,150,30);



        result = new JLabel();
        result.setBounds(200,200,100,50);

        addButton = new JButton("ADD");
        addButton.setBounds(50,150,100,50);
        addButton.addActionListener(this);
        subButton = new JButton("SUB");
        subButton.setBounds(400, 150,100,50);
        subButton.addActionListener(this);

        frame.add(label1);
        frame.add(label2);
        frame.add(input1);
        frame.add(input2);
        frame.add(addButton);
        frame.add(subButton);
        frame.add(result);
        frame.setSize(500, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    static void main() {
        new Task2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(input1.getText());
        int num2 = Integer.parseInt(input2.getText());
        int add = num1 + num2;
        int sub = num1 - num2;
        if (e.getSource() == addButton) {
            result.setText("Result: " + add);
        }

        if (e.getSource() == subButton) {
            result.setText("Result: " + sub);
        }
    }
}