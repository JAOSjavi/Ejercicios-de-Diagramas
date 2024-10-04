package Animal;

public class Main {
    public static void main(String[] args) {

        Cat gato = new Cat("Michi");
        System.out.println(gato);
        gato.greets();  

        System.out.println();

 
        Dog perro1 = new Dog("Firulais");
        System.out.println(perro1);
        perro1.greets();  

        System.out.println();

        Dog perro2 = new Dog("Rex");
        System.out.println(perro2);
        perro1.greets(perro2); 
    }
}
