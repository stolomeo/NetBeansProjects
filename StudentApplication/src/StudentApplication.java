import java.util.Scanner; //Import scanner
public class StudentApplication {//Begin class
    

    
    public static void main(String[] args) {//Begin main method
        Scanner input = new Scanner(System.in); //Scanner input
        //Declare variables
        Student myStudent1 = null;              //Set myStudent1 equal to null
        int nOption = 0;                        //Holds user selection
        String sFirstName = "";                 //Holds first name
        String sLastName = "";                  //Holds last name
        int nQuiz1 = 0;                         //Holds quiz score 1
        int nQuiz2 = 0;                         //Holds quiz score 2
        int nQuiz3 = 0;                         //Holds quiz score 3
        int nStudentId = 0;                     //Holds initial student id
        
        //Declare constants
        final int SENTINEL = 13;                //Option to end loop
        
                
        //Display menu
        System.out.println("STUDENT PROCESSING MENU");
        System.out.println("1. Create new Student – empty Student");
        System.out.println("2. Create new Student – information available");
        System.out.println("3. Set Student First Name:");
        System.out.println("4. Set Student Last Name:");
        System.out.println("5. Enter Quiz1 Score:");
        System.out.println("6. Enter Quiz2 Score:");
        System.out.println("7. Enter Quiz3 Score:");
        System.out.println("8. Get Quiz Average");
        System.out.println("9. Get Student Id");
        System.out.println("10. Get Next Available Id");
        System.out.println("11. Get Student Grade");
        System.out.println("12. Print Student Information");
        System.out.println("13. Exit");
        System.out.println("");
        
        //Prompt for selection
        System.out.print("Please enter your preferred option: ");
        //Collect selection
        nOption = input.nextInt();

        
        while (nOption != SENTINEL){//Begin while Loop
                if(nOption == 1){//Begin if for option 1
                    myStudent1 = new Student();
                    //Display message
                    System.out.println("Student successfully created.");
                    //Get student id
                    System.out.println("Student Id #"+ myStudent1.getStudentId());
                    System.out.println(""); //blank line
                    
                }//End if
                else if(nOption == 2){//Begin else for option 2
                    //Ask for first name
                    System.out.print("Please enter student first name: ");
                    //Scan first name
                    sFirstName = input.next();
                    //Ask for last name
                    System.out.print("Please enter student last name: ");
                    //Scan last name
                    sLastName = input.next();
                    //Ask for quiz score 1
                    System.out.print("Enter Quiz1 Score: ");
                    //Scan quiz score 1
                    nQuiz1 = input.nextInt();
                    //Ask for quiz score 2
                    System.out.print("Enter Quiz2 Score: ");
                    //Scan quiz score 2
                    nQuiz2 = input.nextInt();
                    //Ask for quiz score 3
                    System.out.print("Enter Quiz3 Score: ");
                    //Scan quiz score 3
                    nQuiz3 = input.nextInt();
                    
                    //Pass variables through
                    myStudent1 = new Student(sFirstName, sLastName, nQuiz1, nQuiz2, nQuiz3);
                    
                    //Display message
                    System.out.println("Student successfully created.");
                    //Get student id
                    System.out.println("Student Id #" + myStudent1.getStudentId());
                    //Blank line
                    
                    
                    
                }//End else 2
                else if(nOption == 3){//Begin else if option 3
                    //Prompt for first name
                    System.out.print("Please enter Student First Name: ");
                    //Scan first name
                    sFirstName = input.next();
                    //Call setFirstName
                    myStudent1.setFirstName(sFirstName);
                    System.out.println("");//Blank line
                    
                    
                    
                }//End else 3
                else if(nOption == 4){//Begin else 4
                    //Prompt for last name
                    System.out.print("Please enter Student Last Name: ");
                    //Scan last name
                    sLastName = input.next();
                    //Call setLastName
                    myStudent1.setLastName(sLastName);
                    System.out.println("");//Blank line
                    
                }//End else 4
                else if(nOption == 5){//Begin else 5
                    //Ask for quiz score 1
                    System.out.print("Enter Quiz1 Score: ");
                    //Scan quiz score 1
                    nQuiz1 = input.nextInt();
                    //setQuiz1
                    myStudent1.setQuiz1(nOption);
                    System.out.println("");//Blank line
                    
                    
                }//End else 5
                else if(nOption == 6){//Begin else 6
                    //Ask for quiz score 2
                    System.out.print("Enter Quiz2 Score: ");
                    //Scan quiz 2
                    nQuiz2 = input.nextInt();
                    //Set quiz 2
                    myStudent1.setQuiz2(nOption);
                    System.out.println("");//Blank line
                    
                }//End else 6
                else if(nOption == 7){//Begin else 7
                    //Ask for quiz score 3
                    System.out.print("Enter Quiz3 Score: ");
                    //Scan quiz 3
                    nQuiz3 = input.nextInt();
                    //Set quiz 3
                    myStudent1.setQuiz3(nOption);
                    System.out.println("");//Blank line
                }//End quiz 3
                
                else if(nOption == 8){//Begin else 8
                    //Print quiz average
                    System.out.println("Quiz Average: " + myStudent1.calculateQuizAverage());
                    
                }//End else 8
                
                else if(nOption == 9){//Begin else 9
                    //Print Student id#
                    System.out.println("Student Id: #" + myStudent1.getStudentId());
                    
                }//End else 9
                
                else if(nOption == 10){//Begin else 10
                    //Print next student ID #
                    System.out.println("Next Student Id: #" + myStudent1.getNextStudentId());
                    
                }//End else 10
                else if(nOption == 11){//Begin else 11
                    //Print student grade
                    System.out.println("Student Grade: " + myStudent1.computeStudentGrade());
                    
                }//End else 11
                
                else if(nOption == 12){//Begin else 12
                    //Print student info
                    myStudent1.printStudentInfo();
                    
                }//End else 12
                //Prompt for selection
                System.out.print("Please enter your preferred option: ");
                //Scan option
                nOption = input.nextInt();
                
        }//End while loop
    
}//End main method
}//End class
