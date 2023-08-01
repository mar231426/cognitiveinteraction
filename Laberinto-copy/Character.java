import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Actor
{
    lab1 thisGame;
    int collect = 0;
    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Character()
    {getImage().scale(getImage().getWidth() *1, getImage().getHeight());
    }
    public void act()
    {
      moveAround();
      hitPrize();
      hitTrap();
      Win();
    }
    
    public void moveAround()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 3, getY());
            if (hitWall() == true)
            {
             setLocation(getX() - 3, getY());   
            }
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 3, getY());
            if (hitWall() == true)
            {
             setLocation(getX() + 3, getY());   
            }
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 3);
            if (hitWall() == true)
            {
             setLocation(getX(), getY()+ 3);   
            }
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 3);
            if (hitWall() == true)
            {
             setLocation(getX(), getY()- 3);   
            }
        }
    }

public boolean hitWall()
{
    if(isTouching(Walls.class))
    {
        return true;
    }
    else
        return false;
}

public void hitPrize()
{
    if(getOneIntersectingObject(Prize.class)!= null)
    {
        collect++;
        getWorld().removeObject(getOneIntersectingObject(Prize.class));
        Greenfoot.playSound("premio.mp3");
        thisGame.score++;
}
}

public void hitTrap()
{
    if(isTouching(Trap.class))
    {
        setLocation(36,26);
        Greenfoot.playSound("trampa.mp3");
    }
}
public void Win()
{
    if(isTouching(Goal.class) && collect == 3)
    {
        Greenfoot.setWorld(new fin());
}
}
}