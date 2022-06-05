import javax.swing.*;
import java.awt.*;

public interface Piece {

    public boolean isSelected();
    public void move();
    public void confirmMove();
    public void showValidMoves();
    public JLabel getPiece();
    public void setLabel();
}
