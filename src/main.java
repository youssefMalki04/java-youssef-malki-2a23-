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


    }

}
