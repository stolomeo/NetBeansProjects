
public class TestCircle {

   
    public static void main(String[] args) {
        double dCircleRadius = 0.0;
        double dArea = 0.0;
        double dPerimeter = 0.0;
        
        Circle myCircle = new Circle(10.0);
        myCircle.setRadius(50.0);
        dCircleRadius = myCircle.getRadius();
        dArea = myCircle.compArea();
        dPerimeter = myCircle.compPerimeter();
        
        System.out.println("The radius of the circle is: " +  dCircleRadius);
        System.out.println("The area of the circle is: " + dArea);
        System.out.println("The perimeter is: " + dPerimeter);
    }
    
}
