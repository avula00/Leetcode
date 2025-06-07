class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int row=0;row<n-1;row++){
            for(int col=0;col<m-1;col++){
                if(matrix[row][col]!=matrix[row+1][col+1]){
                    return false;
                }
            }
        }
       return true; 
    }
}