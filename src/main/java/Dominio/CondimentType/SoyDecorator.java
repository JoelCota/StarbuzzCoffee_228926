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
public class SoyDecorator extends Condiment {

    public SoyDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return 10 + beverage.cost();
    }

    public String description() {
        return beverage.description() + " Soy";
    }
}
