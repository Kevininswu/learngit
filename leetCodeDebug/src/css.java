class css {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        //列数
        int n=obstacleGrid[0].length;

        int[][] dp = new int[m][n];


        for (int i = 1; i < m&&obstacleGrid[i][0]==0; i++) {
            dp[i][0] = 1;

        }
        for (int j = 1; j < n&&obstacleGrid[0][j]==0; j++) {
            dp[0][j] = 1;

        }
        for (int k = 1; k <m; ++k) {
            for (int h = 1; h < n; ++h) {
                if(obstacleGrid[k][h]==0){
                    dp[k][h]=dp[k][h-1]+dp[k-1][h];
                }
                else{
                    dp[k][h]=0;
                }

            }
        }


        return dp[m-1][n-1];
    }
}
