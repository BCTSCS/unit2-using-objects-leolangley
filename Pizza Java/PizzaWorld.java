import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PizzaWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public PizzaWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Pizza pizza1 = new Pizza("Pepperoni", 5);
        Pizza pizza2 = new Pizza("Meatball", 10);
        addObject(pizza1, 100, 150);
        addObject(pizza2, 300, 250);
    }
}
