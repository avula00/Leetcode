class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rowCounts = new int[m];
        int[] colCounts = new int[n];

        for (int[] index : indices) {
            rowCounts[index[0]]++;
            colCounts[index[1]]++;
        }

        int oddCells = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((rowCounts[i] + colCounts[j]) % 2 != 0) {
                    oddCells++;
                }
            }
        }

        return oddCells;
    }
}