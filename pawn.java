public class pawn extends subpiece implements piece{

    public pawn(int x, int y) {
        super(x, y);
    }

    public boolean inStartPos(){
        return getY() == 2;
    }

    @Override
    public boolean canMove(int x, int y){
        if(inStartPos()){
            if(y-2 == getY() && x == getX()){
                return true; 
            }
        }
        return y-1 == getY() && x == getX(); 

    }

}
