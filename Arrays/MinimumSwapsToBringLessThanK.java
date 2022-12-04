package Arrays;
// https://www.geeksforgeeks.org/minimum-swaps-required-bring-elements-less-equal-k-together/
public class MinimumSwapsToBringLessThanK {
    public static int numSwap(int arr[], int n, int k){
        int count = 0;
        int min = 0;
        for(int i=0; i<n; i++){
            if(arr[i]<=k)
                count++;
        }
        int minC= Integer.MAX_VALUE;
        int bad = 0;
        for(int i=0; i<n; i++){
            if(count + i < n)
                bad = 0;
            
            for(int j=i; j<n && j<count+i; j++){
                if(j >= n)
                    break;
                if(arr[j]>k)
                    bad++;
            }

            System.out.println("Bad => "+ bad);
            minC = Math.min(bad, minC);
            System.out.println("Min c => "+ minC);
        }
        return minC;
    }
    public static int numSwapOptimised(int arr[], int n, int k){
        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i]<=k)
                count++;
        }
        int bad = 0;
        for(int i=0; i<count; i++){
            if(arr[i]>k)
                bad++;
        }
        int ans = bad;
        for(int i=0, j=count; j<n; i++,j++){
            if(arr[i]>k)
                bad--;
            if(arr[j]> k)
                bad++;
            ans = Math.min(ans, bad);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 3};
    int n = arr.length;
    int k = 3;
    System.out.print("Answer => "+numSwapOptimised(arr, n, k) + "\n");
 
    int arr1[] = {2, 7, 9, 5, 8, 7, 4};
    n = arr1.length;
    k = 5;
    System.out.print("Answer => "+numSwapOptimised(arr1, n, k));
    }
}
