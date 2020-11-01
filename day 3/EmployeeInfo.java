package com.employ;

import java.util.Scanner;

public class EmployeeInfo {
    public static  void  main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String empnm;
        int birthdate,birthmonth,birthyear;
        float salary,tax=0;
        int age;
        System.out.println("Enter the emloyee name");
        empnm=sc.nextLine();
        System.out.println("Enter the birth date");
        birthdate=sc.nextInt();
        System.out.println("Enter the birth month");
        birthmonth=sc.nextInt();
        System.out.println("Enter the birth year");
        birthyear=sc.nextInt();
        System.out.println("Enter the salary");
        salary=sc.nextFloat();

        if(salary>=500000)
        {
            tax=500000*20/100;
        }
        else if(salary>=400000)
        {
            tax=400000*15/100;
        }
        else if(salary>=300000)
        {
            tax=300000*10/100;
        }
        else if(salary>=200000)
        {
            tax=200000*5/100;
        }
        age=birthyear-2020;
        System.out.println("employee name:"+empnm);
        System.out.println("Age:"+age);
        System.out.println("Salary:"+salary);
        System.out.println("Tax amount:"+tax);



    }
}
