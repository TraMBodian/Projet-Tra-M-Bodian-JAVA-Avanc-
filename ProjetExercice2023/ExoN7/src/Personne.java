import java.text.SimpleDateFormat;
import java.util.Date;

public class Personne {

    private String nom;
    private Date dateDeNaissance;
    private double taille;

    public Personne(String nom, Date dateDeNaissance, double taille) {
        this.nom = nom;
        this.dateDeNaissance = dateDeNaissance;
        this.taille = taille;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    @Override
    public String toString() {
        return String.format("Nom : %s, Date de naissance : %s, Taille : %.2f",
                nom, dateDeNaissance, taille);
    }
}


