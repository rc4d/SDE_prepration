package Arrays;

public class SortColors012 {
    public void sortColors(int[] nums) {
        int zero = 0, one = 0, two = 0;
        int len = nums.length;
        for(int i=0; i<len; i++){
            if(nums[i] == 0) zero++;
            else if(nums[i] == 1) one++;
            else two++;
        }

        for(int i=0; i<len; i++){
            while(zero-- > 0 && i<len){
                nums[i++] = 0;
            }
            while(one-- > 0 && i<len){
                nums[i++] = 1;
            }
            while(two-- > 0 && i<len){
                nums[i++] = 2;
            }
        }    
    }
}

// https://leetcode.com/problems/sort-colors/description/