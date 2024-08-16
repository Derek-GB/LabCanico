/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repairs;

import Mechanics.Mechanic;
import Vehicles.Vehicle;
import java.time.LocalDate;

/**
 *
 * @author d2tod
 */
public class Repair {
    private String id;
    private Vehicle vehicle;
    private Mechanic mechanic;
    private LocalDate date;
    private String description;
    private boolean state;

    public String getId() {
        return id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Mechanic getMechanic() {
        return mechanic;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public boolean isState() {
        return state;
    }
    
    public String getState(){
        return state? "Pendiente" : "Finalizado";
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "-Reparacion ID " + id + "\n" + vehicle + "\n" + mechanic + "\n -Fecha " + date + "\n -Descripcion " + description + "\n -Estado " + getState();
    }

    public Repair(String id, Vehicle vehicle, Mechanic mechanic, LocalDate date, String description) {
        this.id = id;
        this.vehicle = vehicle;
        this.mechanic = mechanic;
        this.date = date;
        this.description = description;
        this.state = true;
    }
    
    public Repair() {
        this("",new Vehicle(), new Mechanic(), LocalDate.now(),"");
    }
    
}
