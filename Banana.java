import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Move Banana
 * 
 * @Dhiren  
 * @April 21, 2025
 */
public class Banana extends Actor
{
    /**
     * Act - do whatever the Banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-5);
        
        if(getX() <=0) {
            resetBanana();
        }
        
        if(isTouching(Beero.class)){
            Penguin penguin = new Penguin();
            getWorld().addObject(penguin, 300, 200);
            getWorld().removeObject(this);
        }
    }
    public void resetBanana() {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0) {
            setLocation(600, 100);
        } else {
            setLocation(600, 300);
        }
    }
}
