package com.employ;

class Emp
{
    String name;
    String city;
    int age;

    public void display()
    {
        System.out.println("The Name is:"+name);
        System.out.println("The age is:"+age);
        System.out.println("The City is:"+city);
    }
}
public class Employee
{
    public static void main(String[] args)
    {
        Emp e=new Emp();
        e.name="Saurabh";
        e.age=23;
        e.city="Chennai";
        e.display();

        Emp e1=new Emp();
        e1.name="abc";
        e1.age=23;
        e1.city="Pune";
        e1.display();

    }

}
