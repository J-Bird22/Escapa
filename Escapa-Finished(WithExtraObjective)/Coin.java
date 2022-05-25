import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Actor
{
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        MyWorld thisGame = (MyWorld)getWorld();
        
        // Add your action code here.
        if (isTouching(Player.class))
        {
            setLocation(Greenfoot.getRandomNumber(480) +5, Greenfoot.getRandomNumber(480) +5);
            thisGame.Coinscore++;
        }
        thisGame.showText("Score: " + thisGame.Coinscore, 250, 45);
    }
}
