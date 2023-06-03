package gestionetudiants;

public class App {
    public static void main(String[] args) {
        GestionEtudiants gestionEtudiant = new GestionEtudiants();

        gestionEtudiant.ajouterEtudiant("Bob", 12.5f);
        gestionEtudiant.ajouterEtudiant("Jean", 14.5f);
        gestionEtudiant.ajouterEtudiant("Fred", 9.5f);

        gestionEtudiant.afficherTousLesEtudiants();

        gestionEtudiant.modifierNote("Claude", 15);

        System.out.println("\n");
        gestionEtudiant.afficherTousLesEtudiants();
    }
}
