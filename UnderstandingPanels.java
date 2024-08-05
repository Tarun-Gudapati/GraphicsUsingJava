import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CreatingJavaPanels extends JFrame {
    CreatingJavaPanels() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);

        this.setTitle("different panels");
        this.setLayout(null);

        JPanel redpanel = new JPanel();
        redpanel.setSize(100, 100);
        redpanel.setBackground(Color.RED);
        JPanel yellowPanel = new JPanel();
        yellowPanel.setSize(100, 100);
        yellowPanel.setBounds(55, 55, 200, 300);
        yellowPanel.setBackground(Color.yellow);

        JLabel label = new JLabel();
        label.setBackground(Color.green);
        label.setText(
                "TAG");
        label.setOpaque(true);
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        label.setBounds(0, 0, 300, 500);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        this.add(redpanel);
        this.add(yellowPanel);
        this.add(label);
        this.setVisible(true);
        

    }

}
