package io.muthu.algorithms_practice.UltimateDP_LeetCode;

public class FibonacciSeries {

    public static void main(String[] args) {

        int n= 5;

        int result = fib(n);

        System.out.println(result);
    }

    public static int fib(int n) {

        if(n<=1){
            return n;
        }

        return fib(n-1) + fib(n-2);
    }
}
