// Layout Management
//a. Flow layout (compontnts are arrange in left, right, center, leading , initiing)
//b. border layout (North, East, west, south dirextion)
//c. Gerid layout (Rows and colums)

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSlider;

import java.awt.*;

public class LayoutManagement {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Layout Management");
        frame.setSize(700,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        // frame.setLayout(new FlowLayout());//  Default center
        frame.setLayout(new FlowLayout(FlowLayout.LEFT)); // Left align
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT)); // Right align


        JLabel checkboxLable = new JLabel("Hobbies");
        JCheckBox cricket = new JCheckBox("Cricket");
        JCheckBox football = new JCheckBox("Football");
        JCheckBox Basketball = new JCheckBox("Basketball");

        frame.add(checkboxLable);
        frame.add(cricket);
        frame.add(football);
        frame.add(Basketball);

        //radiobutton

        JLabel genderLabel = new JLabel("Gender:");

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other = new JRadioButton("Other");

        // only one radio button to be selected
        ButtonGroup genderGroup = new ButtonGroup();

        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);

        frame.add(genderLabel);
        frame.add(male);
        frame.add(female);
        frame.add(other);


        // combo box
        JLabel courseLabel = new JLabel("Course:");

        String[] courses = {"Java", "C#", "Python", "JavaScript"};

        JComboBox<String> courseBox = new JComboBox<>(courses);

        frame.add(courseLabel);
        frame.add(courseBox);


        // ---------------- SLIDER ----------------
        JLabel sliderLabel = new JLabel("Age:");

        JSlider ageSlider = new JSlider(10, 50, 20);

        // Show tick marks
        ageSlider.setMajorTickSpacing(10);
        ageSlider.setMinorTickSpacing(5);
        ageSlider.setPaintTicks(true);
        ageSlider.setPaintLabels(true);

        frame.add(sliderLabel);
        frame.add(ageSlider);


        // ---------------- BUTTON ----------------
        JButton button = new JButton("Submit");

        frame.add(button);


        // ---------------- JOptionPane ----------------
        button.addActionListener(e -> {

            String hobbies = "";

            if (cricket.isSelected()) {
                hobbies += "Cricket ";
            }

            if (football.isSelected()) {
                hobbies += "Volleyball ";
            }

            if (Basketball.isSelected()) {
                hobbies += "Basketball ";
            }

            String gender = "";

            if (male.isSelected()) {
                gender = "Male";
            } else if (female.isSelected()) {
                gender = "Female";
            } else if (other.isSelected()) {
                gender = "Other";
            }

            String course = (String) courseBox.getSelectedItem();

            int age = ageSlider.getValue();

            JOptionPane.showMessageDialog(
                    frame,
                    "Hobbies: " + hobbies +
                    "\nGender: " + gender +
                    "\nCourse: " + course +
                    "\nAge: " + age
            );
        });
        
    }
}