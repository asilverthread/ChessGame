import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChessBoardUI {
    private JFrame mainFrame;
    private JLabel header;
    private JPanel mainPanel;

    public ChessBoardUI() {
    }

    public ChessBoardUI(ChessBoard board) {
        prepareGUI(board);
    }

    private void prepareGUI() {
        //main frame setup
        mainFrame = new JFrame("Chess");
        mainFrame.setSize(640,640);
        mainFrame.setLayout(new GridLayout(1, 1));
        mainFrame.setVisible(true);
        //main panel setup
        mainPanel = new JPanel(new GridLayout(8,8));

        /*
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
            if (i != 64) {
                mainPanel.add(borderLabel);
            } else {
                mainPanel.add(new PawnPiece("NotWhite").getPiece());
            }
        }

        mainFrame.add(mainPanel);


         */
    }

    private void prepareGUI(ChessBoard board) {
        prepareGUI();

        for (Space s: board.getSpaces()) {
            if (s.getPiece() != null) {
                JLabel j = s.getPiece().getPiece();
                mainPanel.add(j);
            }
        }

        mainFrame.add(mainPanel);
    }
}
