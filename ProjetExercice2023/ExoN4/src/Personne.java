import java.time.LocalDate;
import java.time.Period;

public class Personne {
    private String nom;
    private String prenom;
    private String matricule;
    private int age;
    private LocalDate dateNaissance;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public static int getUniqueIDCounter() {
        return uniqueIDCounter;
    }

    public static void setUniqueIDCounter(int uniqueIDCounter) {
        Personne.uniqueIDCounter = uniqueIDCounter;
    }

    // Constructeur
    public Personne(String nom, String prenom, LocalDate dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.matricule = generateMatricule();
        this.age = calculateAge();


    }

    // Génération de la matricule
    private String generateMatricule() {
        String initials = (prenom.substring(0, 1) + nom.substring(0, 1)).toUpperCase();
        // Ajouter la logique pour générer le numéro d'identification à 4 chiffres
        // (vous pouvez utiliser une variable statique pour compter les instances)
        return initials + String.format("%03d", generateUniqueID());
    }

    //Génération d'un identifiant unique à 3 chiffres
    private static int uniqueIDCounter = 1;

    private int generateUniqueID() {
        return uniqueIDCounter++;
    }

    // Calcul de l'âge
    private int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(dateNaissance, currentDate).getYears();
    }

    // Teste d'implémentation
    public static void main(String[] args) {
        LocalDate Fass = LocalDate.of(1999, 5, 29); // Remplacez ceci par la date de naissance réelle
        Personne mamadouBodian= new Personne("Bodian", "Mamadou", Fass);
        System.out.println("Matricule: " + mamadouBodian.matricule);
        System.out.println("Âge: " + mamadouBodian.age + " ans");
    }
}
