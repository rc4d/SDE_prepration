package Arrays;

public class RangeSumQuery2DImmutable304 {
    int [][]matrix;
    public RangeSumQuery2DImmutable304(int[][] matrix) {
        this.matrix=matrix;
        for(int i=1;i<matrix.length;i++){
            
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=matrix[i][j]+matrix[i-1][j];

            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                matrix[i][j]=matrix[i][j]+matrix[i][j-1];
            }
        }

        /*for(int i=0;i<matrix.length;i++){
            System.out.println();
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+"\t");
            }
        }*/
    }
    //top~row1. left~col1 bottom~row2 right~col2
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum=0;
        if(row1==0 && col1==0){
            sum=matrix[row2][col2];
        }
        else if(row1==0){
            sum=matrix[row2][col2]-matrix[row2][col1-1];
        }
        else if(col1==0){
            sum=matrix[row2][col2]-matrix[row1-1][col2];
        }
        else{
            sum=matrix[row2][col2]-matrix[row1-1][col2]-matrix[row2][col1-1]+matrix[row1-1][col1-1];
        }
        return sum;
    }
}


/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */