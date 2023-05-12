package org.example;

import java.util.Arrays;

public class Solution {
    public long mostPoints(int[][] questions) {
        long[] dp = new long[questions.length + 2];
        dp[dp.length - 1] = 0;
        for (int i = 2; i < dp.length ; i++) {
            dp[dp.length - i] = Math.max(dp[dp.length - i + 1], findPreviousAvailableQuestion(questions, questions.length - i + 1) + questions[questions.length - i + 1][0]);
        }
        System.out.println(Arrays.toString(dp));
        Arrays.sort(dp);
        return dp[dp.length - 1];
    }

    private long findPreviousAvailableQuestion(int[][] questions, int currentIndex) {
        int potentialIndex = currentIndex;
        while(potentialIndex != -1){
            if(potentialIndex + questions[potentialIndex][1] + 1 == currentIndex){
                return questions[potentialIndex][0];
            }
            potentialIndex--;
        }
        return  0;
    }
}
