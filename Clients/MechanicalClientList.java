/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clients;

import Vehicles.Vehicle;
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
    
    public Vehicle search(String objecto) {
        if(clientVehicle.containsKey(objecto)){
           return clientVehicle.get(objecto);
       } 
           return null;

    }
      
    public void remove(Client client) {
        clientVehicle.remove(client);
    }
    
 
}
