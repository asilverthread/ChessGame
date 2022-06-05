import java.lang.Math;

import static java.lang.Math.ceil;

public class ChessBoardPreparer {
    private ChessBoard chessboard;

    public void prepareBoard() {
        int row;
        int col;
        chessboard = new ChessBoard();
        for(int i = 0; i < 64; i++) {
            row = (int) (ceil(i/8) + 1);
            col = (i % 8)+1;
            Space s = new Space(row, col);
            if (row == 2) {
                Piece p = new PawnPiece("Black");
                s.setPiece(p);
            } else if (row == 7) {
                Piece p = new PawnPiece("White");
                s.setPiece(p);
            }
            chessboard.addSpace(s);
        }

        chessboard.barf();
        ChessBoardUI mainUI = new ChessBoardUI(chessboard);

    }

    public static void main(String[] args) {
        ChessBoardPreparer n = new ChessBoardPreparer();
        n.prepareBoard();
    }

}
