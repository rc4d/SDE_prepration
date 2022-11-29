package Arrays;
import java.util.*;
public class SumAllSubmatrices {
    // TC => O(n^2)
    // Sc => O(1)
    public static int sumAllSubmatrices(int arr[][]){
// top left = (x+1) * (y * 1) =4, (m-x) * (n-y) = 4
        int m = arr.length;
        int n = arr[0].length;
        int sum = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int topLeft = (i+1) * (j+1);
                int bottomRight = (m-i) * (n-j);
                sum += arr[i][j] * topLeft* bottomRight;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}};
        System.out.println(sumAllSubmatrices(arr));
    }
}
// https://www.youtube.com/watch?v=trhm1IuqSdA
// https://www.geeksforgeeks.org/sum-of-all-submatrices-of-a-given-matrix/