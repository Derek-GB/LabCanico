/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repairs;

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

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Repair{" + "id=" + id + ", vehicle=" + vehicle + ", mechanic=" + mechanic + ", date=" + date + ", description=" + description + ", state=" + state + '}';
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
        this("",new Vehicle(), new Mechanic(), new LocalDate(),"");
    }
    
}
