//7) Develop a program which will implement various methods of KeyListener

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerDemo extends JFrame implements KeyListener {
    private JTextField textField;

    public KeyListenerDemo() {
        setTitle("Key Listener Demo");

        textField = new JTextField();
        textField.addKeyListener(this);

        add(textField);

        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar();
        System.out.println("Key Typed: " + keyChar);
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        System.out.println("Key Pressed: " + KeyEvent.getKeyText(keyCode));
    }

    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        System.out.println("Key Released: " + KeyEvent.getKeyText(keyCode));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new KeyListenerDemo());
    }
}
