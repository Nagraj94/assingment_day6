package com.bridgelabz.logical_programs;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
         long n, sum = 0;
         Scanner sc = new Scanner(System.in);
        System.out.println("enter number to find out perfect number");

        n = sc.nextLong();

        int i = 1;
        while (i<=n/2)
        {
            if(n % i == 0)
            {
                sum = sum + i;
            }
            i++;
        }
        if(sum == 0)
        {
            System.out.println("entered number is perfect number");
        }
        else
        {
            System.out.println("entered number is not a perfect number");
        }
    }
}