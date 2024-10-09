package tn.esprit.gestionzoo.entities;

public class penguin extends aquatic{
    private float swimmingDepth;

    public penguin(String habitat, float swimmingDepth) {
        super(habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public String toString() {
        return "Penguin [" + super.toString() + ", Swimming Depth: " + swimmingDepth + " meters]";
    }




}
