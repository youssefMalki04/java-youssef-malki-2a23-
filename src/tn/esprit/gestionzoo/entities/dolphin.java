package tn.esprit.gestionzoo.entities;

public class dolphin extends aquatic{
    private final float swimmingSpeed;
    public dolphin(String habitat, float swimmingSpeed) {
        super();
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {

        return swimmingSpeed;
    }

    public String toString() {
        return "Dolphin [" + super.toString() + ", Swimming Speed: " + swimmingSpeed + " km/h]";
    }

    public void swim() {

        System.out.println("This dolphin is swimming.");
    }

}
