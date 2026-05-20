public class subpiece {
    private int x;
    protected int y; 

    public subpiece(int x, int y){
        this.x = x;
        this.y = y; 
    }

    public void setX(int x){this.x = x;}
    public void setY(int y){this.y = y;}

    public int getX(){return x;}
    public int getY(){return y;}

    public void updatePos(int x, int y){
        setX(x);
        setY(y);
    }    
    
}
