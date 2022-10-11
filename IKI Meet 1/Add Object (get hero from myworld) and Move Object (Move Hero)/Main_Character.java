import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Main_Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main_Character extends Actor
{
    /**
     * Act - do whatever the Main_Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(5);
        
        if (isAtEdge()) {
            setLocation(0, getY());
        }
    }
}
