package gestionetudiants;

public class Etudiant {
    private String nom;
    private float note;
    
    public Etudiant(String nom, float note) {
        this.nom = nom;
        this.note = note;
    }
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public float getNote() {
        return note;
    }
    
    public void setNote(float note) {
        this.note = note;
    }
}
