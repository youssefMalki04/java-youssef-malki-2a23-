package tn.esprit.gestionzoo.entities;

 abstract class aquatic extends animal{
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
}
