package com.employ;

import java.io.IOException;
import java.lang.String;
import java.lang.System;
import java.util.Scanner;

class AvengerInfo {
    Scanner sc = new Scanner(System.in);
    String name;
    int age,power;
    String weapon, planet;

    public void getDetails(){
        System.out.println("Enter the name");
        name = sc.next();
        System.out.println("Enter the age");
        age = sc.nextInt();
        System.out.println("Enter the power");
        power = sc.nextInt();
        System.out.println("Enter the weapon");
        weapon = sc.next();
        System.out.println("Enter the planet");
        planet = sc.next();

    }

    public void setDetails() {
        System.out.println("The name is:" + name);
        System.out.println("The age is:" + age);
        System.out.println("The power is:" + power);
        System.out.println("The Weapon is:" + weapon);
        System.out.println("The planet is:" + planet);

    }
}
class Avenger {
    public static void main(String[] args) {
        AvengerInfo[] avg = new AvengerInfo[5];
        System.out.println("Avenger  1:");
        avg[0].getDetails();
        avg[0].setDetails();

        System.out.println("Avenger  2:");
        avg[1].getDetails();
        avg[1].setDetails();

        System.out.println("Avenger  3:");
        avg[2].getDetails();
        avg[2].setDetails();

        System.out.println("Avenger  4:");
        avg[3].getDetails();
        avg[3].setDetails();

        System.out.println("Avenger  5:");
        avg[4].getDetails();
        avg[4].setDetails();

    }

}
