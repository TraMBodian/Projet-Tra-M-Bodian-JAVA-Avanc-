import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Employe extends Personne {
    private double salaire;
    private String poste;
    private static int totalEmployes = 0;
    private static final int MAX_NAME_LENGTH = 50;
    private static final double MIN_SALARY = 50000.0;
    private static final double MAX_SALARY = 1000000.0;
    private static final int RANDOM_NAME_LENGTH = 10;
    private static final List<Employe> employeCollection = new ArrayList<>();

    // Constructeur
    public Employe(String nom, Date dateNaissance, double taille, double salaire, String poste) {
        super(nom, dateNaissance, taille);
        this.salaire = salaire;
        this.poste = poste;
        totalEmployes++;
        employeCollection.add(this);
    }

    // Méthode toString (redéfinie)
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return super.toString() + ", Salaire: " + salaire + ", Poste: " + poste;
    }

    // Méthode d'affichage polymorphique
    public static void afficherDetails(Personne personne) {
        System.out.println(personne.toString());
    }

    // Méthode pour générer un nom aléatoire
    private static String generateRandomName() {
        // Ajoutez la logique pour générer une chaîne aléatoire avec une longueur de 10
        return "Tra Mamadou Bodian";
    }

    // Méthode pour créer un employé avec nom et salaire
    public static Employe creerEmploye(String nom, double salaire) {
        if (nom.length() > MAX_NAME_LENGTH) {
            // Ajoutez la logique pour gérer les noms trop longs
            return null;
        }
        return new Employe(generateRandomName(), new Date(), 0.0, salaire, "REF-DIGITAL");
    }

    // Méthode pour créer un employé avec nom, date de naissance et poste
    public static Employe creerEmploye(String nom, Date dateNaissance, String poste) {
        if (nom.length() > MAX_NAME_LENGTH) {
            // Ajoutez la logique pour gérer les noms trop longs
            return null;
        }
        return new Employe(generateRandomName(), dateNaissance, 0.0, 0.0, poste);
    }

    // Méthode pour trier la collection d'employés
    public static void trierEmployes() {
        Collections.sort(employeCollection, (e1, e2) -> e1.getNom().compareTo(e2.getNom()));
    }

    // Méthode pour afficher la collection triée
    public static void afficherCollectionTriee() {
        for (Employe employe : employeCollection) {
            System.out.println(employe.toString());
        }
    }
}
