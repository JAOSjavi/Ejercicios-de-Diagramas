package Persona;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Javier Ordoñez", "1080");
        System.out.println(person.toString());


        Student student = new Student("Danilo ibarra", "Obonuco City", "ING INDUSTRIAL", 2, 10000.50);
        System.out.println(student.toString());


        Staff staff = new Staff("Juanjo Uribe", "Calle 13", "Deerecho", 75000.00);
        System.out.println(staff.toString());
    }
}
