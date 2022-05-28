package com.bridgelabz.logical_programs;

public class FibonacciSeries {

        static int ib(int n) {
            if (n <= 1)
                return n;
            return ib(n - 1) + ib(n - 2);
        }

        public static void main(String args[]) {
            int n = 20;
            System.out.println(ib(n));
        }

}
