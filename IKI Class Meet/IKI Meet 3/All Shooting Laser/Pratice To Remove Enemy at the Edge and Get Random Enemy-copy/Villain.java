import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Villain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Villain extends Actor
{
    /**
     * Act - do whatever the Villain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Villain()
    {
        setRotation(180);
    }
    
    public Villain(int speed)
    {
        setRotation(180);
        this.speed = speed; //this = for let it called itself
    }
    
    public void removeVillain()
    {
        if(isAtEdge())
        {
            
            getWorld().removeObject(this); 
        }
    }
    
    public int speed = 2;
    
    public void act() 
    {
    
        move(speed);
        removeVillain();       
        shootLaser();
    }
    
    int laserTimer = 0;
    public void shootLaser()
    {
        if (laserTimer == 120){
            getWorld().addObject(
            new LaserVillain(),
            getX() - 60,
            getY()
            );
            laserTimer = 0;
        }else{
            laserTimer++;
        }
    }
}
