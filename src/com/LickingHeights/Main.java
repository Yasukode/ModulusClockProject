package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ModulusClock();
    }
    public static void ModulusClock(){

        Scanner userInput = new Scanner(System.in);
    System.out.println("What is the hour?");

    int hours = userInput.nextInt();

    System.out.println("What are the minutes?");

    int minutes = userInput.nextInt();
     hours = minutes>60 ? ++hours: hours;
     hours = hours>12 ? hours-12: hours;

     System.out.println(minutes%60);
        System.out.printf("The time is: %d:%02d",hours,(minutes%60));
    }



}
