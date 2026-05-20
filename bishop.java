public class bishop extends subpiece implements piece{
    public bishop(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean canMove(int x, int y){
        return getY()-Math.abs(y)==getX()-Math.abs(x);
    }   
}
