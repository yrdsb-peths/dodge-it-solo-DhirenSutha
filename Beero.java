import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * After every mouse click Beero moves to either the top or bottom and dodges
 * 
 * @Dhiren 
 * @April 16, 2025
 */
public class Beero extends Actor
{
    boolean atTop = true;
    /**
     * Act - do whatever the Beero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(null)){
            atTop = !atTop;
        }
        
        if(atTop) {
            setLocation(100, 100);
        } else {
            setLocation(100, 300);
        }
    }
}
