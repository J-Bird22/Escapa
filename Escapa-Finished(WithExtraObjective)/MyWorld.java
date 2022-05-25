import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    SimpleTimer timer;
    public int Coinscore = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // World Size
        super(500, 500, 1); 
        // Player/ Objects
        addObject(new Player(), 250, 250);
        addObject(new ObjectOne(), 45, 435); 
        addObject(new ObjectTwo(), 435, 430); 
        addObject(new ObjectThree(), 380, 45); 
        addObject(new ObjectFour(), 73, 73); 
        // Border
        addObject(new BorderTop(), 250, 2); 
        addObject(new BorderBottom(), 250, 498); 
        addObject(new BorderLeft(), 2, 250); 
        addObject(new BorderRight(), 499, 250); 
        addObject(new Coin(), Greenfoot.getRandomNumber(480) +5, Greenfoot.getRandomNumber(480) +5);        //
        timer=new SimpleTimer();
        timer.mark();
    }
    public void act()
    {
         //Timer / Score
         
         showText("You've Lasted: " + timer.millisElapsed()/1000, 250, 30);
    }
}
