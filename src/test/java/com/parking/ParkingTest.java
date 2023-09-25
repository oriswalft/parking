package com.parking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ParkingTest {

    @Test
    public void vehiculesAutorisesVide_ajouterVehiculeAutorise_devraitAjouterLeVehicule() {

        /// AAA : arrange (préparer), Act ( agir), Assert (vérifier)
        Parking parking = new Parking(0);
        // Arrange : je mets en place mon test, notamment en instanciant et initialisant
        // le ou les objets concernés

        // Act : j'appelle la méthode qui est sous test

        parking.ajouterVehiculeAutorise("ABC-123");

        // Assert : je vérifie que tout c'est passé comme prévu
        assertEquals(1, parking.getTailleVehiculesAutorises(), "Je devrais avoir exactement un vehicule autorisé");

    }

    @Test
    public void vehiculeAutorises_enregistrerEntreeVehicule_devraitEntree() {
        // Arrange
        Parking parking = new Parking(1);
        Vehicule vehicule = new Vehicule("ABC-123");

        // Act
        parking.ajouterVehiculeAutorise(vehicule.getImmatriculation());

        // Assert
        assertEquals(1, parking.getTailleVehiculesAutorises());
    }

    @Test
    public void vehiculeAutorise_sortDuParking() {
        // Arrange
        Parking parking = new Parking(1);
        Vehicule vehicule = new Vehicule("ABC-123");

        // Act
        parking.ajouterVehiculeAutorise(vehicule.getImmatriculation());
        parking.retirerVehiculeAutorise(vehicule.getImmatriculation());

        // Assert
        assertEquals(0, parking.getTailleVehiculesAutorises());
    }

    @Test
    public void vehiculeAutorise_estDansLeParking() {
        Parking parking = new Parking(1);
        Vehicule vehicule = new Vehicule("ABC-123");

        parking.ajouterVehiculeAutorise(vehicule.getImmatriculation());
        parking.enregistrerVehiculeAutorise(vehicule.getImmatriculation());

        assertEquals(true, parking.rechercherVehiculeParking(vehicule.getImmatriculation()));
    }

    @Test
    public void maximumVehiculeDansLeParking() {
        Parking parking = new Parking(1);
        Vehicule vehicule = new Vehicule("123-ABC");
        Vehicule vehicule2 = new Vehicule("826-IFO");

        parking.ajouterVehiculeAutorise(vehicule.getImmatriculation());
        parking.enregistrerVehiculeAutorise(vehicule.getImmatriculation());
        parking.ajouterVehiculeAutorise(vehicule2.getImmatriculation());
        parking.enregistrerVehiculeAutorise(vehicule2.getImmatriculation());

        assertEquals(false, parking.parkingPlein());
    }
}
