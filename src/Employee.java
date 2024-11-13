public class Employee {
    private int id;
    private String prenom;
    private String nom;
    private String nom_dep;
    private int grade;

    public Employee(int id, String prenom, String nom, String nom_dep, int grade) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.nom_dep = nom_dep;
        this.grade = grade;
    }
    public Employee(){}

    public int getId() {
        return id;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getNom_dep() {
        return nom_dep;
    }

    public int getGrade() {
        return grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNom_dep(String nom_dep) {
        this.nom_dep = nom_dep;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Employee employe = (Employee) obj;
        return id == employe.id && nom.equals(employe.nom);
    }

    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDepartement='" + nom_dep + '\'' +
                ", grade=" + grade +
                '}';
    }




}
