// 9) WAP which will make use of Mouse Adapter class

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapterDemo extends JFrame {
    public MouseAdapterDemo() {
        setTitle("Mouse Adapter Demo");

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 200));

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked at Coordinates: (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        add(panel);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MouseAdapterDemo::new);
    }
}
