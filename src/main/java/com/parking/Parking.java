package com.parking;

import java.util.ArrayList;

public class Parking {
    private int capaciteMaximale;
    private ArrayList<String> vehiculesAutorises = new ArrayList<>();
    private ArrayList<String> vehiculesStationnes = new ArrayList<>();

    public int gnagnagna(int capacite) {
        capaciteMaximale = capacite;
        return capaciteMaximale;
    }

    public ArrayList<String> getVehiculesStationnes() {
        return vehiculesStationnes;
    }

    public void setVehiculesStationnes(ArrayList<String> vehiculesStationnes) {
        this.vehiculesStationnes = vehiculesStationnes;
    }

    private int nbPlacesDisponible;

    public Parking(int capacite) {
        this.capaciteMaximale = capacite;
    }

    public ArrayList<String> getVehiculesAutorises() {
        return vehiculesAutorises;
    }

    public int getTailleVehiculesAutorises() {
        return vehiculesAutorises.size();
    }

    boolean ajouterVehiculeAutorise(String immatriculation) {
        vehiculesAutorises.add(immatriculation);
        return true;
    }

    boolean retirerVehiculeAutorise(String immatriculation) {
        vehiculesAutorises.remove(immatriculation);
        return true;
    }

    boolean enregistrerVehiculeAutorise(String immatriculation) {
        if (vehiculesAutorises.contains(immatriculation)) {
            vehiculesStationnes.add(immatriculation);
            return true;
        }
        return false;
    }

    boolean rechercherVehiculeParking(String immmatriculation) {
        if (vehiculesStationnes.contains(immmatriculation)) {
            return true;
        }
        return false;
    }

    int getNombreVehiculeStationneParking() {
        return vehiculesStationnes.size();
    }

    boolean parkingPlein() {
        if (getNombreVehiculeStationneParking() > capaciteMaximale) {
            return false;

        }
        return true;
    }

}
