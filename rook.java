public class rook extends piece{


    public rook(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean canMove(int x, int y){
        return y == getY() || x == getX();
    }   
}
