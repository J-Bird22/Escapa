import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Movement
        if (Greenfoot.isKeyDown("Up"))
        {
            setLocation(getX(), getY() - 5);
        }
        if (Greenfoot.isKeyDown("Down"))
        {
            setLocation(getX(), getY() + 5);
        }
        if (Greenfoot.isKeyDown("Left"))
        {
            setLocation(getX() - 5, getY());
        }
        if (Greenfoot.isKeyDown("Right"))
        {
            setLocation(getX() + 5, getY());
        }
        // Border Game Over
        if (isTouching(BorderBottom.class))
        {
             Greenfoot.setWorld(new MyWorld());
             Greenfoot.stop();
        }
        if (isTouching(BorderLeft.class))
        {
             Greenfoot.setWorld(new MyWorld());
             Greenfoot.stop();
        }
        if (isTouching(BorderRight.class))
        {
             Greenfoot.setWorld(new MyWorld());
             Greenfoot.stop();
        }
        if (isTouching(BorderTop.class))
        {
             Greenfoot.setWorld(new MyWorld());
             Greenfoot.stop();
        }
        // Object Game Over
        if (isTouching(ObjectOne.class))
        {
             Greenfoot.setWorld(new MyWorld());
             Greenfoot.stop();
        }
        if (isTouching(ObjectTwo.class))
        {
             Greenfoot.setWorld(new MyWorld());
             Greenfoot.stop();
        }
        if (isTouching(ObjectThree.class))
        {
             Greenfoot.setWorld(new MyWorld());
             Greenfoot.stop();
        }
        if (isTouching(ObjectFour.class))
        {
             Greenfoot.setWorld(new MyWorld());
             Greenfoot.stop();
        }
    }
}
