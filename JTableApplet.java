//14) WAP to create JTable on JApplet window

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class JTableApplet extends JApplet {
    public void init() {
        Object[][] data = {
                { "Soham Vaity", 18, "Male" },
                { "Aleash Bhat", 17, "Female" },
                { "Jayesh Wagh", 18, "Male" },
                { "Yash Soni", 18, "Male" },

        };
        String[] columnNames = { "Name", "Age", "Gender" };

        JTable jTable = new JTable(new DefaultTableModel(data, columnNames));
        JScrollPane scrollPane = new JScrollPane(jTable);

        add(scrollPane);
    }
}
