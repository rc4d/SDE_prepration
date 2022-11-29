package Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = nums1.length;
        int i = m-1;
        int j = n-1;
        int k = len-1;
        while(j>=0){
            if(i>=0 && nums1[i]> nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }
    }
}
/*
https://www.youtube.com/watch?v=C4oBXLr3zos
nums1 = [0],
 m = 3,
  nums2 = [1], 
  n = 3
  len = 6, len/ 2 = 3 
  mLastIndex = 1
  j = 0
  k = 2;
  i = 2;

  */