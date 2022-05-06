
public class Circle {
    private double dRadius;
    private static int nNumberOfCircles;
    
    //Default construtor
    public Circle(){
        dRadius = 1.0;
        nNumberOfCircles++;
        
    }
    //Overloaded constructor
    public Circle(double dInitialRadius){
        dRadius = dInitialRadius;
        nNumberOfCircles++;
        
    }
    
    //setter or mutator
    public void setRadius(double dNewRadius){
        if(dNewRadius > 0){
            dRadius = dNewRadius;
        }
        else {
            System.out.println("Wrong data!");
        }
        
        
    }
    
    //getter
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
        dPerimeter = 2*dRadius*3.1415;
        return dPerimeter;
    }       
    
    
    
    
}
