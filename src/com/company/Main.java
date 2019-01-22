package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Please enter a number.");
        int numberEntered;
        int numberMax = 500;
        int total = 0;
        int numbers = 1;


        do
        {
            numberEntered = userInput.nextInt();
            total = total + numberEntered;


            if (total <= numberMax)
            {
                System.out.println("Please enter a number again.");
                numbers ++;
            }

        }
        while (total <= numberMax);

        System.out.println("You reached a total of " + total + " to finally obatin a total greater than 500.");

        if (numbers == 1)
        {
            System.out.println("You entered " + numbers + " number.");
        }
        else
        {
            System.out.println("You entered " + numbers + " numbers.");
        }

    }
}
