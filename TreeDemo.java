//13) WAP for given output:

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeDemo extends JFrame {
    public TreeDemo() {
        setTitle("TreeDemo");

        DefaultMutableTreeNode tpoly = new DefaultMutableTreeNode("TPOLY");
        DefaultMutableTreeNode co = new DefaultMutableTreeNode("CO");
        tpoly.add(co);

        DefaultMutableTreeNode fyco = new DefaultMutableTreeNode("FYCO");
        DefaultMutableTreeNode syco = new DefaultMutableTreeNode("SYCO");
        DefaultMutableTreeNode tyco = new DefaultMutableTreeNode("TYCO");
        co.add(fyco);
        co.add(syco);
        co.add(tyco);

        DefaultMutableTreeNode ce = new DefaultMutableTreeNode("CE");
        DefaultMutableTreeNode me = new DefaultMutableTreeNode("ME");
        DefaultMutableTreeNode if_ = new DefaultMutableTreeNode("IF");
        tpoly.add(ce);
        tpoly.add(me);
        tpoly.add(if_);

        JTree jTree = new JTree(tpoly);
        jTree.setBounds(10, 10, 160, 160);
        add(jTree);

        setSize(250, 250);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TreeDemo();
    }
}
