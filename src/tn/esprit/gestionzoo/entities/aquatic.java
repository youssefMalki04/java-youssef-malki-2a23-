package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.entities.Enum.Food;
import tn.esprit.gestionzoo.interfaces.Carnivore;

abstract class aquatic extends animal implements Carnivore<Food> {
     protected String habitat;
     public aquatic() {}
     public aquatic(String habitat,String family,String name, int age, boolean isMammal) {
          super(family,name,age,isMammal);
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

    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.PLANT || meat == Food.FISH) {
            System.out.println("Aquatic animal is eating meat.");
        } else {
            System.out.println("Aquatic animal cannot eat plants.");
        }
    }
}
