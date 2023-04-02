import java.util.*;
class DistanceTest {
    public static void main(String[] args) {
        //Expect 14
        System.out.println(new Distance(10, 10, 20, 20).getDistance());

        //Expect 23
        System.out.println(new Distance(10, 10, 27, 25).getDistance());
    }
}
class Distance{
    private int starsX;
    private int starsY;
    private int endX;
    private int endY;

    public int getStarsX() {
        return starsX;
    }

    public int getStarsY() {
        return starsY;
    }

    public int getEndX() {
        return endX;
    }

    public int getEndY() {
        return endY;
    }

    public Distance(int starsX, int starsY, int endX, int endY) {
        this.starsX = starsX;
        this.starsY = starsY;
        this.endX = endX;
        this.endY = endY;
    }

    public int getDistance(){
        int res = (int) Math.sqrt((endX-starsX)*(endX-starsX) + (endY-starsY)*(endY-starsY));
        return Math.round(res);
    }
}