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
        // Using Keyboard To Move MC
        moveMain_Character();
        //Shooting Laser
        shootLaser();
        //Action
        getTouch();
    }
    
    public void moveMain_Character()
    {
        //MovingMCToGoUp
        if (Greenfoot.isKeyDown("W"))
            setLocation(getX(), getY()-3);
        if (Greenfoot.isKeyDown("Up"))
            setLocation(getX(), getY()-3);
        
        //MovingMCToGoDown
        if (Greenfoot.isKeyDown("S"))
            setLocation(getX(), getY()+4);
        if (Greenfoot.isKeyDown("Down"))
            setLocation(getX(), getY()+4);
        
        //MovingMcToLeft
        if (Greenfoot.isKeyDown("A"))
            setLocation(getX()-3, getY());
        if (Greenfoot.isKeyDown("Left"))
            setLocation(getX()-3, getY());
        
        //MovingMcToRight
        if (Greenfoot.isKeyDown("D"))
            setLocation(getX()+4, getY());
        if (Greenfoot.isKeyDown("Right"))
            setLocation(getX()+4, getY());
    }
    
    public void shootLaser()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            getWorld().addObject(new Laser(), getX()+50,getY());
        }
    }
    

    
     public void getTouch()
    {
        if(isTouching(Villain.class)||isTouching(LaserVillain.class))
        {
            getWorld().addObject(new Boom(),getX(),getY());
            setLocation(112,180);
        }
}
}