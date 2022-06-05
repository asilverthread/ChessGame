import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PawnPiece implements Piece{
    private Color color = null;
    private final String pieceType = "Pawn";
    private JLabel piece;
    private int[] currentPosition = new int[2];
    private boolean selected;

    public PawnPiece() {
        piece = new JLabel(pieceType);
        piece.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                setSelected();
            }
        });
    }

    public PawnPiece(String team) {
        this();
        if (team.equals("White")) {
            color = Color.white;
        } else {
            color = Color.black;
        }
        piece.setBackground(color);
    }

    @Override
    public boolean isSelected() {
        return selected;
    }

    private void updatePiece(){
        if (selected) {
            piece.setForeground(Color.YELLOW);
        } else {
            piece.setForeground(color);
        }
    }

    public void setSelected() {
        selected = !selected;
        updatePiece();
    }

    @Override
    public void move() {

    }

    @Override
    public void confirmMove() {

    }

    @Override
    public void showValidMoves() {

    }

    @Override
    public JLabel getPiece() {
        return piece;
    }

    @Override
    public void setLabel() {

    }

    @Override
    public String toString() {
        return "Pawn of color: " + (color == Color.white ? "White" : "Black") ;
    }


}
