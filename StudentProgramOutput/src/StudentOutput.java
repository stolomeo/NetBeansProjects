import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentOutput {

    //Begin main method
    public static void main(String[] args) throws FileNotFoundException {
       
        //Declare variables
        ArrayList<Student> stuList = new ArrayList<>(); // Array list to store student objects  
        
        //Call method generateListStu
        generateListStu(stuList);
        
        //Print student report
        System.out.println("STUDENT REPORT");
        System.out.println("");
        //Print number of students
        System.out.println("Number of Students: " + Student.getnNumberOfStudents());
        System.out.println("");
        
        //For loop to print the information of each Object stored in the ArrayList
        for (int nIndex = 0; nIndex < stuList.size(); nIndex++)
            // Call method printStudentInfo and pass an object reference variable stored in an ArrayList 
            printStudentInfo(stuList.get(nIndex));
        
    }//End main method
        
    
    
    //Begin generateListStu
    public static void generateListStu(ArrayList<Student> stuList) throws FileNotFoundException{
        File fileToOpen = new File("Students.txt"); //Variable to hold name of file
        Scanner inputFile = new Scanner(fileToOpen); //Scanner to read data from file
        String sInputLine = "";     //Variable to hold lines of file
        String[] saTokens = null;   //Array to split the data of each line
        
        //loop to read the file Students.txt
        while(inputFile.hasNext()){
            //Read line from the file
            sInputLine = inputFile.nextLine();
            //Split the line read from the file into individual attributes
            saTokens = sInputLine.split(";");
            // Create a new Student using the default constructor
            Student stu = new Student();
            // Set the id
            stu.setId(saTokens[0]);
            // Set the first name
            stu.setFirstName(saTokens[1]);
            // Set the last name
            stu.setLastName(saTokens[2]);
            // Set the street
            stu.setStreet(saTokens[3]);
            // Set the city
            stu.setCity((saTokens[4]));
            // Set the state
            stu.setState((saTokens[5]));
            // Set the zip code
            stu.setZipCode(Integer.parseInt(saTokens[6]));
            // Set the phone number
            stu.setPhone((saTokens[7]));
            // Set the email
            stu.setEmail((saTokens[8]));
            // Set the major id
            stu.setMajorId(Integer.parseInt(saTokens[9]));
            // Set the expected grad date
            stu.setExpectedGradDate((saTokens[10]));
            // Adding a student Object in the ArrayList 
            stuList.add(stu);
        
        }//End while loop read file
        // Close file
        inputFile.close();
                 
    }//End generateListStu
    
    //Method to print student info
    public static void printStudentInfo(Student myStu){
        //Print student ID, name, graduation date, phone number, email, address, major ID
        System.out.println("Student ID: " + myStu.getId().trim());
        System.out.println("Name: " + myStu.getFirstName() + " " + myStu.getLastName().toUpperCase());  
        System.out.println("Expected Graduation date: " + myStu.getExpectedGradDate());
        System.out.println("Phones: (" + myStu.getPhone().substring(0, 3) + ")" + myStu.getPhone().substring(3, 6) + "-" + myStu.getPhone().substring(6, 10));
        System.out.println("Email: " + myStu.getEmail().replace("my.", ""));
        System.out.println("Address: " + myStu.getStreet() + " , " + myStu.getCity() + " , " + myStu.getState() + " , " + myStu.getZipCode());
            
        //If for major id to name
        if (myStu.getMajorId() == 10){//Begin if
            System.out.println("Major: Music");
        }//End if
        else if (myStu.getMajorId() == 20){//Begin else if
            System.out.println("Major: History");
        }//End else if id = 20
        else if (myStu.getMajorId() == 30){//Begin else if
            System.out.println("Major: Art");
        }//End else if id = 30
        else if (myStu.getMajorId() == 40){//Begin else if
            System.out.println("Major: Early Childhood Education");
        }//End else if id = 40
        else if (myStu.getMajorId() == 50){//Begin else if
            System.out.println("Major: Architecture");
        }//End else if id = 50
        else if (myStu.getMajorId() == 60){//Begin else if
            System.out.println("Major: Computer Science");
        }//End else if id = 60
        else if (myStu.getMajorId() == 70){//Begin else if
            System.out.println("Major: Social Sciences");
        }//End else if id = 70
        System.out.println("");
    }// end method printStudentInfo
    
}//End class