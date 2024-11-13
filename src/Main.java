
public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();
        Employee e = new Employee(1, "ahmed", "chiboub", "dep1", 2);
        Employee e2 = new Employee(5, "youssef", "chiboub", "dep2", 1);
        Employee e3 = new Employee(2, "louay", "chiboub", "dep3", 1);
        Employee e4 = new Employee(7, "sami", "chiboub", "dep3", 6);

        societe.ajouterEmploye(e);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);

        System.out.println("Liste des employés :");


        societe.supprimerEmploye(e3);


        System.out.println("\nRecherche de l'employé employe3 (louay chiboub) :");
        System.out.println(societe.rechercherEmploye(e2) ? "Employé trouvé" : "Employé non trouvé");


        System.out.println("\nListe des employés triée par ID :");
        societe.trierEmployeParId();

        System.out.println("\nListe des employés triée par nom de département et grade :");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();












    }
}