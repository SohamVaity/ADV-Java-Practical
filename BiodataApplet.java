//1)Design an applet to create biodata using following components. Button, Choice, List, TextField, TextArea, Label, RadioButton.

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BiodataApplet extends Applet implements ActionListener {
    TextField nameTextField, ageTextField;
    Choice genderChoice;
    List skillsList;
    TextArea addressTextArea;
    Button submitButton;
    CheckboxGroup maritalStatusCheckboxGroup;
    Checkbox marriedCheckbox, notMarriedCheckbox;

    public void init() {
        Label nameLabel = new Label("Name:");
        nameTextField = new TextField(20);

        Label ageLabel = new Label("Age:");
        ageTextField = new TextField(5);

        Label genderLabel = new Label("Gender:");
        genderChoice = new Choice();
        genderChoice.add("Male");
        genderChoice.add("Female");
        genderChoice.add("Other");

        Label maritalStatusLabel = new Label("Marital Status:");
        maritalStatusCheckboxGroup = new CheckboxGroup();
        marriedCheckbox = new Checkbox("Married", maritalStatusCheckboxGroup, false);
        notMarriedCheckbox = new Checkbox("Not Married", maritalStatusCheckboxGroup, false);

        Label skillsLabel = new Label("Skills:");
        skillsList = new List(5, true);
        skillsList.add("Java");
        skillsList.add("Python");
        skillsList.add("C++");
        skillsList.add("HTML");
        skillsList.add("CSS");

        Label addressLabel = new Label("Address:");
        addressTextArea = new TextArea(5, 20);

        submitButton = new Button("Submit");
        submitButton.addActionListener(this);

        // Add components to the applet
        add(nameLabel);
        add(nameTextField);
        add(ageLabel);
        add(ageTextField);
        add(genderLabel);
        add(genderChoice);
        add(maritalStatusLabel);
        add(marriedCheckbox);
        add(notMarriedCheckbox);
        add(skillsLabel);
        add(skillsList);
        add(addressLabel);
        add(addressTextArea);
        add(submitButton);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            // Handle the submit button click
            String name = nameTextField.getText();
            String age = ageTextField.getText();
            String gender = genderChoice.getSelectedItem();
            String maritalStatus = marriedCheckbox.getState() ? "Married" : "Not Married";
            String[] skills = skillsList.getSelectedItems();
            String address = addressTextArea.getText();

            // Perform actions with the biodata (e.g., display or store it)
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gender);
            System.out.println("Marital Status:" + maritalStatus);
            System.out.print("Skills: ");
            for (String skill : skills) {
                System.out.print(skill + " ");
            }
            System.out.println("\rAddress: " + address);
        }
    }
}
