package gestionetudiants;

import java.util.ArrayList;

public class GestionEtudiants {
    private ArrayList<Etudiant> listEtudiant = new ArrayList<Etudiant>();

    public void ajouterEtudiant(String nom, float note) {
        this.listEtudiant.add(new Etudiant(nom, note));
    }

    public void afficherTousLesEtudiants() {
        for (Etudiant etudiant : listEtudiant) {
            System.out.println(etudiant.toString());
        }
    }

    public Etudiant rechercherEtudiant(String nom) {
        for (Etudiant etudiant : listEtudiant) {
            if (etudiant.getNom().equals(nom)) {
                return etudiant;
            }
        }
        return null;
    }

    public void modifierNote(String nom, float nouvelleNote) {
        Etudiant etudiant = rechercherEtudiant(nom);
        if (etudiant != null) {
            etudiant.setNote(nouvelleNote);
        } else {
            System.out.println("Attention " + nom + " n'existe pas dans la liste");
        }
    }

    public void modifierNomEleve(String nom, String nouveauNom) {
        Etudiant etudiant = rechercherEtudiant(nom);
        etudiant.setNom(nouveauNom);
    }

    public void supprimerEtudiant(String nom) {
        Etudiant etudiant = rechercherEtudiant(nom);
        listEtudiant.remove(etudiant);
    }
}
