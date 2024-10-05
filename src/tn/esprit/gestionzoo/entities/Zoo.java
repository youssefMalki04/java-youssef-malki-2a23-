package tn.esprit.gestionzoo.entities;

public class Zoo {
    animal[] animals;
    String name;
    String city;
    static final int NBR_CAGES=25;
    int nbrAnimal;

    public Zoo() {}

    public Zoo( String name, String city) {
        animals = new animal[NBR_CAGES];
        this.name = name;
        this.city = city;

    }

    public void displayZoo(){
        System.out.println("zoo: ");
        System.out.println("name: " + name);
        System.out.println("city: " + city);
        System.out.println("nbrCages: " + NBR_CAGES);


    }

    public String toString(){
        return "zoo : " + " name : "  + name + " city : " + city + " nombres de cages :  " + NBR_CAGES;

    }

    public boolean addAnimal(animal animal){

        if (nbrAnimal >= NBR_CAGES) {
            System.out.println("Le zoo est plein, impossible d'ajouter l'tn.esprit.gestionzoo.entities.animal.");
            return false;
        }
        for (int i = 0; i < nbrAnimal; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return false;
            }
        }
        if (nbrAnimal < NBR_CAGES ) {
            animals[nbrAnimal] = animal;
            nbrAnimal++;
            return true;
        } else {
            return false;
        }

    }
    public void displayAnimals() {
        for (int i = 0; i < nbrAnimal; i++) {
            System.out.println(animals[i]);
        }
    }
    public int searchAnimal(animal animal) {

        for (int i = 0; i < nbrAnimal; i++) {
            if (animals[i] == animal) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(animal animal) {
        for (int i = 0; i < nbrAnimal; i++) {
            if (animals[i] == animal) {
                animals[i] = null;
                nbrAnimal--;
                return true;
            }
        }
        return false;
    }

    public boolean isZooFull(){
        return nbrAnimal >= NBR_CAGES;

    }
    public int getNbrAnimal() {
        return nbrAnimal;
    }

    Zoo  comparerZoo(Zoo z1, Zoo z2){
        if (z1.getNbrAnimal() > z2.getNbrAnimal()) {
            return z1;
        } else if (z1.getNbrAnimal() < z2.getNbrAnimal()) {
            return z2;
        } else {
            return null;
        }
    }




}
