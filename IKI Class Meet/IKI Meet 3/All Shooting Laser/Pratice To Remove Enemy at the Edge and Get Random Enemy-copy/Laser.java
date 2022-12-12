import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
    /**
     * Act - do whatever the Laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(10);
        laserCollision(); //This For Touching Enemy
               
    }
    
    public void laserCollision(){
        if (isTouching(Villain.class)){
            getWorld().addObject(
            new Boom(),
            getX(),
            getY()
            );
            removeTouching(Villain.class);
            getWorld().removeObject(this);
        }else if (isAtEdge())
            getWorld().removeObject(this);
    }
}
