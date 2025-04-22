import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Beero bee = new Beero();
        addObject(bee, 100, 100);
        
        Banana banana = new Banana();
        addObject(banana, 600, 100);
    }
}
