package org.example;

public class Solution {
    public long mostPoints(int[][] questions) {
        long[] dp = new long[questions.length];
        long res = 0L;
        int n = questions.length;
        for(int i = n - 1; i >= 0; i--){
            int val = questions[i][0];
            int skip = questions[i][1] + 1;
            if(i + skip < n){
                dp[i] = Math.max(val + dp[i + skip], dp[i + 1]);
            }else dp[i] = i ==  n - 1 ? val : Math.max(dp[i + 1], val);
            res = Math.max(res, dp[i]);
        }

        return res;
    }
}

