public class space {
    private int y, x;
    private boolean containsPiece;
    private int squareColor;
    private int pieceColor;
    private String pieceType;
    private piece piece;

    // squareColor: 0 white square, 1 black square
    // pieceColor: 0 white piece, 1 black piece

    public space(int x, int y, int squareColor, boolean containsPiece){
        this.x = x;
        this.y = y;
        this.squareColor = squareColor;
        this.containsPiece = containsPiece;
        this.pieceColor = -1;
    }

    public space(int x, int y, int squareColor, boolean containsPiece, String pieceType, int pieceColor){
        this.x = x;
        this.y = y;
        this.squareColor = squareColor;
        this.containsPiece = containsPiece;
        this.pieceType = pieceType;
        this.pieceColor = pieceColor;

        create(pieceType);
    }

    public int getX(){ return x; }
    public int getY(){ return y; }

    public piece getPiece(){
        return piece;
    }

    public void create(String pieceType){
        switch(pieceType){
            case "p":
                this.piece = new pawn(getX(), getY());
                break;
            case "r":
                this.piece = new rook(getX(), getY());
                break;
            case "n":
                this.piece = new knight(getX(), getY());
                break;
            case "b":
                this.piece = new bishop(getX(), getY());
                break;
            case "q":
                this.piece = new queen(getX(), getY());
                break;
            case "k":
                this.piece = new king(getX(), getY());
                break;
            default:
                this.piece = null;
                this.containsPiece = false;
                this.pieceType = null;
                break;
        }
    }

    public String showPiece() {
        if (containsPiece) {
            return switch (pieceType) {
                case "p" -> pieceColor == 0 ? "WP" : "BP";
                case "r" -> pieceColor == 0 ? "WR" : "BR";
                case "n" -> pieceColor == 0 ? "WN" : "BN";
                case "b" -> pieceColor == 0 ? "WB" : "BB";
                case "q" -> pieceColor == 0 ? "WQ" : "BQ";
                case "k" -> pieceColor == 0 ? "WK" : "BK";
                default -> "";
            };
        }

        return squareColor == 0 ? "W_" : "B_";
    }

    @Override
    public String toString() {
        return showPiece();
    }
}
