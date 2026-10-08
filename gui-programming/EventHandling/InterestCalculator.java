import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InterestCalculator {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Interest Calculator");
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel principleLabel = new JLabel("Principle:");
        principleLabel.setBounds(50, 40, 100, 30);
        frame.add(principleLabel);

        JTextField principleField = new JTextField();
        principleField.setBounds(170, 40, 200, 30);
        frame.add(principleField);

        JLabel timeLabel = new JLabel("Time:");
        timeLabel.setBounds(50, 90, 100, 30);
        frame.add(timeLabel);

        JTextField timeField = new JTextField();
        timeField.setBounds(170, 90, 200, 30);
        frame.add(timeField);

        JLabel rateLabel = new JLabel("Rate:");
        rateLabel.setBounds(50, 140, 100, 30);
        frame.add(rateLabel);

        JTextField rateField = new JTextField();
        rateField.setBounds(170, 140, 200, 30);
        frame.add(rateField);

        JButton simpleInterestButton = new JButton("Simple Interest");
        simpleInterestButton.setBounds(50, 200, 170, 40);
        frame.add(simpleInterestButton);

        JButton compoundInterestButton = new JButton("Compound Interest");
        compoundInterestButton.setBounds(250, 200, 170, 40);
        frame.add(compoundInterestButton);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(50, 260, 370, 30);
        frame.add(resultLabel);

        simpleInterestButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                try {
                    double principle = Double.parseDouble(principleField.getText());
                    double time = Double.parseDouble(timeField.getText());
                    double rate = Double.parseDouble(rateField.getText());
                    double simpleInterest = principle * time * rate / 100;

                    resultLabel.setText("Simple Interest: " + simpleInterest);
                } catch (NumberFormatException exception) {
                    JOptionPane.showMessageDialog(frame, "Enter valid numbers.");
                }
            }
        });

        compoundInterestButton.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                try {
                    double principle = Double.parseDouble(principleField.getText());
                    double time = Double.parseDouble(timeField.getText());
                    double rate = Double.parseDouble(rateField.getText());
                    double amount = principle * Math.pow(1 + rate / 100, time);
                    double compoundInterest = amount - principle;

                    resultLabel.setText("Compound Interest: " + compoundInterest);
                } catch (NumberFormatException exception) {
                    JOptionPane.showMessageDialog(frame, "Enter valid numbers.");
                }
            }
        });

        frame.setVisible(true);
    }
}
