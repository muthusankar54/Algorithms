package io.muthu.algorithms_practice.UltimateDP_LeetCode;

public class ClimbingStairs {

    public static void main(String[] args) {

        int n=2;

        int result = climbStairs(n);

        System.out.println(result);

    }

    public static int climbStairs(int n) {

       int[] memo = new int[n+1];
       return climbStairsHelper(0,n,memo);
    }

    private static int climbStairsHelper(int i, int n, int[] memo) {

        if(i > n){
            return 0;
        }

        if(i == n){
            return 1;
        }

        if(memo[i] > 0){
            return memo[i];
        }

        memo[i] = climbStairsHelper(i+1,n,memo) + climbStairsHelper(i+2,n,memo);

        return memo[i];
    }
}
