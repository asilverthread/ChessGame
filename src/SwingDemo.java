import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingDemo {
    private JFrame mainFrame;
    private JLabel header;
    private JPanel mainPanel;

    public SwingDemo() {
        prepareGUI();
    }

    private void prepareGUI() {
        //main frame setup
        mainFrame = new JFrame("Chess");
        mainFrame.setSize(640,640);
        mainFrame.setLayout(new GridLayout(1, 1));
        mainFrame.setVisible(true);
        //main panel setup
        JPanel mainPanel = new JPanel(new GridLayout(8,8));

        int row = 1;
        for (int i = 1; i < 65; i++) {
            JLabel borderLabel = new JLabel();
            borderLabel.setOpaque(true);
            if (i % 8 == 1){
                row++;
            }
            if (row % 2 == 0) {
                if (i % 2 == 0) {
                    borderLabel.setBackground(Color.black);
                } else {
                    borderLabel.setBackground(Color.white);
                }
            } else {
                if (i % 2 == 0) {
                    borderLabel.setBackground(Color.white);
                } else {
                    borderLabel.setBackground(Color.black);
                }
            }

            borderLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            mainPanel.add(borderLabel);
        }

        mainFrame.add(mainPanel);
    }
}
