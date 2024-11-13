import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employee>{
    private List<Employee> employes = new ArrayList<>();
    @Override
    public void ajouterEmploye(Employee employee) {
        employes.add(employee);


    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employee employe : employes) {
            if (employe.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean rechercherEmploye(Employee employee) {
        for (Employee e : employes) {
            if (e.equals(employee)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEmploye(Employee employee) {
        employes.remove(employee);

    }

    @Override
    public void displayEmploye() {
        for (Employee employe : employes) {
            System.out.println(employe);
        }

    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes, Comparator.comparingInt(Employee::getId));

    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(employes, Comparator.comparing(Employee::getNom_dep)
               .thenComparingInt(Employee::getGrade));


    }
}
