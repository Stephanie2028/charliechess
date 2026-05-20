public class king extends subpiece implements piece{

    public king(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean canMove(int x, int y){
        if(y == getY()){
            return x-1 == getX() || x+1 == getX();
        }
        if(x == getX()){
            return y-1 == getY() || y+1 == getY();
        }
        return false; 
    }

    
}
