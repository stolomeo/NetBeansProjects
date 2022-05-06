
public class CircleApplication {

    
    public static void main(String[] args) {
        
        Circle myCircle1 = new Circle();            //Create circle object with default constructor
        Circle myCircle2 = new Circle(8.0);         //Create circle object with overloaded constructor
        myCircle1.setRadius(50.0);
        System.out.println("The radius is "+ myCircle1.getRadius());
        System.out.println("The Area of the circle is: " + myCircle1.compArea());
        System.out.println("The Perimeter is " + myCircle1.compPerimeter());
        System.out.println("The radius is "+ myCircle2.getRadius());
        System.out.println("The area of the circle is: " + myCircle2.compArea());
        
    }
    
}
