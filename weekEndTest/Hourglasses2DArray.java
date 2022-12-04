package weekEndTest;

/*Ques: https://www.hackerrank.com/contests/bosscoder-arrays/challenges/2d-array/problem */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
    
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int k=0;k<4;k++){
            for(int i=0;i<4;i++){
                 sum=0;
                for(int j=0;j<3;j++){
                    sum=sum+arr.get(k).get(i+j)+arr.get(k+2).get(i+j);
                
                }
                sum=sum+arr.get(k+1).get(i+1);
                
                System.out.println("Sum:"+sum);
                max=Math.max(max,sum);
            }
            max=Math.max(max,sum);
        }
       
        return max;
    }

}

public class Hourglasses2DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*
Combinations
k=0,i=0,j=0
0,0					2,0
0,1		1,1		2,1
0,2					2,2

k=0,i=1,j=0
0,1					2,1
0,2		1,2		2,2
0,3					2,3

k=0,i=2,j=0
0,2					2,2
0,3		1,3		2,3
0,4					2,4

k=0,i=3,j=0
0,3					2,3
0,4		1,4		2,4
0,5					2,5

-----------------------------------------
k=1,i=0,j=0
1,0					3,0
1,1		2,1		3,1
1,2					3,2


1,1					3,1
1,2		2,2		3,2
1,3					3,3


1,2					3,2
1,3		2,3		3,3
1,4					3,4


1,3					3,3
1,4		2,4		3,4
1,5					3,5
-----------------------------------------

2,0					4,0
2,1		4,1		4,1
2,2					4,2


0,1					2,1
0,2		1,1		2,2
0,3					2,3


0,2					2,2
0,3		1,1		2,3
0,4					2,4


0,3					2,3
0,4		1,1		2,4
0,5					2,5
-----------------------------------------

3,0					5,0
3,1		5,1		5,1
3,2					5,2


0,1					2,1
0,2		1,1		2,2
0,3					2,3


0,2					2,2
0,3		1,1		2,3
0,4					2,4


0,3					2,3
0,4		1,1		2,4
0,5					2,5
*/
