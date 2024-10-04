package Forma;

public class Main {
    public static void main(String[] args) {

        Circle circulo = new Circle(5.0, "azul", true);
        System.out.println("Circulo:");
        System.out.println("Area: " + circulo.getArea());
        System.out.println("Perimetro: " + circulo.getPerimeter());
        System.out.println(circulo);

        System.out.println();


        Rectangle rectangulo = new Rectangle(4.0, 7.0, "verde", false);
        System.out.println("Rectangulo:");
        System.out.println("Area: " + rectangulo.getArea());
        System.out.println("Perimetro: " + rectangulo.getPerimeter());
        System.out.println(rectangulo);

        System.out.println();

        Square cuadrado = new Square(3.0, "amarillo", true);
        System.out.println("Cuadrado:");
        System.out.println("Area: " + cuadrado.getArea());
        System.out.println("Perimetro: " + cuadrado.getPerimeter());
        System.out.println(cuadrado);
    }
}
