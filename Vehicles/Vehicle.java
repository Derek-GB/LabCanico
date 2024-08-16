/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehicles;

import java.time.LocalDate;

/**
 *
 * @author DYLAN
 */
public class Vehicle {
    private String tuition;
    private String model;
    private String brand;
    private LocalDate yearManufacture;

    public String getTuition() {
        return tuition;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public LocalDate getYearManufacture() {
        return yearManufacture;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Vehicle(String tuition, String model, String brand, LocalDate yearManufacture) {
        this.tuition = tuition;
        this.model = model;
        this.brand = brand;
        this.yearManufacture = yearManufacture;
    }

    public Vehicle() {
        this("","","",LocalDate.now());
    }

    @Override
    public String toString() {
        return "Vehicle{" + "tuition=" + tuition + ", model=" + model + ", brand=" + brand + ", yearManufacture=" + yearManufacture + '}';
    }
    
    
    
}
