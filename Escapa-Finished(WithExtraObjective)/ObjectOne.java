import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ObjectOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ObjectOne extends Actor
{
    int deltaX; // store change in x
    int deltaY; // store change in y
    
    MyWorld thisGame;
    /**
     * Constructor Initalization for ObjectOne
     */
    
    public ObjectOne()
    {
        //
        deltaX = 3;
        deltaY = -3;
    }
    /**
     * Act - do whatever the ObjectOne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Wall Bouncing
        if (isTouching(BorderTop.class))
        {
            deltaY = deltaY * -1;
        }
        if (isTouching(BorderBottom.class))
        {
            deltaY = deltaY * -1;
        }
        if (isTouching(BorderLeft.class))
        {
            deltaX = deltaX * -1;
        }
        if (isTouching(BorderRight.class))
        {
            deltaX = deltaX * -1;
        }
        // Movement
        setLocation(getX() + deltaX, getY() + deltaY);
    }
}
