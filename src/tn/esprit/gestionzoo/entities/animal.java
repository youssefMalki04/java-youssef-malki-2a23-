package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.exeptions.InvalidAgeException;


public class animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public animal() {}

    public animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0)
            throw new InvalidAgeException("The age must a positive number");
        else
            this.age = age;
    }
    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    @Override
    public String toString() {
        return "Family : " +  family  + " Name : " + name + " Age: " + age + " IsMammal : "+ isMammal;
    }
}