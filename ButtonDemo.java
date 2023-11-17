//2) Develop a program to create six buttons and apply GridLayout

import java.awt.*;

public class ButtonDemo extends Frame {

    public static void main(String[] args) {

        Frame f = new Frame("Grid Layout Demo");

        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(new GridLayout(3, 2, 10, 10));

        Button bt1 = new Button("Button 1");
        Button bt2 = new Button("Button 2");
        Button bt3 = new Button("Button 3");
        Button bt4 = new Button("Button 4");
        Button bt5 = new Button("Button 5");
        Button bt6 = new Button("Button 6");

        f.add(bt1);
        f.add(bt2);
        f.add(bt3);
        f.add(bt4);
        f.add(bt5);
        f.add(bt6);
    }
}
