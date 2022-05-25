import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ObjectTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ObjectTwo extends Actor
{
    int deltaX; // store change in x
    int deltaY; // store change in y
    
    MyWorld thisGame;
    /**
     * Constructor Initalization for ObjectTwo
     */
    
    public ObjectTwo()
    {
        //
        deltaX = -5/2;
        deltaY = -4;
    }
    /**
     * Act - do whatever the ObjectTwo wants to do. This method is called whenever
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
