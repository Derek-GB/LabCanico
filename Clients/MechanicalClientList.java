/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clients;

import Vehicles.Vehicle;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;


/**
 *
 * @author Fernando
 */
public class MechanicalClientList {
    
    HashMap<Client,Vehicle> clientVehicle = new HashMap();
    
   

    public MechanicalClientList() {
        this.clientVehicle = new HashMap<>();
    }
  
    public void add(Client client,Vehicle vehicle){
        this.clientVehicle.put(client, vehicle);
    }
    
    public List<Vehicle> listAllVehicles() {
        Collection<Vehicle> vehiclesCollection = clientVehicle.values();
        return new ArrayList<>(vehiclesCollection);
    }
      
    public void remove(Client client) {
        clientVehicle.remove(client);
    }
    
 
}
