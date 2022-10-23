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
        if(Greenfoot.isKeyDown("d")||Greenfoot.isKeyDown("right")){
            move(3);
        }
        if(Greenfoot.isKeyDown("a")||Greenfoot.isKeyDown("left")){
            move(-3);
        }
        if(Greenfoot.isKeyDown("w")||Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-3);
        }
        if(Greenfoot.isKeyDown("s")||Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+3);
        }
    }
}
