//8) Develop a program to create an applet to accept a no in text field and display the square of the no when a button with caption Square is pressed

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SquareApplet extends Applet implements ActionListener {
    private TextField numberTextField;
    private Label resultLabel;

    public void init() {
        Label enterLabel = new Label("Enter a number:");
        numberTextField = new TextField(10);
        Button squareButton = new Button("Square");
        resultLabel = new Label("Result:");

        squareButton.addActionListener(this);

        add(enterLabel);
        add(numberTextField);
        add(squareButton);
        add(resultLabel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Square")) {
            try {
                int number = Integer.parseInt(numberTextField.getText());
                int square = number * number;
                resultLabel.setText("Result: Square of " + number + " is " + square);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Result: Please enter a valid number.");
            }
        }
    }
}
