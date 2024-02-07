/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio.CondimentType;

import Dominio.Beverage;
import Dominio.Condiment;

/**
 *
 * @author aroco
 */
public class WhippedCreamDecorator extends Condiment {

    public WhippedCreamDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return 15 + beverage.cost();
    }

    @Override
    public String description() {
        return beverage.description() + " Whipped Cream";
    }
}
