package org.example;

public class Solution {
    public long mostPoints(int[][] questions) {
        long[] dp = new long[questions.length + 1];
        dp[dp.length - 1] = questions[dp.length - 2][0];
        for (int i = dp.length - 2; i > 0; i--) {
            if (i + 1 + questions[i - 1][1] < dp.length) {
                dp[i] = Math.max(dp[i + 1], questions[i - 1][0] + dp[i + 1 + questions[i - 1][1]]);
            } else dp[i] = Math.max(dp[i + 1], questions[i - 1][0]);
        }

        return dp[1];
    }
}

