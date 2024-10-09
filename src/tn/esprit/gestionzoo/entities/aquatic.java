package tn.esprit.gestionzoo.entities;

public class aquatic extends animal{
     protected String habitat;
     public aquatic(String habitat) {
          this.habitat = habitat;
     }
     public  String getHabitat() {
          return habitat;
     }

     public String toString() {
          return "Habitat: " + habitat;
     }

     public void swim() {
          System.out.println("This aquatic animal is swimming.");
     }
}
