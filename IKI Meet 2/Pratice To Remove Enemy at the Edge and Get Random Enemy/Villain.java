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
    
    public Villain(){
        setRotation(180);
    }
    
    public int speed = 2;
    public void act()
    {
        // Add your action code here.
        
        move(3);
        
        if (isAtEdge()) {
            setLocation(600, getY());
        }
    }
}
