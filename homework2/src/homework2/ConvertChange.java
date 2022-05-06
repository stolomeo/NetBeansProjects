/*
 * Homework 2
 * Sebastian Tolomeo
 * 09/08/2019
 */
package homework2;
import java.util.Scanner;

/**
 * This program displays the amount of half dollars, quarters,
 * dimes, nickels, and pennies returned to the customer to
 * arrive at the total change entered by the customer
 */

public class ConvertChange {  //This method prompts the user for input, then
                              //calculates and displays the total amount for the 
                              //type of coin needed to fulfill change to customer

    
    public static void main(String[] args) {
        
        //Declare variables
        int nCents = 0;                //Number of cents entered by user
        int nTotHalfDollar = 0;        //Total of half dollars calculated by user input
        int nTotQuarter = 0;           //Total of quarters calculated by user input
        int nTotDime = 0;              //Total of dimes calculated by user input
        int nTotNickel = 0;            //Total of nickels calculated by user input
        int nTotPenny = 0;             //Total of pennies calculated by user input
        String sName = ""              //Used to collect user's name
        Scanner input = new Scanner(System.in);  //used to read input from the console
        
        //Declare constants
        final int nHalfDollar = 50;    //Number of cents in a half dollar
        final int nQuarter = 25;       //Number of cents in a quarter
        final int nDime = 10;          //Number of cents in a dime
        final int nNickel = 5;         //Number of cents in a nickel
        final int nPenny = 1;          //Number of cents in a penny
        
       
        //Introduction to user
        System.out.println("Welcome to the amazing and smart Change Machine!");
        
        //Indentation
        System.out.println("-----------------------------------\n");
        
        //Prompt for user's name
        System.out.print("Please enter your name: ");
        
        //Read Name from user
        sName = input.next();
        
        //New line
        System.out.println();   
        
        //Prompt for user's amount of change
        System.out.print("Please enter your amount of change in cents: ");
        
        //Read cents from user
        nCents = input.nextInt();
        
        //New line
        System.out.println();
                
        
        //Compute total amount of half dollars, quarters, dimes, nickels, pennies
        nTotHalfDollar = nCents/nHalfDollar;  //Calculates total number of half dollars
        nCents %= nHalfDollar;                //take remainder
        nTotQuarter = nCents/nQuarter;        //Calculates total number of quarters
        nCents %= nQuarter;                   //Take remainder
        nTotDime = nCents/nDime;              //Calculates total number of dimes
        nCents %= nDime;                      //Take Remainder
        nTotNickel = nCents/nNickel;          //Calculates total number of nickels
        nCents %= nNickel;                    //Take Remainder
        nTotPenny = nCents/nPenny;            //Calculates total number of pennies
        nCents %= nPenny;                     //Take Remainder
        
        //Display details of user's change
        System.out.println("Details of your change:");
        
        //Indentation
        System.out.println("-----------------------------------\n");
                
        //Display total amounts to user
        
        //Display total half dollars
        System.out.println("Half dollars to be returned: " + nTotHalfDollar);
        
        //Displays total quarters
        System.out.println("Quarters to be returned: " + nTotQuarter);
        
        //Displays total dimes
        System.out.println("Dimes to be returned: " + nTotDime);   
        
        //Displays total nickels
        System.out.println("Nickels to be returned: " + nTotNickel);
        
        //Displays total pennies
        System.out.println("Pennies to be returned: " + nTotPenny);            
        
        
    } //end main method
    
} //end Homework2 Class
