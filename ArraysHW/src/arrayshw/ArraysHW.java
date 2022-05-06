
package arrayshw;
//Import Scanner
import java.util.Scanner;


public class ArraysHW {

    
    public static final int SIZE = 3;           //Constant for size of array
    public static void main(String[] args) { //Begin main method. Used to call all other methods.
       //Scanner
       Scanner input = new Scanner(System.in);
       //Student names
       String[] saStudents = new String[SIZE];                  //Holds student Names
       double[] daStudQuizScore1 = new double[SIZE];            //Holds student 1 quiz score
       double[] daStudQuizScore2 = new double[SIZE];            //Holds student 2 quiz score
       double[] daStudQuizScore3 = new double[SIZE];            //Holds student 3 quiz score
       double[] daAverageScorePerStudent = new double[SIZE];    //Holds avergae quiz score per student
       double dTotScoreAvg = 0.0;                               //Holds total average score for all students
       
       //Call method enterStudentNames
       enterStudentNames(saStudents);           
       //Call method enterScore
       enterScore(saStudents, daStudQuizScore1, daStudQuizScore2, daStudQuizScore3);
       //Call method compAverageScorePerStud
       daAverageScorePerStudent = compAverageScorePerStud(daStudQuizScore1, daStudQuizScore2, daStudQuizScore3);
       //Call method compTotalScoreAvg
       dTotScoreAvg = compTotalScoreAvg(daAverageScorePerStudent);
       //Call method printStudReport
       printStudReport(saStudents, daStudQuizScore1, daStudQuizScore2, daStudQuizScore3, daAverageScorePerStudent);
       //Print class quiz average
       System.out.println("Class quiz average: " + dTotScoreAvg);
       
    }//End main method
    
    //This method will print out the student quiz report.
    public static void printStudReport(String[] saStudNames, double[] daStudScore1, double[] daStudScore2, double[] daStudScore3, double[] daAvgScoreStud){
        //Declare variables
        int nIndex = 0;                     //Holds total ocunt
        //Headers for column
        System.out.println("STUDENT REPORT\n\n");
        System.out.println("Name                Quiz1               Quiz2               Quiz3               Quiz Average");
        System.out.println("------              ------              ------              ------              ------");
        //For loop
        for (nIndex = 0; nIndex < SIZE; nIndex++) { //Begin for loop
            System.out.println(saStudNames[nIndex] + "                  " + daStudScore1[nIndex] + "                   " + daStudScore2[nIndex] + "                 " + daStudScore3[nIndex] + "                " + daAvgScoreStud[nIndex]);
        }//End for loop
    }//End printStudentReport
    
    //This method will return the total quiz average for all students
    public static double compTotalScoreAvg(double[] daAvgScore) {//Begin method
        //Declare variagles
        double dTotalScoreAvg = 0.0;                    //Holds total score average
        double dTotalScore = 0.0;                       //Total Score
        int nIndex = 0;                                 //Holds count
        //For loop
        for (nIndex = 0; nIndex < SIZE; nIndex++) { //Begin for loop
            //Calculate dTotalScore
            dTotalScore = dTotalScore + daAvgScore[nIndex];  
        }//End For loop to compute total fo the bonus
        //Compute dTotalScoreAvg
        dTotalScoreAvg = dTotalScore/SIZE;          
        //Return dTotalScoreAvg
        return dTotalScoreAvg;  
    }//end compTotalscoreAvg
    
    //This method will compute the average score per student
    public static double[] compAverageScorePerStud(double[] daS1, double[] daS2, double[] daS3){//Begin method
    double[] daAvgScorePerStud = new double[SIZE];      //Array daAvgScorePerStud
    int nCount = 0;                 //Holds count
        //for loop
        for (nCount = 0; nCount < SIZE; nCount++) {//Begin for loop
            //Compute daAvgScorePerStud
            daAvgScorePerStud[nCount] = (daS1[nCount] + daS2[nCount] + daS3[nCount]) / 3.0;
            }//End loop
        return daAvgScorePerStud;   //Return daAvgScorePerStud
    
}//End compAverageScorePerStud
        
    //This method will allow the user to enter the quiz scores for each student
    public static void enterScore(String[] saStudNames, double[] daScore1, double[] daScore2, double[] daScore3) {//Begin method
        //Scanner tool
        Scanner input = new Scanner(System.in);
        //For loop
        for (int nCount3 = 0; nCount3 < SIZE; nCount3++) {//Begin loop
            //Prompt for quiz1
            System.out.print("Enter quiz1 for " + saStudNames[nCount3] + ": ");
            //Collect quiz1
            daScore1[nCount3] = input.nextDouble();
        }//End loop
        //Add blank line
        System.out.println("");
        for (int nIndex = 0; nIndex < SIZE; nIndex++) {//Begin loop
            //Prompt for quiz1
            System.out.print("Enter quiz2 for " + saStudNames[nIndex] + ": ");
            //Collect quiz2
            daScore2[nIndex] = input.nextDouble();
        }//End loop
        //Add blank line
        System.out.println("");
        for (int nIndex1 = 0; nIndex1 < SIZE; nIndex1++) {//Begin loop
            //Prompt for quiz1
            System.out.print("Enter quiz3 for " + saStudNames[nIndex1] + ": ");
            //Collect quiz3
            daScore3[nIndex1] = input.nextDouble();
        }//End loop
        //Add blank line
        System.out.println("");
    }//End enterScore
    
    //This method will allow the professor to enter student names
    public static void enterStudentNames(String[] saStudentNames) {//Begin method
        //Scanner tool
        Scanner input = new Scanner(System.in);
        //Declare variables
        int nCount = 0;
        //For loop
        for (nCount = 0; nCount < 3; nCount++) {//Begin loop
            //Prompt for student name
            System.out.print("Enter Student name: ");
            //Collect student name
            saStudentNames[nCount] = input.next();           
        }//End loop
        //Add blank line
        System.out.println("");
    }//End enterStudentNames
    
    
}//End class
