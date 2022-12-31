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
    int lives = 3;
    int pizzaEaten = 0;
    int score = 0;
    public void act()
    {
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        detectHome();
        eatPizza();
        showStatus();
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
        animate();
        }
    }
    public void detectWallCollision()
    {
        //if the robot collides with a Wall instance, then it returns to the start.
        if (isTouching(Wall.class))
        {
            setLocation(48,50);
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }
    }
    public void detectBlockCollision()
    {
        //the robot will return to the start if it collides with an instance of a Block.
        if (isTouching(Block.class))
        {
            setLocation(48,50);
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }
    }
    public void removeLife(){
        showStatus();
        lives--;
        testEndGame();
    }
    public void testEndGame(){
        if(lives<0){
            setImage(new GreenfootImage("gameover.png"));
            Greenfoot.stop();
        }
    }
    public void detectHome()
    {
        //ketika menabrak Home kembali ke start dan ada sound
        if (isTouching(Home.class))
        {
            increaseScore();
            setLocation(45,50);
            Greenfoot.playSound("yipee.wav");
            pizzaEaten=0;
        }
    }
    public void increaseScore(){
        score++; 
        showStatus();
    }
     public void showStatus(){
        getWorld().showText("Score : "+score,71,530);
        getWorld().showText("Pizza : "+pizzaEaten,71,550);
        getWorld().showText("Lives : "+lives,71,570);
    }
    public void eatPizza()
    {
        if (isTouching(Pizza.class))
        {
            showStatus();
            pizzaEaten++;
            removeTouching(Pizza.class);
            Greenfoot.playSound("eat.wav");
        }
    }
    private GreenfootImage robotimage1;
    private GreenfootImage robotimage2;
    public Robot()
    {
        robotimage1=new GreenfootImage("man01.png");
        robotimage2=new GreenfootImage("man02.png");
    }
    public void animate()
    {     
        if(getImage()==robotimage1){
            setImage(robotimage2);
        }else{
            setImage(robotimage1);
        }     
    }
    
}
