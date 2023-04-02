class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {-12, -6, 9, -28};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}
public class RectangleArea {
    private int[] coords;


    public int[] getCoords() {
        return coords;
    }
    public RectangleArea(int[] coords) {
        this.coords = coords;
    }
    public int getArea(){
        return Math.abs((coords[2]-coords[0])*(coords[3]-coords[1]));
    }
}
