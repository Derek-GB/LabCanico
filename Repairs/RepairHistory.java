/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repairs;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author d2tod
 */
public class RepairHistory {
    private Stack historial;
    
    public void add(Repair element){
        historial.add(element);
    }
    
    public Iterator<Repair> getHistorial(){
        return historial.iterator();
    }
    
    public RepairHistory(){
        this.historial = new Stack();
    }
}
