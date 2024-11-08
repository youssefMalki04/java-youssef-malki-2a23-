package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.exeptions.ZooFullException;
public class Zoo {
    animal[] animals;
    String name;
    String city;
    static final int NBR_CAGES=25;
    int nbrAnimal;
    private aquatic[] aquaticAnimals=new aquatic[10];
    private int nbrAquaticsAnimals;

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

    public boolean addAnimal(animal animal) throws ZooFullException {

        if (nbrAnimal >= NBR_CAGES) {
            System.out.println("Le zoo est plein, impossible d'ajouter l'tn.esprit.gestionzoo.entities.animal.");
            return false;
        }
        for (int i = 0; i < nbrAnimal; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return false;
            }
        }
        if (isZooFull()) {
            throw new ZooFullException("The Zoo is full");
        }
        animals[nbrAnimal] = animal;
        nbrAnimal++;
        return true;
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


    public void addAquaticAnimal(aquatic aquatic){
        if (aquaticAnimals == null) {
            aquaticAnimals = new aquatic[NBR_CAGES];
        }
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] == null) {
                aquaticAnimals[i] = aquatic;
                return;
            }
        }
        System.out.println("Le zoo est plein, impossible d'ajouter un animal aquatic.");

    }
    public float maxPenguinSwimmingDepth()
    {
        float maxPenguinSwimmingDepth=0;
        for(int i=0 ; i<nbrAquaticsAnimals ; i++)
        {
            if(aquaticAnimals[i] instanceof penguin)
            {
                penguin p = (penguin) aquaticAnimals[i];
                if(p.getSwimmingDepth() > maxPenguinSwimmingDepth)
                {
                    maxPenguinSwimmingDepth = p.getSwimmingDepth();
                }
            }
        }
        return maxPenguinSwimmingDepth;
    }

    public void displayNumberOfAquaticsByType()
    {
        int penguins = 0;
        int dauphins =0;

        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i]!= null) {
                if (aquaticAnimals[i] instanceof penguin) {
                    penguins++;

                } else if (aquaticAnimals[i] instanceof dolphin) {
                    dauphins++;
                }
            }
        }

        System.out.println("Nombre de penguins : " + penguins);
        System.out.println("Nombre de dauphin : " + dauphins);

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
