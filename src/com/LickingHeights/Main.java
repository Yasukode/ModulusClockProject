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
    

    }



}
