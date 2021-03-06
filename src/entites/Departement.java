package entites;

public class Departement {

    public int codeDepartement;

    public String nomDepartement;

    public int chefVente;

    private Visiteur visiteur;


    public Departement(int codeDepartement) {
        this.setCode(codeDepartement);
    }

    public Departement(int codeDepartement, String nomDepartement, int chefVente) {
        this.setCode(codeDepartement);
        this.setNom(nomDepartement);
        this.setChefVente(chefVente);
    }

    public Departement(int codeDepartement, String nomDepartement, int chefVente, Visiteur visiteur) {
        this.setCode(codeDepartement);
        this.setNom(nomDepartement);
        this.setChefVente(chefVente);
        this.setVisiteur(visiteur);
    }

    public int getCode() {
        return codeDepartement;
    }

    public void setCode(int code) {
        this.codeDepartement = code;
    }

    public String getNom() {
        return nomDepartement;
    }

    public void setNom(String nom) {
        this.nomDepartement = nom;
    }

    public int getChefVente() {
        return chefVente;
    }

    public void setChefVente(int chefVente) {
        this.chefVente = chefVente;
    }
    
    public void setVisiteur(Visiteur visiteur) {
        this.visiteur = visiteur;
    }

    public Visiteur getVisiteur() {
        return visiteur;
    }
    
    @Override
    public String toString() {
        return "" + this.codeDepartement + " " + this.nomDepartement + " " + this.chefVente;
    }

}
