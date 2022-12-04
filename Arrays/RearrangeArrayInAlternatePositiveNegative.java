package Arrays;



public class RearrangeArrayInAlternatePositiveNegative {

    public static void main(String[] args) {
        int arr1[] = {-7, 2, 3, -4, -1, 4, -9};
        // {-4, 1, -1, 2, 3, 4 }
        int result[] = RearrangeArrayInAlternatePositiveNegative(arr1);
        printArray(result);
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println("]");
    }
     
    public static void swap(int arr[], int i, int j){
        if(i>=0 && j<=arr.length){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
    }

    public static int[] RearrangeArrayInAlternatePositiveNegative(int[] arr){
        int n = arr.length;
        int i=0, j = arr.length - 1;
        while(i<j){
            if(arr[j] < 0 && j>0)
                j--;
            else if(arr[i]>=0 && i< arr.length-1)
                i++;
            else if(arr[i] <0 && arr[j]>=0)
                swap(arr, i, j);
        }
        printArray(arr);
        int k = arr.length-1;
        int m = 0;
        while(m < k){
            if(arr[m] >=0 && m%2==0){
                swap(arr, m, k);
                k--;
            }
            else if(m%2==1 && arr[m] >=0){
                continue;
            }
            m++;  
        }
        // for(int i=0;i<n; i++){
        //     if(i%2==0 && P+1> N){
        //         swap(arr, i-P, i);
        //     }
        //     else if(i%2==1 && P> N){
        //         swap(arr, i-P, i);

        //     }
        //     else if(i%2==0 && P < N+1){
        //         swap(arr, i-N, i);

        //     }
        //     else if(i%2==1 && P < N){
        //         swap(arr, i-N, i);
        //     }else{
        //         return arr;
        //     }
        // }


        return arr;
    }
}
