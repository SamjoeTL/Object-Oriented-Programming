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
        moveMain_Character();
        
        if (isAtEdge()) {
            setLocation(0, getY());
        }
        
        
    }
    public void moveMain_Character()
    {
        
        //MovingMCToGoUp
        
        if (Greenfoot.isKeyDown("W"))
            setLocation(getX(), getY()-5);
        if (Greenfoot.isKeyDown("Up"))
            setLocation(getX(), getY()-5);
        
        //MovingMcToGoDown  
        
        if (Greenfoot.isKeyDown("S"))
            setLocation(getX(), getY()+5);
        if (Greenfoot.isKeyDown("Down"))
            setLocation(getX(), getY()+5);
        
        //MovingMCToGoLeft
            
        if (Greenfoot.isKeyDown("A"))
            setLocation(getX()-5, getY());
        if (Greenfoot.isKeyDown("Left"))
            setLocation(getX()-5, getY());
        
        //MovingMCToGoRight
            
        if (Greenfoot.isKeyDown("D"))
            setLocation(getX()+5, getY());
        if (Greenfoot.isKeyDown("Right"))
            setLocation(getX()+5, getY());
    }
}
