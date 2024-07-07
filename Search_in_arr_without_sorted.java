import java.util.Arrays;

public class Search_in_arr_without_sorted {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 39},
                {33, 34, 38, 50}
        };


        System.out.println(Arrays.toString(search(arr, 37)));

    }
    public static int[] search(int[][] arr,int target){
        int r=0;
        int c=0;

        for(r = 0; r<=arr.length-1; r++){
            for(c = 0; c<=arr.length-1; c++){
                if(arr[r][c]==target){
                    return new int[]{r, c};
                }
            }

        }
        return new int[]{-1,-1};
    }
}
