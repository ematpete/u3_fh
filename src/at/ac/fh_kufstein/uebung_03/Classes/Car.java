/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package at.ac.fh_kufstein.uebung_03.Classes;

/**
 *
 * @author 1410653889
 */
public class Car extends Vehicle
{

    public Car(short Wheels, Colour Farbe, short PS, short Doors, short Airbag) 
    {
        super(Wheels,Farbe, PS, Doors);
        this.Airbag = Airbag;
    }

    public Car() {
    }


    
    
    private boolean Aircondition = false;
    private short Airbag;
    
    void startAircondition()
    {
        if (Aircondition == false)
        {
        Aircondition = true;
        }
        else
        {
            System.out.println("Klimaanlage läuft bereits");
        }
    }
    void stopAircondition()
    {
        if (Aircondition == true)
        {
        Aircondition = false;
        }
        else
        {
            System.out.println("Klimaanlage bereits aus");
        }
    }

    public boolean isAircondition() {
        return Aircondition;
    }

    public void setAircondition(boolean Aircondition) {
        this.Aircondition = Aircondition;
    }

    public short getAirbag() {
        return Airbag;
    }

    public void setAirbag(short Airbag) {
        this.Airbag = Airbag;
    }

    @Override
    public String toString() {
        return "Mein Auto hat "+this.getPS()+" PS und fährt mit "+this.getSpeed()+" km/h";
    }
    
    
}
