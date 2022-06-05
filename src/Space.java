public class Space {
    private Piece piece;
    private int[] position = new int[2];

    public Space(){}

    public Space(int x, int y) {
        position[0] = x;
        position[1] = y;
    }

    public Space(int x, int y, Piece p) {
        this(x, y);
        piece = p;
    }

    public Space(int[] position) {
        this(position[0], position[1]);
    }

    public Space(int[] position, Piece p) {
        this(position);
        piece = p;
    }

    public int[] getPosition(){
        return position;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece p) {
        piece = p;
    }

    @Override
    public String toString() {
        return "Position x:" + position[0] + " Position y:" + position[1] + " Piece:" + (piece == null ? "No Piece Here!" : piece.toString());
    }
}
