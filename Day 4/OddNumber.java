package com.employ;

import java.util.Scanner;

public class OddNumber {
    public  static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter the numbers");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {

            if(a[i]%2!=0)
            {
                System.out.println(a[i]);
            }
        }

    }
}
