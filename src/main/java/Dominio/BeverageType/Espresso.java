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
public class Espresso implements Beverage {

    private int precio = 36;

    @Override
    public String description() {
        return "Espresso";
    }

    @Override
    public int cost() {
        return precio;
    }

}
