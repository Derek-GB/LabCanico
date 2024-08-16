/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mechanics;

/**
 *
 * @author Tony
 */
public class Mechanic {
  private String id;
  private String name;
  private String specialty;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Mechanic(String id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    public Mechanic() {
        this("","","");
    }

    @Override
    public String toString() {
        return "Mecanico:" + "id=" + id + ", nombre = " + name + ", especialidad = " + specialty + "  ";
    }


    
   
    
    
    
    
    
    
    
    
}
