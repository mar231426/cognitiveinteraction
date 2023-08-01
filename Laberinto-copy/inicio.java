import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class inicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class inicio extends World
{
    Flecha flecha = new Flecha();
    private int opcion=0;
    
    public inicio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(544, 475, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        jugar jugar = new jugar();
        addObject(jugar,272,199);
        salir salir = new salir();
        addObject(salir,270,242);
        Flecha flecha = new Flecha();
        addObject(flecha,195,197);
    }
    
    public void act(){
        if (Greenfoot.isKeyDown("UP") && opcion!=0) {opcion++;}
        if (Greenfoot.isKeyDown("DOWN") && opcion!=1) {opcion--;}
        
        if (opcion>=2) opcion=0;
        if (opcion<0) opcion=1;
       
        if (Greenfoot.isKeyDown("SPACE") || Greenfoot.isKeyDown("ENTER")){
            switch(opcion){
                case 0:
                    Greenfoot.setWorld(new lab1());
                    break;
                case 1:
                    Greenfoot.stop();
                    break;
                }
            }
            }
        }
        
    

