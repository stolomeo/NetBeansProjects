
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// This Program reads data from a data files, creates objects based on the data from the files
// and store the objects in an ArrayList. It uses two user-defined methods
public class EmployeeDemo {
 
     // The main program will call two method to store and print Objects from ArrayLists
    public static void main(String[] args) throws FileNotFoundException {
        
        ArrayList<Employee> empList = new ArrayList<>(); // Array list to store Employee objects
        
        // call method generateListEmp
        generateListEmp(empList);
        
        // foor loop to print the information of each Object stored in the ArrayList 
        for (int nIndex = 0; nIndex < empList.size(); nIndex++)
            // call method printEmployeeInfo and pass an object reference variable stored in an ArrayList 
            printEmployeeInfo(empList.get(nIndex));
        
    }// end main method
    
     // method to read and store Employee Objects in the ArayList 
    public static void generateListEmp(ArrayList<Employee> empList) throws FileNotFoundException{
        
        File fileToOpen = new File("Employee.txt");
        Scanner inputFile = new Scanner(fileToOpen);
        String sInputLine = "";     
        String[] saTokens = null;
        
        // loop to read the file Employee.txt
        while(inputFile.hasNext()){
            //Read line from the file
            sInputLine = inputFile.nextLine();
            //Split the line read from the file into individual attributes
            saTokens = sInputLine.split(":");
            // Create a new Employee using the default constructor
            Employee emp = new Employee();
            // Set the first name
            emp.setFirstName(saTokens[0]);
            // Set the last name
            emp.setLastName(saTokens[1]);
            // Set the DoB
            emp.setDoB(saTokens[2]);
            // Set Bonus1
            emp.setBonus1(Double.parseDouble(saTokens[3]));
            // Set Bonus2
            emp.setBonus2(Double.parseDouble(saTokens[4]));
            // Adding an Employee Object in the ArrayList 
            empList.add(emp);
            
        } // end while loop read file
        // close the file
        inputFile.close();
        
    }// end generateListEmp
    
    // method to print the information of the Employee objects
    public static void printEmployeeInfo(Employee myEmp){
            System.out.println("Employee name: " + myEmp.getFirstName() + " " + myEmp.getLastName().toUpperCase());
            System.out.println("Average Bonus: " + myEmp.compBonusAvg());
            System.out.println("");
    }// end method printEmployeeInfo
    
}// end class EmployeeDemo