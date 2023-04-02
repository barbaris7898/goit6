import java.util.Arrays;
class TargetFinder {

    public int[] findTarget(int[] aiCoords, int[][] targets){
        double min = Math.sqrt(Math.pow((targets[0][0]-aiCoords[0]),2)+Math.pow((targets[0][1]-aiCoords[1]),2));
        int[] res = new int[2];
        double dis = 0;
        for(int i=0; i<targets.length; i++){
               dis = Math.sqrt(Math.pow((targets[i][0]-aiCoords[0]),2)+Math.pow((targets[i][1]-aiCoords[1]),2));
                if(dis<min){
                    min=dis;
                    res[0]=targets[i][0];
                    res[1]=targets[i][1];
            }
        }return res;
    }
}
class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}
