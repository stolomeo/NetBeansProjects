
public class Student { //Begin class
    private String sFirstName;              //Holds value for first name
    private String sLastName;               //Holds value for last name
    private int nQuiz1;                     //Holds value for quiz1
    private int nQuiz2;                     //Holds value for quiz2
    private int nQuiz3;                     //Holds value for quiz3
    private int nStudentId;                 //Holds value for student ID
    private static int nNextStudentId;      //Holds value for next student ID
    private static int QUIZZES;             //Holds value for number of quizzes
    
    //Default constructor
    public Student(){
        nStudentId = nNextStudentId;            //Make nStudentID equal to nNextStudentId for count
        nNextStudentId++;                       //Increment by 1
    }//End default constructor
    
    //Overloaded constructor
    public Student(String sStudentName, String sStudentLastname, int nInitQuiz1, int nInitQuiz2, int sInitQuiz3){
        nStudentId = nNextStudentId;            //Make nStudentID equal to nNextStudentId for count
        nNextStudentId++;                       //Increment by 1 
        sFirstName = sStudentName;              //sFirstName equal to sStudentName
        sLastName = sStudentLastname;           //sLastName equal to sStudentLastName
        nQuiz1 = nInitQuiz1;                    //nQuiz1 equal to nInitQuiz1
        nQuiz2 = nInitQuiz2;                    //nQuiz2 equal to nInitQuiz2
        nQuiz3 = sInitQuiz3;                    //nQuiz3 equal to nInitQuiz3   
    }//End Overloaded constructor
    
    //Begin calculateQuizAverage
    public double calculateQuizAverage(){
        //Declare Variables
        double dQuizAvg = 0.0;                  //Holds value for quiz average
        //Calculate quiz average
        dQuizAvg = (double)(nQuiz1 + nQuiz2 + nQuiz3) / QUIZZES;
        //Return value
        return dQuizAvg;                        
    }//End calculateQuizAverage
    
    //Begin computeStudentGrade
    public String computeStudentGrade(){
        //Declare variables
        String sGrade = "";                     //Holds value for grade
        double dQuizAverage = calculateQuizAverage();   //Pass calculation to dQuizAverage
        //Begin if statement
        if (dQuizAverage >= 93){
            //If avg > 93
            sGrade = "A";
            }//End if
        else if (dQuizAverage >= 90 && dQuizAverage < 93){//Begin else
            //If avg >=90 and <93
            sGrade = "A-";
        }//End else
        else if (dQuizAverage >= 87 && dQuizAverage < 90){//Begin else
            //If avg >=87 and <90
            sGrade = "B+";
        }//End else
        else if (dQuizAverage >= 83 && dQuizAverage < 87){//Begin else
            //If avg >=83 and < 87
            sGrade = "B";
        }//End else
        else if (dQuizAverage >= 80 && dQuizAverage < 83){//Begin else
            //If avg >=80 and < 83
            sGrade = "B-";
        }//End else
        else if (dQuizAverage >= 77 && dQuizAverage < 80){//Begin else
            //If avg >=77 and < 80
            sGrade = "C+";
        }//End else
        else if (dQuizAverage >= 73 && dQuizAverage < 77){//Begin else
            //If avg >=73 and < 77
            sGrade = "C";
        }//End else
        else if (dQuizAverage >= 70 && dQuizAverage < 73){//Begin else
            //If avg >=70 and < 73
            sGrade = "C-";
        }//End else
        else if (dQuizAverage >= 67 && dQuizAverage < 70){//Begin else
            //If avg >=67 and < 70
            sGrade = "D+";
        }//End else
        else if (dQuizAverage >= 63 && dQuizAverage < 67){//Begin else
            //If avg >=63 and < 67
            sGrade = "D";
        }//End else
        else if (dQuizAverage >= 60 && dQuizAverage < 63){//Begin else
            //If avg >=60 and < 63
            sGrade = "D-";
        }//End else
        else if (dQuizAverage >= 0 && dQuizAverage < 60){//Begin else
            //If avg >=0 and < 60
            sGrade = "F";
        }//End else
        
        //Return value
        return sGrade;
        
    }
    
    //Begin showStudentFullName
    public String showStudentFullName(){
        //Declare variables
        String sFullName = "";              //Holds full name
        sFullName = sFirstName + sLastName; //First name + last name = full name
        return sFullName;                   //Return full name
    }//End showStudentFullName
    
    //Begin getFirstName
    public String getFirstName(){
        return sFirstName;                  //Return first name
    }//End getFirstName
    
    //Begin getLastName
    public String getLastName(){
        return sLastName;                   //Return last name
    }//End getLastName
    
    //Begin getStudentId
    public int getStudentId(){
        return nStudentId;                  //Return student id
    }//End getStudentId
    
    //Begin getNextStudentId
    public int getNextStudentId(){          
        return nNextStudentId;              //Return next student id
    }//End get Student Id
    
    //Begin getQuiz1
    public int getQuiz1(){
        return nQuiz1;                      //Return nQuiz1
    }//End getQuiz1
    
    //Begin getQuiz2
    public int getQuiz2(){
        return nQuiz2;                      //Return nQuiz2
    }//End getQuiz2
    
    //Begin getQuiz3
    public int getQuiz3(){
        return nQuiz3;                      //Return nQuiz3
    }//End getuiz3
    
    //Begin setFirstName
    public void setFirstName(String sNewFirstName){
        //Set sFirstName == sNewFirstName
        sFirstName = sNewFirstName;
    }//End getFirstName
    
    //Begin setLastName
    public void setLastName(String sNewLastName){
        //Set sLastName = sNewLastName
        sLastName = sNewLastName;
    }//End setLastName
    
    //Begin setQuiz1
    public void setQuiz1(int nNewQuiz1){
        if (nNewQuiz1 > 0){//Begin if
            //if true, set value
            nQuiz1 = nNewQuiz1;
        }//End if
        else {//Begin else
            //If value < 0, display "wrong data"
            System.out.println("Wrong data!");
        }//End else
        
    }//End setQuiz1
    
    
    //Begin setQuiz2
    public void setQuiz2(int nNewQuiz2){
        if (nNewQuiz2 > 0){//Begin if
            //If true, set value
            nQuiz2 = nNewQuiz2;
        }
        else {//Begin else
            //If value < 0, display "wrong data"
            System.out.println("Wrong data!");
        }//End else
        
    }//End setQuiz2
    
    
    //Begin setQuiz3
    public void setQuiz3(int nNewQuiz3){
        if (nNewQuiz3 > 0){//Begin if
            //If true set value
            nQuiz3 = nNewQuiz3;
        }//End if
        else {//Begin else
            //If value < 0, display "wrong data"
            System.out.println("Wrong data!");
        }//End else
        
    }//End setQuiz3
    
    //Begin printStudentInfo
    public void printStudentInfo(){
        System.out.println("Student Account Information:");                 //Display header
        System.out.println("StudentId: #" + nStudentId);                    //Display student id      
        System.out.println("Quiz Score1: " + nQuiz1);                       //Display quiz score 1
        System.out.println("Quiz Score2: " + nQuiz2);                       //Display quiz score 2
        System.out.println("Quiz Score3: " + nQuiz3);                       //Display quiz score 3
        System.out.println("Quiz Average: " + calculateQuizAverage());      //Display quiz average
        System.out.println("Student Grade: " + computeStudentGrade());      //Display student grade
        System.out.println("Student Full name: " + showStudentFullName());  //Display full name
    }//End printStudentInfo
        
        
    
}//End class