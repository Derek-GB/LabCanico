/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mechanics;

import java.util.HashSet;

/**
 *
 * @author Tony
 */
public class MechanicList {
    private HashSet<Mechanic> list = new HashSet();
    
    public MechanicList(){
        this.list = new HashSet();
    }
    
     public void add(Mechanic elements) {
        this.list.add(elements);

    }

    public void remove(String elements) {
        this.list.removeIf(mechanic -> mechanic.getId().equals(elements));

    }

    public Mechanic search(String elements) {
        for (Mechanic mechanic : list) {
            if (mechanic.getId().equals(elements)) {
                return mechanic;
            }

        }
        return null;
    }
    
}
