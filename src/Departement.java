import java.util.Objects;
public class Departement {
    private int id;
    private String nomD;
    private int nbrEmployes;

    public Departement(int id, String nomD, int nbrEmployes) {
        this.id = id;
        this.nomD = nomD;
        this.nbrEmployes = nbrEmployes;

    }
    public Departement(){}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomD() {
        return nomD;
    }

    public void setNomD(String nomD) {
        this.nomD = nomD;
    }

    public int getNbrEmployes() {
        return nbrEmployes;
    }

    public void setNbrEmployes(int nbrEmployes) {
        this.nbrEmployes = nbrEmployes;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Departement departement = (Departement) obj;
        return id == departement.id && Objects.equals(nomD, departement.nomD);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, nomD);
    }

    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom de departement ='" + nomD + '\'' +
                ", nombre d'employes='" + nbrEmployes + '\''
                 +
                '}';
    }


}
