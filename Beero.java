import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * After every mouse click Beero moves forward and turns 90 degrees to the right
 * 
 * @Dhiren 
 * @April 16, 2025
 */
public class Beero extends Actor
{
    /**
     * Act - do whatever the Beero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(null)){
            move(100);
            turn(90);
        }
    }
}
