package Arrays;
import java.util.*;
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> res,pre = null;
            // new ArrayList<Integer>();
        for(int i=0; i<numRows; i++){
            res = new ArrayList<Integer>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    res.add(1);
                }
                else{
                    res.add(pre.get(j - 1) + pre.get(j));
                }
                
            }
            pre = res;  
            result.add(res);
           
        }
        return result;
        
    }

}
// https://leetcode.com/problems/pascals-triangle/