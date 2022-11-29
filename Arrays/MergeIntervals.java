package Arrays;
import java.util.*;
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];
        if(intervals.length <=1){
            return intervals;
        }
        // intervals.sort();
        List<int[]> res = new ArrayList<>();

        for(int[] i : intervals){
            if(i[0]<=end){
                end = Math.max(end,i[1]);
            }else{
                res.add(new int[]{start, end});
                start = i[0];
                end = i[1];
            }
        }
        res.add(new int[]{start, end});
        return res.toArray(new int[0][]);
    }
}
