/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Main;

import Dominio.Beverage;
import Dominio.BeverageType.Espresso;
import Dominio.CondimentType.ChocolateDecorator;
import Dominio.CondimentType.SoyDecorator;

/**
 *
 * @author aroco
 */
public class StarbuzzCoffee_228926 {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
            beverage = new ChocolateDecorator(beverage);
        beverage = new SoyDecorator(beverage);
        System.out.println("Description: " + beverage.description());
        System.out.println("Cost: $" + beverage.cost());
    }
}
