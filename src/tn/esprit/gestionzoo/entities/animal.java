package tn.esprit.gestionzoo.entities;

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

    @Override
    public String toString() {
        return "Family : " +  family  + " Name : " + name + " Age: " + age + " IsMammal : "+ isMammal;
    }
}