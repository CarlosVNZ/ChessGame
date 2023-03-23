package lib;

/**
 *
 * @author carlo
 */
public abstract class Piece {
    protected String id;
    protected int value;
    protected boolean isWhite;
    
     public Piece(String id, int value, boolean isWhite) {
        this.id = id;
        this.value = value;
        this.isWhite = isWhite;
    }
    
}
