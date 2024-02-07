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
public class Decaf implements Beverage {

    private int precio = 30;

    @Override
    public String description() {
        return "Decaf";
    }

    @Override
    public int cost() {
        return precio;
    }

}
