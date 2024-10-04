package Animal;

public class Animall {
    protected String name;


    public Animall(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Animal[name=" + name + "]";
    }
}
