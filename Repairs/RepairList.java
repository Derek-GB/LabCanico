/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repairs;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author d2tod
 */
public class RepairList {
    private Queue<Repair> list;
    
    public void add(Repair element){
        list.add(element);
    }
    
    public Repair finish(){
        return list.poll();
    }
    
    public Repair seeFirst(){
        return list.peek();
    }

    public RepairList() {
        this.list = new LinkedList<>();
    }
    
    
}
