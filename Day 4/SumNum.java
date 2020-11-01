package com.employ;

import java.util.Scanner;

public class SumNum {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int []a=new int[5];
        int sum=0;
        System.out.println("Enter the numbers:");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        for (int i=0;i<5;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("Sum:"+sum);
    }
}
