// 5)WAP to create three radio buttons once user click on button background color will change such as red, green and blue

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonDemo extends JFrame implements ActionListener {
    private JRadioButton redRadioButton, greenRadioButton, blueRadioButton;

    public RadioButtonDemo() {
        setTitle("Color Changer");
        setLayout(new FlowLayout());

        redRadioButton = new JRadioButton("Red");
        greenRadioButton = new JRadioButton("Green");
        blueRadioButton = new JRadioButton("Blue");

        ButtonGroup colorGroup = new ButtonGroup();
        colorGroup.add(redRadioButton);
        colorGroup.add(greenRadioButton);
        colorGroup.add(blueRadioButton);

        redRadioButton.addActionListener(this);
        greenRadioButton.addActionListener(this);
        blueRadioButton.addActionListener(this);

        add(redRadioButton);
        add(greenRadioButton);
        add(blueRadioButton);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redRadioButton) {
            getContentPane().setBackground(Color.RED);
        } else if (e.getSource() == greenRadioButton) {
            getContentPane().setBackground(Color.GREEN);
        } else if (e.getSource() == blueRadioButton) {
            getContentPane().setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RadioButtonDemo());
    }
}
