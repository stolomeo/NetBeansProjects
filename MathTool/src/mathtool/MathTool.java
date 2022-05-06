/*
 * Sebastian Tolomeo
 * 09/21/2019
 * Homework 4
 */
package mathtool;
import java.util.Scanner;  //import scanner


/**
 * This program can detect if 
 * numbers are odd or even and
 * performs fun activities with them
 */
public class MathTool { //Begin class MathTool

    public static void main(String[] args) { //Begin main method
        //Scanner tool to collect data
        Scanner input = new Scanner(System.in);
        //Declare variables       
        int nCount = 0;                     //Used to count # of inputs
        int nNum = 0;                       //Used to collect # from user
        int nSum = 0;                       //Used to store sum of all inputs
        int nOddCount = 0;                  //Used to count # of odds
        int nEvenCount = 0;                 //Used to count # of evens
        int nSumOdds = 0;                   //Used to store sum of all odds
        int nSumEvens = 0;                  //Used to store sum of all evens
        int nGreatestOdd = 0;               //Used to hold greatest odd
        int nGreatestEven = 0;              //Used to hold greatest even
        double dAvgOdds = 0.0;              //Used to hold average of odds
        double dAvgEvens = 0.0;             //Used to hold average of evens
        double dAvg = 0.0;                  //Used to hold average of all inputs
        String sName = "";                  //Used to hold user's name
        
        //Declare Constants
        final int SENTINEL = 99;            //Used to exit loop
        final int EVEN_READER = 2;          //Used to detect if # is even or odd
        
        
        //Introduction
        System.out.println("*************************************");
        //Prompt for name
        System.out.print("Please enter student name: ");
        //Collect Name
        sName = input.nextLine();
        
        //Indentation
        System.out.println("*************************************\n");
        //Greet user
        System.out.println("Hello, " + sName);
        //Explain program
        System.out.println("This program will run until you type 99\n");
        //Ask for input
        System.out.print("Please enter a positive number: ");
        //Collect input from user
        nNum = input.nextInt();
        
        //While loop
        while (nNum != SENTINEL) { //while loop begin
            //If number is greater than 0
            if (nNum > 0) { //If number is greater than 0
                nCount++;
                
                if (nNum % EVEN_READER != 0) { //If number is Odd
                    //Increase oddcount by 1
                    nOddCount++;
                    //Calculate sum of odds
                    nSumOdds = nSumOdds + nNum;
                    //If number is greater than greatest odd
                    if (nNum > nGreatestOdd) { //Calcuulate greatest odd
                        //Calculate greatest odd
                        nGreatestOdd = nNum;
                    }//end calculate max odd
                    }//end if num is odd
                else if (nNum % EVEN_READER == 0){ //If number is even
                    //Increase evencount by 1
                    nEvenCount++;
                    //Calculate sum of evens
                    nSumEvens = nSumEvens + nNum;
                    
                    //If number is greater than greatest even
                    if (nNum > nGreatestEven) {
                        //Calculate greatest even
                        nGreatestEven = nNum;
                    }//end calculate max even
                    }//end if num is even
                 }//end if num is greater than 0
            //If number is less than 0
            else if (nNum < 0) {
                //Print error message
                System.out.println("Sorry, the number must be > 0");
            }
            //Ask for input
            System.out.print("Please enter a positive number: ");
            //Collect input
            nNum = input.nextInt();
            
        }//end while loop
        
        nSum = nSumOdds + nSumEvens;                //Sum calculation
        dAvg = (double)nSum/nCount;                 //Average calculation
        dAvgOdds = (double)nSumOdds/nOddCount;      //Average of odds calculation
        dAvgEvens = (double)nSumEvens/nEvenCount;   //Average of evens calculation
       
        
        
        
        //End Message
        System.out.println("*********************************************************");
        System.out.println("*                   SUMMARY REPORT                      *");    //Display Summary report
        System.out.println("            You entered " + nCount + " numbers");               //DIsplay amount of inputs
        System.out.println("            " + nEvenCount + " of them are even numbers");      //Display number of even inputs
        System.out.println("            " + nOddCount + " of them are odd numbers");        //Display number of odd inputs
        System.out.println("            The sum of the numbers is: " + nSum);               //Display total sum    
        System.out.println("            The average of the numbers is: " + dAvg);           //Display total average
        System.out.println("            The sum of the odd numbers is: " + nSumOdds);       //Display sum of odds
        System.out.println("            The average of the odd numbers is: " + dAvgOdds);   //Display average of odds
        System.out.println("            The sum of the even numbers is: " + nSumEvens);     //Display sum of evens
        System.out.println("            The average of the even number is: " + dAvgEvens);  //Display average of evens
        System.out.println("            The greatest odd number is: " + nGreatestOdd);      //Display greatest odd
        System.out.println("            The greatest even number is: "+ nGreatestEven);     //Display greatest even
                
                
        
        } //End main method
    
}//End class MathTool
