import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;
public class DepartementHashSet implements IDepartement<Departement> {
    private HashSet<Departement> departements;
    public DepartementHashSet() {
        this.departements = new HashSet<>();
    }
    @Override
    public void ajouterDepartement(Departement d) {
        if (departements.add(d)) {
            System.out.println("Département ajouté avec succès : " + d);
        } else {
            System.out.println("Le département existe déjà : " + d);
        }
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        return departements.stream().anyMatch(dep -> dep.getNomD().equalsIgnoreCase(nom));
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return departements.contains(d);
    }

    @Override
    public void supprimerDepartement(Departement d) {
        if (departements.remove(d)) {
            System.out.println("Département supprimé : " + d);
        } else {
            System.out.println("Département introuvable : " + d);
        }
    }

    @Override
    public void displayDepartement() {
        if (departements.isEmpty()) {
            System.out.println("Aucun département enregistré.");
        } else {
            departements.forEach(System.out::println);
        }

    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> sortedDepartements = new TreeSet<>(Comparator.comparingInt(Departement::getId));
        sortedDepartements.addAll(departements);
        return sortedDepartements;
    }
}
