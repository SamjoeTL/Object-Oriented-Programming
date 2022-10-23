import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Tegar Samjoe Indra Laka) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    int villainCount = 0;
    public void act()
    {
        villainCount = (villainCount+5)%300; 
        
        
        if(villainCount==0)
        {
            addVillain();
        }

    }
    public void addVillain()
    {
            addObject(new Villain(),600,Greenfoot.getRandomNumber(400));
            
    }
    private void prepare()
    {

        Main_Character main_Character = new Main_Character();
        addObject(main_Character,50,200);
        
        Villain villain = new Villain();
        addObject(villain, 500,52);
        
        Villain villain2 = new Villain();
        addObject(villain2, 400,100);
        
        Villain villain3 = new Villain();
        addObject(villain3, 300,300);
    
        Villain villain4 = new Villain();
        addObject(villain4, 500,300);
        
        Villain villain5 = new Villain();
        addObject(villain5, 450,200);
    }
}
