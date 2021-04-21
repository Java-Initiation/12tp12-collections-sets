package sets;

public class Pays {
    String nom;
    int nbHabitants;
    double pibParHabitants;
    public Pays(String nom, int nbHabitants, double pibParHabitants) {
        this.nbHabitants = nbHabitants;
        this.nom = nom;
        this.pibParHabitants = pibParHabitants;
    }
    public double getPibTotal() {
        return nbHabitants * pibParHabitants;
    }
    public int getNbHabitants() {
        return nbHabitants;
    }
    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public double getPibParHabitants() {
        return pibParHabitants;
    }
    public void setPibParHabitants(double pibParHabitants) {
        this.pibParHabitants = pibParHabitants;
    }
    @Override
    public String toString() {
        return "Pays{" +
                "nbHabitants=" + nbHabitants +
                ", nom='" + nom + '\'' +
                ", pibParHabitants=" + pibParHabitants +
                '}';
    }
}