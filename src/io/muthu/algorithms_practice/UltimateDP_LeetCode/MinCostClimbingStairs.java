package io.muthu.algorithms_practice.UltimateDP_LeetCode;

public class MinCostClimbingStairs {


    public static void main(String[] args) {

        int[] cost = {10,15,20};
        int result =  minCostClimbingStairs(cost);
        System.out.println(result);

    }

    public static int minCostClimbingStairs(int[] cost) {

        int [] stairsCost = new int[cost.length];

        stairsCost[0] = cost[0];
        stairsCost[1] = cost[1];

        for(int i=2;i<cost.length;i++){
            stairsCost[i] = cost[i]+Math.min(stairsCost[i-1],stairsCost[i-2]);
        }


        return Math.min(stairsCost[cost.length-2],stairsCost[cost.length-1]);
    }
}
