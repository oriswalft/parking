package com.parking;

public class App {
    
    public static void main(String[] args) {
        Vehicule voiture1 = new Vehicule("ABC-123");
        voiture1.changerImmatriculation("DCE-456");
        System.out.println(voiture1.getImmatriculation());
        
        Parking p1 = new Parking(1000);
        p1.ajouterVehiculeAutorise("DCE-456");
    }
    
}
