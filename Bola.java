// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Bola extends Actor
{
    private int dx = 0;
    private int dy = 5;
    public Barra barra;
    public World myWorld;
    private int ContadorDePuntos = 0;

    /**
     * 
     */
    public Bola(Barra barra, World myWorld)
    {
        myWorld = myWorld;
        this.barra = barra;
    }

    /**
     * Act - do whatever the Bola wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        MovimientoBola();
        Rebote();
        Desaparicion();
        StoppageTime();
    }

    /**
     * Desaparicion es el método en el que la bola al tocar los bloques, estos desaparecerán.
     */
    public void Desaparicion()
    {
        Actor bloques = getOneIntersectingObject(Bloques.class);
        if (bloques != null && bloques.getX() > getX() + 30) {
            getWorld().removeObject(bloques);
            dx =  - dx;
            ContadorDePuntos = ContadorDePuntos + 1;
        }
        else if (bloques != null && bloques.getX() > getX() - 30) {
            getWorld().removeObject(bloques);
            dx =  - dx;
            ContadorDePuntos = ContadorDePuntos + 1;
        }
        else if (bloques != null) {
            getWorld().removeObject(bloques);
            ContadorDePuntos = ContadorDePuntos + 1;
        }
    }

    /**
     * 
     */
    public void MovimientoBola()
    {
        setLocation(getX() + dx, getY() + dy);
    }

    /**
     * 
     */
    public void Rebote()
    {
        if (isTouching(Barra.class) && this.barra.getX() > getX() + 50) {
            dy =  - dy;
            dx = -6;
        }
        else if (isTouching(Barra.class) && this.barra.getX() < getX() - 50) {
            dy =  - dy;
            dx = 6;
        }
        else if (isTouching(Barra.class) && this.barra.getX() > getX() + 40) {
            dy =  - dy;
            dx = -5;
        }
        else if (isTouching(Barra.class) && this.barra.getX() < getX() - 40) {
            dy =  - dy;
            dx = 5;
        }
        else if (isTouching(Barra.class) && this.barra.getX() > getX() + 30) {
            dy =  - dy;
            dx = -4;
        }
        else if (isTouching(Barra.class) && this.barra.getX() < getX() - 30) {
            dy =  - dy;
            dx = 4;
        }
        else if (isTouching(Barra.class) && this.barra.getX() > getX() + 20) {
            dy =  - dy;
            dx = -3;
        }
        else if (isTouching(Barra.class) && this.barra.getX() < getX() - 20) {
            dy =  - dy;
            dx = 3;
        }
        else if (isTouching(Barra.class) && this.barra.getX() > getX() + 10) {
            dy =  - dy;
            dx = -2;
        }
        else if (isTouching(Barra.class) && this.barra.getX() < getX() - 10) {
            dy =  - dy;
            dx = 2;
        }
        else if (isTouching(Barra.class) || isTouching(Bloques.class)) {
            dy =  - dy;
        }
        if (getX() >= getWorld().getWidth() - 1) {
            dx =  - dx;
        }
        if (getX() <= 0) {
            dx =  - dx;
        }
        if (getY() >= getWorld().getHeight() + 1) {
            dy =  - dy;
        }
        if (getX() >= 750) {
            dy =  - dy;
        }
    }

    /**
     * 
     */
    public void StoppageTime()
    {
        if (ContadorDePuntos == 120) {
            getWorld().showText("Felicidades,  has ganado!", getWorld().getWidth() / 2, getWorld().getHeight() / 2);
        }
    }
}
