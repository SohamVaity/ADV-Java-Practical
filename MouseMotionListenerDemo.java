//6) Develop a program which will implement various methods of MouseMotionListener

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMotionListenerDemo extends JFrame implements MouseMotionListener {
    private JLabel coordinatesLabel;

    public MouseMotionListenerDemo() {
        setTitle("Mouse Motion Listener Demo");

        coordinatesLabel = new JLabel("Mouse Coordinates: ");
        JPanel panel = new JPanel();
        panel.add(coordinatesLabel);

        add(panel);
        addMouseMotionListener(this);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void mouseDragged(MouseEvent e) {
        updateCoordinatesLabel(e);
    }

    public void mouseMoved(MouseEvent e) {
        updateCoordinatesLabel(e);
    }

    private void updateCoordinatesLabel(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        coordinatesLabel.setText("Mouse Coordinates: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MouseMotionListenerDemo());
    }
}
