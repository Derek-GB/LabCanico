/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clients;

/**
 *
 * @author Fernando
 */
public class Client {
    
    private String id;
    private String name;
    private int numberPhone;
    private String adress;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Client(String id, String name, int numberPhone, String adress) {
        this.id = id;
        this.name = name;
        this.numberPhone = numberPhone;
        this.adress = adress;
    }

    public Client() {
        this("","",0,"");
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", name=" + name + ", numberPhone=" + numberPhone + ", adress=" + adress + '}';
    }
    
    
    
    
}
