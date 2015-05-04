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
public class Boat extends Vehicle
{

    public Boat(short Wheels, Colour Farbe, short PS,  short Doors, double Draft, short Propeller, double Cargo) 
    {
        super(Wheels, Farbe, PS, Doors);
        this.Draft = Draft;
        this.Propeller = Propeller;
        this.Cargo = Cargo;
    }

    public Boat() {
    }
    
    
    
    private double Draft;
    private short Propeller;
    private double Cargo;
    
    public void unload() throws InterruptedException
    {
        Cargo = 0;
        Thread.sleep(5000);
    }

    public double getDraft() {
        return Draft;
    }

    public void setDraft(double Draft) {
        this.Draft = Draft;
    }

    public short getPropeller() {
        return Propeller;
    }

    public void setPropeller(short Propeller) {
        this.Propeller = Propeller;
    }

    public double getCargo() {
        return Cargo;
    }

    public void setCargo(double Cargo) {
        this.Cargo = Cargo;
    }

    @Override
    public String toString() 
    {
        return "Mein Wasserfahrzeug hat "+this.getPS()+" PS und einen Tiefgang von "+this.getDraft()+"m";
    }
    
    
}
