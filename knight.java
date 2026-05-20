public class knight extends subpiece implements piece{

    public knight(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean canMove(int x, int y){
        if(y-2 == getY() || y+2 == getY()){
            if(x+1 == getX() || x-1 == getX()){
                return true;
            }
        } 
        if(x-2 == getX() || x+2 == getX()){
            if(y+1 == getY() || y-1 == getY()){
                return true; 
            }
        }
        return false; 
    }
    
}
