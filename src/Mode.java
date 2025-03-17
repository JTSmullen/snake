public class Mode{
    char direction = 'R';
    int x;
    int y;

    public Mode(int appleX, int appleY, int x, int y){
        if(appleX>x) {
            direction = 'R';
        }else if(appleX == x){
            if(appleY > y){
                direction = 'D';
            }else{
                direction = 'U';
            }
        }else{
            direction = 'L';
        }
        x = appleX;
        y = appleY;
    }
    public char getDirection(){
        return direction;
    }
//
//    public int getX() {
//        return x;
//    }
//
//    public int getY() {
//        return y;
//    }
}