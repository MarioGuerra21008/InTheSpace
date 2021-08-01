// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Barra extends Actor
{

    /**
     * 
     */
    public void act()
    {
        Movimiento();
    }

    /**
     * 
     */
    public void Movimiento()
    {
        if (Greenfoot.isKeyDown("left")) {
            move(-10);
        }
        if (Greenfoot.isKeyDown("right")) {
            move(10);
        }
    }
}
