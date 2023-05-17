package app.ecole ;

public class Etudiant {
    private Nom nom;
    private int identifiant;
    
    public Etudiant(String prenom, String nomFamille, int n) {
        nom = new Nom(prenom,nomFamille);
        numero = n;
    }
    
    public void changerNomFamille (String s) {
        nom.changerNomFamille(s);
    }
    
    public void changerPrenom (String s) {
        nom.changerPrenom(s);
    }
    
    public void changerNumero (int n) {
        numero = n;
    }
    
    public String toString() {
        return (nom.toString() + "\nNumero : " + numero);
    }
}
