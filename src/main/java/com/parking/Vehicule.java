package com.parking;

public class Vehicule {
    private String immatriculation;
    public String getImmatriculation() {
        return immatriculation;
    }
    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }
    public Vehicule(String immatriculation) {
        this.immatriculation = immatriculation;
    }
    public void changerImmatriculation(String immmatriculation){
        this.immatriculation = immmatriculation;

    }
    
}
