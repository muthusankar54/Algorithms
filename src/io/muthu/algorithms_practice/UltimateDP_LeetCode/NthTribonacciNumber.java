package io.muthu.algorithms_practice.UltimateDP_LeetCode;

public class NthTribonacciNumber {

    public static void main(String[] args) {

        int n=25;

        int result = tribonacci(n);

        System.out.println(result);
    }

    public static int tribonacci(int n) {

        if(n ==0){
            return 0;
        }else if(n <= 2){
            return 1;
        }else{
            int a =0;
            int b=1;
            int c=1;
            int index = 3;
            int sum = 0;

            while (index <=n){
                sum = a+ b+c;
                index++;
                a =b;
                b=c;
                c= sum;

            }
            return  sum;
        }
        
    }

}
