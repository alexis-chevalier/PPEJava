package entites;

import java.sql.Date;

public class RapportVisite {

    public int numeroRapportVisite;
    public Date date;
    public String dateString;
    public String bilan;
    public String motif;
    public int numPra;
    public String matriculeVis;
    private Visiteur visiteur;
    private Praticien praticien;


    public RapportVisite(int numeroRapportVisite, Date date, String bilan, String motif, Visiteur visiteur, Praticien praticien) {
        this.setNumero(numeroRapportVisite);
        this.setDate(date);
        this.setBilan(bilan);
        this.setMotif(motif);
        this.setPraticien(praticien);
        this.setVisiteur(visiteur);
    }
    
    public RapportVisite(int numeroRapportVisite, String dateString, String bilan, String motif, Visiteur visiteur, Praticien praticien) {
        this.setNumero(numeroRapportVisite);
        this.setDateString(dateString);
        this.setBilan(bilan);
        this.setMotif(motif);
        this.setPraticien(praticien);
        this.setVisiteur(visiteur);
    }

    public String getDateString() {
        return dateString;
    }

    public void setDateString(String dateString) {
        this.dateString = dateString;
    }
    
    public Praticien getPraticien() {
        return praticien;
    }

    public void setPraticien(Praticien praticien) {
        this.praticien = praticien;
    }
    
    public void setVisiteur(Visiteur visiteur) {
        this.visiteur = visiteur;
    }
    
    public Visiteur getVisiteur() {
        return visiteur;
    }

    public int getNumero() {
        return numeroRapportVisite;
    }

    public void setNumero(int numero) {
        this.numeroRapportVisite = numero;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getBilan() {
        return bilan;
    }

    public void setBilan(String bilan) {
        this.bilan = bilan;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }
    
    @Override
    public String toString() {
                if (this.date != null){
                    return "" + this.numeroRapportVisite + " " + this.date +" " + this.bilan + " " + this.motif + " " + this.getVisiteur().getMatricule() + " " + this.getPraticien().getNumPraticien();
                }
                else{
                    return "" + this.numeroRapportVisite + " " + this.dateString +" " + this.bilan + " " + this.motif + " " + this.getVisiteur().getMatricule() + " " + this.getPraticien().getNumPraticien();
                }
                
    }

}
