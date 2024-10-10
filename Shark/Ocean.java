import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ocean here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ocean extends World
{

    /**
     * Constructor for objects of class Ocean.
     * 
     */
    public Ocean()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        FastFish fastFish = new FastFish();
        addObject(fastFish,457,182);
        Shark shark = new Shark("Daddy",16);
        addObject(shark,135,265);
        Shark shark2 = new Shark("Mommy",13);
        addObject(shark2,198,145);
        SlowFish slowFish = new SlowFish();
        addObject(slowFish,506,332);
        FastFish fastFish2 = new FastFish();
        addObject(fastFish2,460,91);
        FastFish fastFish3 = new FastFish();
        addObject(fastFish3,319,340);
        SlowFish slowFish2 = new SlowFish();
        addObject(slowFish2,428,260);
        SlowFish slowFish3 = new SlowFish();
        addObject(slowFish3,278,96);
    }
}
