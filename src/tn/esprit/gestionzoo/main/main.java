package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.animal;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.dolphin;
import tn.esprit.gestionzoo.entities.penguin;
import tn.esprit.gestionzoo.entities.terrestrial;



public class main {
    public static void main(String[] args) {
        animal lion = new animal("canibale", "Lion", 5, true);
        animal tigre = new animal("canibale", "tigre", 6, true);
        animal ours = new animal("canibale", "ours", 7, true);
        animal chevre = new animal("herbivore", "chevre", 8, true);
        animal[] animals = new animal[25];
        Zoo myZoo = new Zoo("yyy", "tunis");



        System.out.println(myZoo);

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(tigre));
        System.out.println(myZoo.addAnimal(ours));


        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(ours));

        myZoo.removeAnimal(ours);

        myZoo.displayAnimals();

        //prosit(5):
        dolphin dolphin1 = new dolphin("Ocean", 20);
        penguin penguin1 = new penguin("Antarctica", 30);
        terrestrial terrestrialAnimal = new terrestrial(4);
        System.out.println("Dolphin Habitat: " + dolphin1.getHabitat() + ", Swimming Speed: " + dolphin1.getSwimmingSpeed());
        System.out.println("Penguin Habitat: " + penguin1.getHabitat() + ", Swimming Depth: " + penguin1.getSwimmingDepth());
        System.out.println("Terrestrial Animal Legs: " + terrestrialAnimal.getNbrLegs());

        penguin1.swim();
        dolphin1.swim();
        myZoo.displayNumberOfAquaticsByType();



    }

}
