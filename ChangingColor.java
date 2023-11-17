//4)Create a frame having title as “changing colors” with a provision to select a particular among Red, Green, and Blue. Make use of JComboBox.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class ChangingColor extends JFrame implements ItemListener {
    JComboBox<String> cb;

    public ChangingColor() {
        setTitle("Changing Colors");
        String[] color = { "Red", "Green", "Blue" };

        cb = new JComboBox<>(color);
        cb.setBounds(10, 10, 100, 20);
        cb.addItemListener(this);
        add(cb);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        String selectedColor = (String) cb.getSelectedItem();

        if (selectedColor.equals("Red")) {
            getContentPane().setBackground(Color.red);
        } else if (selectedColor.equals("Green")) {
            getContentPane().setBackground(Color.green);
        } else if (selectedColor.equals("Blue")) {
            getContentPane().setBackground(Color.blue);
        }
    }

    public static void main(String[] args) {
        new ChangingColor();
    }
}
