//3) WAP which will create checkable menu item ‘Picture’ under Insert Menu and ‘Paste’ menu item under the menu Home

import javax.swing.*;

public class MenuDemo extends JFrame {

    public MenuDemo() {
        setTitle("MenuBar");
        setSize(400, 300);
        setVisible(true);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu insertMenu = new JMenu("Insert");
        JMenu homeMenu = new JMenu("Home");

        JMenuItem pictureItem = new JCheckBoxMenuItem("Picture");
        JMenuItem pasteItem = new JCheckBoxMenuItem("Paste");

        insertMenu.add(pictureItem);
        homeMenu.add(pasteItem);

        menuBar.add(insertMenu);
        menuBar.add(homeMenu);
    }

    public static void main(String[] args) {
        new MenuDemo();
    }
}
