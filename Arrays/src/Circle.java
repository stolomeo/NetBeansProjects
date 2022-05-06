
public class Circle {
    private double dRadius=1.0;
    
    //Default constructor
    //COnstructur has the same name as the class
    public Circle(){
        dRadius = 1.0;
    }//end of default constructor
    
    //Overloaded constructor
    public Circle(double dNewRadius){
        if(dNewRadius > 0){
            dRadius = dNewRadius;
        }
        else{
            System.out.println("Wrong data!");
        }
        
        
    }//end default constructor
    
    //Setter of mutators (void = returning no value)
    public void setRadius(double dNewRadius){
       if(dNewRadis > 0){
           dRadius = dNewRadius; 
       }
       else{
           System.out.println("Please enter correct data!!");
       }
       dRadius = dNewRadius;      
    }
    
    //getter of accessors
    public double getRadius(){
        return dRadius;
    }
    
    public double compArea(){
        double dArea = 0.0;
        dArea = dRadius * dRadius * 3.1415;
        return dArea;
    }
    
    public double compPerimeter(){
        double dPerimeter = 0.0;
        dPerimeter = 2*3.1415*dRadius;
        return dPerimeter;
        
        
        
    }
}
