package com.employ;

import java.util.Queue;
import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark[] = new int[5];
        float sum = 0;
        float per;

        System.out.println("Enter the 5 sub marks");
        for (int i = 0; i < 5; i++) {
            mark[i] = sc.nextInt();
            sum = sum + mark[i];
        }
        per = (sum / 500) * 100;
        System.out.println("Percentage is:" + per);
        if (per >= 80 && per <= 100) {
            System.out.println("A grade");
        } else if (per >= 60 && per < 80) {
            System.out.println("B grade");
        } else if (per >= 40 && per < 60) {
            System.out.println("C grade");
        } else {
            System.out.println("Failed");
        }
    }

}

