/*
 * Homework 3
 * Sebastian Tolomeo
 * 09/15/2019
 */
package javadevelopers;
import java.util.Scanner;

/**
 * A software solution company has Java Developers.
 * Developers are paid based on their skill level. 
 */

public class JavaDevelopers { //This method calculates net pay for java developers
                              //based on their skill level, hours worked, software
                              //tools purchased, and tax deductions

    
    public static void main(String[] args) { 
        
        //Declare Variables
        String sName = "";                      //Used to collect name
        int nPaidLevel = 0;                     //Paid level entered by user
        int nOption = 0;                        //Holds answer for software tools
        int nAnswer = 0;                        //Holds answer for each software tool
        double dHoursWorked = 0.0;              //Hours worked entered by user
        double dAmountEarned = 0.0;             //Holds amount earned
        double dOvertime = 0.0;                 //Holds overtime pay
        double dAmountDeductedTools = 0.0;      //Holds amount deducted for tools
        double dAmountDeductedTaxes = 0.0;      //Amount deducted from taxes
        double dPayCheck;                       //Calculated paycheck
        Scanner input = new Scanner(System.in); //Used to get input by user
        
        //Declare constants
        final int MAX_REG_HOURS = 40;           //Maximum regular hours
        final int INTERN_PAYRATE = 18;          //Intern pay rate
        final int JUNIOR_PAYRATE = 40;          //Junior pay rate 
        final int MIDDLE_PAYRATE = 60;          //Middle pay rate
        final int SENIOR_PAYRATE = 80;          //Senior pay rate
        final double FACTOR = 1.5;              //Factor used to compute overtime
        final double TAX = 0.075;               //Fixed tax amoount for deduction
        
        //Ask developer for name
        System.out.print("Please enter your name: ");
        //Collect name
        sName = input.nextLine();
        
        //Ask how many hours worked
        System.out.print("How many hours have you worked? ");
        //Collect hours
        dHoursWorked = input.nextDouble();
        
        //Ask paid level
        System.out.print("What is your paid level? ");
        //Collect paid level
        nPaidLevel = input.nextInt();
        
        //Skill level 1
        if(nPaidLevel == 1)  {
            //Earnings when regular hours are worked
            if (dHoursWorked <= MAX_REG_HOURS) {
                dAmountEarned = dHoursWorked * INTERN_PAYRATE;
            }
            //Earnings when overtime hours are worked
            else if (dHoursWorked > MAX_REG_HOURS) {
                //First 40 hours calculation
                dAmountEarned = MAX_REG_HOURS * INTERN_PAYRATE;
                //Overtime calculation
                dOvertime = (dHoursWorked - MAX_REG_HOURS) * INTERN_PAYRATE * FACTOR;
                //Amount earned calculation
                dAmountEarned = dAmountEarned + dOvertime;
            }//End hours worked > 0
            
        }//End skill level 1
        
        //Skill level 2
        else if (nPaidLevel == 2) {
            //Mandatory deduction from Java 101
            dAmountDeductedTools = 30;
            
            //Ask if they would like to purchase software tools
            System.out.print("Would you like to purchase software tools (1 = Yes, 2 = No)? ");
            //Collect input
            nOption = input.nextInt();
            
            //If they say yes
            if (nOption == 1) {
                //Ask if they would like Java 102
                System.out.print("Would you like to purchase Java 102 – Android (1 = Yes, 2 = No)? ");
                //Collect input
                nAnswer = input.nextInt();
                
                //Developer says "Yes" for 102
                if (nAnswer == 1) {
                    //Amount deducted from purchasing Java 102
                    dAmountDeductedTools = dAmountDeductedTools + 10;
                    } //End 102
                
                //Ask for purchase of Java 103
                System.out.print("Would you like to purchase Java 103 – Web (1 = Yes, 2 = No)? ");
                //Collect input
                nAnswer = input.nextInt();
                
                //Developer says "Yes" for 103
                if (nAnswer == 1) {
                    //Amount deducted for purchasing Java 103
                    dAmountDeductedTools = dAmountDeductedTools + 15;  
                    } //End 103
                
                //Ask for purchase of Java 104
                System.out.print("Would you like to purchase Java 104 – Enterprise (1 = Yes, 2 = No)? ");
                //Collect input
                nAnswer = input.nextInt();
                
                //Developer says "Yes" for 104
                if (nAnswer == 1) {
                    //Amount deducted for purchasing Java 104
                    dAmountDeductedTools = dAmountDeductedTools + 25;
                    } //End 104
                
                }//End validation for optional packages
                
                //Pay if hours worked are less or equal to 40
                if (dHoursWorked <= MAX_REG_HOURS) {
                dAmountEarned = dHoursWorked * JUNIOR_PAYRATE;
            }
            //Pay when developer works extra time
            else if (dHoursWorked > MAX_REG_HOURS) {
                //Calculate amount for first 40 hours
                dAmountEarned = MAX_REG_HOURS * JUNIOR_PAYRATE;
                //Calculate overtime pay
                dOvertime = (dHoursWorked - MAX_REG_HOURS) * JUNIOR_PAYRATE * FACTOR;
                //Calculate amount earned
                dAmountEarned = dAmountEarned + dOvertime;
            }//End hours worked > 40
                
        }// End validation skill level 2
        
        
        //Skill Level 3
        else if (nPaidLevel == 3) {
            //Mandatory deduction for Java 101
            dAmountDeductedTools = 30;
            
            //Ask if they would like to purchase software tools
            System.out.print("Would you like to purchase software tools (1 = Yes, 2 = No)? ");
            //Collect input
            nOption = input.nextInt();
            
            //If they say yes
            if (nOption == 1) {
                //Ask if they would like Java 102
                System.out.print("Would you like to purchase Java 102 – Android (1 = Yes, 2 = No)? ");
                //Collect input
                nAnswer = input.nextInt();
                
                //Developer says "Yes" for 102
                if (nAnswer == 1) {
                    //Amount deducted from purchasing Java 102
                    dAmountDeductedTools = dAmountDeductedTools + 10;
                    } //End 102
                
                //Ask for purchase of Java 103
                System.out.print("Would you like to purchase Java 103 – Web (1 = Yes, 2 = No)? ");
                //Collect input
                nAnswer = input.nextInt();
                
                //Developer says "Yes" for 103
                if (nAnswer == 1) {
                    //Amount deducted for 103
                    dAmountDeductedTools = dAmountDeductedTools + 15;  
                    } //End 103
                
                //Ask for purchase of Java 104
                System.out.print("Would you like to purchase Java 104 – Enterprise (1 = Yes, 2 = No)? ");
                nAnswer = input.nextInt();
                
                //Developer says "Yes" for 104
                if (nAnswer == 1) {
                    //Amount deducted for purchasing Java 104
                    dAmountDeductedTools = dAmountDeductedTools + 25;
                    } //End 104
                
                }// End validation for optional package
            
                //Pay if hours are less than or equal to 40
                if (dHoursWorked <= MAX_REG_HOURS) {
                dAmountEarned = dHoursWorked * MIDDLE_PAYRATE;
            }
            //Pay when developer works extra time
            else if (dHoursWorked > MAX_REG_HOURS) {
                //Calculate amount earned for first 40 hours
                dAmountEarned = MAX_REG_HOURS * MIDDLE_PAYRATE;
                //Calculate overtime pay
                dOvertime = (dHoursWorked - MAX_REG_HOURS) * MIDDLE_PAYRATE * FACTOR;
                //Calculate amount earned with overtime
                dAmountEarned = dAmountEarned + dOvertime;
            }//End hours worked > 40
                
        }//End validation skill level 3
        
        
        //Skill level 4
        else if (nPaidLevel == 4) {
            //Mandatory deduction for Java 101
            dAmountDeductedTools = 30;
            
            //Ask if they would like to purchase software tools
            System.out.print("Would you like to purchase software tools (1 = Yes, 2 = No)? ");
            //Collect input
            nOption = input.nextInt();
            
            //If they say yes
            if (nOption == 1) {
                //Ask if they would like Java 102
                System.out.print("Would you like to purchase Java 102 – Android (1 = Yes, 2 = No)? ");
                //Collect input
                nAnswer = input.nextInt();
                
                //Developer says "Yes" for 102
                if (nAnswer == 1) {
                    //Amount deducted for Java 102
                    dAmountDeductedTools = dAmountDeductedTools + 10;
                    } //End 102
                
                //Ask for purchase of Java 103
                System.out.print("Would you like to purchase Java 103 – Web (1 = Yes, 2 = No)? ");
                //Collect input
                nAnswer = input.nextInt();
                
                //Developer says "Yes" for 103
                if (nAnswer == 1) {
                    //Amount deducted for Java 103
                    dAmountDeductedTools = dAmountDeductedTools + 15;  
                    } //End 103
                
                //Ask for purchase of Java 104
                System.out.print("Would you like to purchase Java 104 – Enterprise (1 = Yes, 2 = No)? ");
                nAnswer = input.nextInt();
                
                //Developer says "Yes" for 104
                if (nAnswer == 1) {
                    //Amount deducted for purchasing Java 104
                    dAmountDeductedTools = dAmountDeductedTools + 25;
                    } //End 104
                
                }//End validation for optional package
                
                //If hours worked are 40 or less
                if (dHoursWorked <= MAX_REG_HOURS) {
                dAmountEarned = dHoursWorked * SENIOR_PAYRATE;
            }
            //If hours worked are greater than 40
            else if (dHoursWorked > MAX_REG_HOURS) {
                //Calculate total for first 40 hours
                dAmountEarned = MAX_REG_HOURS * SENIOR_PAYRATE;
                //Calculate overtime pay
                dOvertime = (dHoursWorked - MAX_REG_HOURS) * SENIOR_PAYRATE * FACTOR;
                //Calculate total amount earned
                dAmountEarned = dAmountEarned + dOvertime;
            }//End hours worked >40
                
        }// End validation skill level 4
        
        //Calculate total amount deducted from taxes
        dAmountDeductedTaxes = (dAmountEarned - dAmountDeductedTools) * TAX;
        //Calculate final paycheck
        dPayCheck = (dAmountEarned - dAmountDeductedTools) - dAmountDeductedTaxes;
        
        //Display developer informastion
        System.out.println("\nDeveloper Information");
        
        //Display developer's name
        System.out.println("Developer's name: " + sName);
        
        //Display skill level
        System.out.println("Skill Level: " + nPaidLevel);
        
        //Display total hours worked
        System.out.println("Total hours worked: " + dHoursWorked);
        
        //Display amount earned
        System.out.println("Amount Earned: $" + dAmountEarned);
        
        //Display amount deducted from tools
        System.out.println("Amount Deducted from Tools: $" + dAmountDeductedTools);
        
        //Display amount deducted from taxes
        System.out.println("Amount Deducted from Taxes: $"+ dAmountDeductedTaxes);
        
        //Display final paycheck amount
        System.out.println("Final Paycheck Amount: $" + dPayCheck);
            
        }//End main method
    
} //End class JavaDevelopers
