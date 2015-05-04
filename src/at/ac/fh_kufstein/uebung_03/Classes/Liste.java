/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_03.Classes;

/**
 *
 * @author Peter
 */
public class Liste<ItemType extends AbstractVehicle> 
{
    private ItemType[] elemente;
    private int items=0;
    
    public Liste(int size)
    {
        elemente=(ItemType[]) new AbstractVehicle[size];
    }
    
    public void push(ItemType param)
    {
        if(elemente.length>items)
        {
            elemente[items]=param;
            items++;
        }
    }
    
    public ItemType pop()
    {
        ItemType item= null;
        if(items>0)
        {
            item=elemente[items-1];
            elemente[items-1]=null;
            items--;
        }
        return item;
    }
    public boolean isEmpty()
    {
        return items==0;
    }
}
