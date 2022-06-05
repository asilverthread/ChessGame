import javax.swing.*;
import java.awt.*;

public class PawnPiece implements Piece{
    Color color = null;
    final String pieceType = "Pawn";
    JLabel piece;
    int[] currentPosition = new int[2];

    public PawnPiece() {
        piece = new JLabel(pieceType);
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
        return false;
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

}
