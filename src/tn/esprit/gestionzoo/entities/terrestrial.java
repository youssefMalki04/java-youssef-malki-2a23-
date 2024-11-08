package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.Enum.Food;
import tn.esprit.gestionzoo.interfaces.Omnivore;


 public  class terrestrial extends animal implements Omnivore<Food>  {
      protected int nbrLegs;
      public terrestrial(int nbrLegs) {
            this.nbrLegs = nbrLegs;
      }

      public int getNbrLegs() {
            return nbrLegs;
      }


      public void eatMeat(Food meat) {
            if (meat == Food.MEAT || meat == Food.PLANT || meat == Food.FISH) {
                  System.out.println("Terrestrial animal is eating meat.");
            } else {
                  System.out.println("Terrestrial animal cannot eat plants only.");
            }
      }

      @Override
      public void eatPlant(Food plant) {
            if (plant == Food.MEAT || plant == Food.PLANT || plant == Food.FISH) {
                  System.out.println("Terrestrial animal is eating plants.");
            } else {
                  System.out.println("Terrestrial animal cannot eat meat only.");
            }
      }

      @Override
      public void eatPlantAndMeat(Food food) {
            if (food == Food.PLANT || food == Food.MEAT ) {
                  System.out.println("Terrestrial animal is eating both plants and meat.");
            } else {
                  System.out.println("Terrestrial animal cannot eat only one type of food.");
            }
      }






}
