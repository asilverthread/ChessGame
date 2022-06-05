import java.util.ArrayList;


public class ChessBoard {
    private ArrayList<Space> spaces = new ArrayList<Space>();

    public ChessBoard() {}

    public Space getSpace(int[] positionToCheck) { //returns null if no valid space
        Space space = null;
        for (Space s : spaces) {
            if (s.getPosition().equals(positionToCheck)) {
               space = s;
            }
        }
        return space;
    }

    public void setSpace(int[] position, Piece p) {
        spaces.add(new Space(position, p));
    }

    public void addSpace(Space s) {
        if (s != null) {
            spaces.add(s);
        }
    }

    public ArrayList<Space> getSpaces() {
        return spaces;
    }

    public void barf() {
        for (Space s : spaces) {
            System.out.println(s.toString());
        }
    }

}
