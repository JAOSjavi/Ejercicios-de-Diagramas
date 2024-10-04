package Animal;

public class Mammal extends Animall {

    public Mammal(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}
