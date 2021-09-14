package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Rebecca Pina Partidas
 */

// Libraries
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner numInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);
        double tax = 0;
        double taxRate = 0;
        double total = 0;

        // Calculates tax and total
        System.out.print("What is the order amount? ");
        double orderAmt = numInput.nextDouble();

        System.out.print("What state do you live in? ");
        String state = stringInput.nextLine();

        System.out.print("What county do you live in? ");
        String county = stringInput.nextLine();

        // Adds taxes based on state and county
        if (state.equals("Wisconsin"))
        {
            taxRate = 0.05;

            if (county.equals("Eau Claire"))
            {
                taxRate += 0.005;
            }

            if (county.equals("Dunn"))
            {
                taxRate += 0.004;
            }

            tax = taxRate * orderAmt;
        }

        if (state.equals("Illinois"))
        {
            taxRate = 0.08;
            tax = taxRate * orderAmt;
        }

        total = orderAmt + tax;

        System.out.format("The tax is $%.2f. \n", tax);
        System.out.format("The total is $%.2f. \n", total);
    }
}
