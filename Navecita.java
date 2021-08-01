// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Navecita extends Actor
{

    /**
     * Act - do whatever the Navecita wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(1);
        if (Greenfoot.getRandomNumber(100) < 3) {
            turn(Greenfoot.getRandomNumber(90) - 3);
        }
        else if (getX() <= 10 || getX() >= getWorld().getWidth() - 3) {
            turn(180);
        }
        else if (getY() <= 10 || getY() >= getWorld().getHeight() - 3) {
            turn(180);
        }
        Actor bola;
        bola = getOneObjectAtOffset(0, 0, Bola.class);
        if (bola != null) {
            World world;
            world = getWorld();
            world.removeObject(bola);
            getWorld().showText("Ni modo,  ya perdiste.", getWorld().getWidth() / 2, getWorld().getHeight() / 2);
        }
    }
}
