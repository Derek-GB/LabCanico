/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehicles;

import java.util.ArrayList;

/**
 *
 * @author DYLAN
 */
public class VehicleList {
    
    private ArrayList<Vehicle> vehicles;
    
    public VehicleList() {
        vehicles = new ArrayList<>();
    }
    
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
    
    public void removeVehicle(String tuition) {
        vehicles.removeIf(veh -> veh.getTuition() == tuition);
    }
    
    public ArrayList<Vehicle> ListVehicle() {
        return vehicles;
    }
    
       public String[] getVehicle() {
        String especies[]=new String[50];
        int cont=0;
        for(Vehicle objeto:this.vehicles){
            if (objeto!=null){
                boolean exist=false;
                for (int i = 0; i <= cont; i++) {
                    if(objeto.getTuition().equals(especies[i])){
                        exist=true;
                        break;
                    }  
                }
                if (!exist)
                    especies[cont++]=objeto.getTuition();
            }
        }
        return especies;
    }
    
}
