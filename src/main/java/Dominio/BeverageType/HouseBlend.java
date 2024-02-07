/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio.BeverageType;

import Dominio.Beverage;

/**
 *
 * @author aroco
 */
public class HouseBlend implements Beverage {

    private int precio = 38;

    @Override
    public String description() {
        return "House Blend Coffe";
    }

    @Override
    public int cost() {
        return precio;
    }

}
