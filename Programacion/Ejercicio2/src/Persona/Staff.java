package Persona;

public class Staff extends Person {

    private String school;
    private double paid;


    public Staff(String name, String address, String school, double paid) {
        super(name, address);
        this.school = school;
        this.paid = paid;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return paid;
    }

    public void setPay(double paid) {
        this.paid = paid;
    }


    @Override
    public String toString() {
        return "Staff[" + super.toString() + ",School=" + school + ",paid=" + paid + "]";
    }
}
