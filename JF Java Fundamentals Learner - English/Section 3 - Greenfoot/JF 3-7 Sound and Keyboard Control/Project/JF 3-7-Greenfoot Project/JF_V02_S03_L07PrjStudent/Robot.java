import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (2115101032_Tegar Samjoe Indra LakaS) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        detectHome();
        eatPizza();
    }
     public void robotMovement()
    {
        //add the code for the robot movement in the next project section
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY()-8);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY()+8);
        }
        if (Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-8,getY());
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+8,getY());
        }
    }
    public void detectWallCollision()
    {
        //if the robot collides with a Wall instance, then it returns to the start.
        if (isTouching(Wall.class))
        {
            setLocation(48,50);
            Greenfoot.playSound("hurt.wav");
        }
    }
    public void detectBlockCollision()
    {
        //the robot will return to the start if it collides with an instance of a Block.
        if (isTouching(Block.class))
        {
            setLocation(48,50);
            Greenfoot.playSound("hurt.wav");
        }
    }
    public void detectHome()
    {
        //ketika menabrak Home kembali ke start dan ada sound
        if (isTouching(Home.class))
        {
            setLocation(45,50);
            Greenfoot.playSound("yipee.wav");
        }
    }
    public void eatPizza()
    {
        if (isTouching(Pizza.class))
        {
            removeTouching(Pizza.class);
            Greenfoot.playSound("eat.wav");
        }
    }
    
}
