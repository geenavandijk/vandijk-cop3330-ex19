/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Geena-Maria van Dijk
 */

package org.example;

import java.util.Scanner;

public class BMICalculator {

    static public void main (String[] args){
        Scanner input = new Scanner(System.in);

        int weight, height;

        System.out.println("Enter your height in inches: ");
        height = input.nextInt();

        if (Character.isDigit(height)){
            System.out.println("Invalid input");
            System.exit(0);
        }

        System.out.println("Enter your weight in pounds: ");
        weight = input.nextInt();

        if (Character.isDigit(weight)){
            System.out.println("Invalid input");
            System.exit(0);
        }

        float bmi = (float) ((1.0*weight)/(height*height)) * 703;

        System.out.printf("Your BMI is %.1f.\n", bmi);

        if (bmi < 18.5)
            System.out.println("You are underweight. You should see your doctor.");
        else if (bmi > 25)
            System.out.println("You are overweight. You should see your doctor. ");
        else
            System.out.println("You are within the ideal weight range. ");
    }
}
