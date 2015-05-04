/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package at.ac.fh_kufstein.uebung03;

import at.ac.fh_kufstein.uebung_03.Classes.AbstractCar;
import at.ac.fh_kufstein.uebung_03.Classes.AbstractVehicle;
import at.ac.fh_kufstein.uebung_03.Classes.Benennbar;
import at.ac.fh_kufstein.uebung_03.Classes.Boat;
import at.ac.fh_kufstein.uebung_03.Classes.Car;
import at.ac.fh_kufstein.uebung_03.Classes.Liste;
import at.ac.fh_kufstein.uebung_03.Classes.Vehicle;
import at.ac.fh_kufstein.uebung_03.Classes.Vehicle.Colour;

/**
 *
 * @author 1410653889
 */
public class Aufruf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Car bmw = new Car((short)4, Colour.SILVER, (short)220, (short)5, (short)4 );
        Car audi = new Car ((short)4, Colour.BLACK, (short)180, (short)5, (short)8 );
        Boat titanic = new Boat((short)0, Colour.BLUE, (short)51000, (short)0,10.54, (short)3, 100000 );
        
        System.out.println(bmw.toString());
        System.out.println(audi.toString());
        System.out.println(titanic.toString());
        
        
        Benennbar namedCar = new Car();
        namedCar.setName("Audi");
        System.out.println(namedCar.getName());
        
        AbstractCar abCar = new AbstractCar((short)4, AbstractVehicle.Colour1.BLUE, (short)230, (short)5, (short)6 );
        abCar.setName("AbsCar");
        System.out.println(abCar.getName());
        
//        Liste<Double> list= new Liste<>(10);
        
//        list.push(2.0);
//        list.push(5.0);
//        list.push(200.0);
//        
//        while(!list.isEmpty())
//        {
//            System.out.println(list.pop());
//        }
        
        Liste<AbstractVehicle> list=new Liste<>(10);
        
        list.push(new AbstractCar((short)5,  AbstractVehicle.Colour1.YELLOW,(short)4, (short)3, (short)5));
        
        while(!list.isEmpty())
        {
            System.out.println(list.pop().toString());
        }
    }
    
}
