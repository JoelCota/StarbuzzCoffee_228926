/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author aroco
 */
public abstract class Condiment implements Beverage {

    protected Beverage beverage;

    public Condiment(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public abstract int cost();

    @Override
    public abstract String description();

}
