package EjercicioCiruculo;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------Circle----------");
        Circle circle = new Circle(3.0, "blue");
        System.out.println("Circle:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Color: " + circle.getColor());
        System.out.println("Area: " + circle.getArea());
        System.out.println(circle.toString());
        
        System.out.println("----------------Cylinder-----------------"); 

        Cylinder cylinder = new Cylinder(3.0, 5.0, "green");
        System.out.println("Cylinder:");
        System.out.println("Radius: " + cylinder.getRadius());
        System.out.println("Height: " + cylinder.getHeight());
        System.out.println("Color: " + cylinder.getColor());
        System.out.println("Base Area: " + cylinder.getArea());  
        System.out.println("Volume: " + cylinder.getVolume());
        System.out.println(cylinder.toString());
    }
}