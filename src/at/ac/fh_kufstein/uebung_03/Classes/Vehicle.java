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
public class Vehicle  implements Benennbar
{

    public Vehicle(short Wheels, Colour Farbe, short PS, short Doors) 
    {
        this.Wheels = Wheels;
        this.Farbe = Farbe;
        this.PS = PS;
        this.Doors = Doors;
    }

    public Vehicle() {
    }
    
    
    protected String FName;
    @Override
    public String getName() 
    {
        return FName;
    }
    public void setName(String _n)
    {
        FName = _n;
    }
    
    private short Wheels;
    public enum Colour {BLACK, SILVER, RED, GREY, YELLOW, BLUE}
    private Colour Farbe;
    private short PS;
    private short Doors;
    private boolean Started = false;
    private short Speed = 0;
    
    public void start()
    {
        Started = true;
    }
    public void stop()
    {
        Started = false;
    }
    public void accelerate (short S)
    {
        Speed += S;
        if(Speed > 250)
        {
            Speed = 250;
        }
    }
    public void bremsen(short S)
    {
        Speed -= S;
        if(Speed < 0)
        {
            Speed = 0;
        }
    }

    public short getWheels() {
        return Wheels;
    }

    public void setWheels(short Wheels) {
        this.Wheels = Wheels;
    }

    public short getPS() {
        return PS;
    }

    public void setPS(short PS) {
        this.PS = PS;
    }

    public short getDoors() {
        return Doors;
    }

    public void setDoors(short Doors) {
        this.Doors = Doors;
    }

    public boolean isStarted() {
        return Started;
    }

    public void setStarted(boolean Started) {
        this.Started = Started;
    }

    public short getSpeed() {
        return Speed;
    }

    public void setSpeed(short Speed) {
        this.Speed = Speed;
    }

    public Colour getFarbe() {
        return Farbe;
    }

    public void setFarbe(Colour Farbe) {
        this.Farbe = Farbe;
    }
    
    
}
