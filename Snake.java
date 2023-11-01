import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Snake extends Actor
{
    private int speed = 1;
    private int delay = 10;
    private int counter = 0;
    private int[] xCoords = new int[100];
    private int[] yCoords = new int[100];
    private int direction = 0;
    
    public Snake() 
    {
        setImage("snake.png");
    }
    
    public void act()
    {
        move(9);
        if (Greenfoot.isKeyDown("up")) {
            turn(9);
        }
        if (Greenfoot.isKeyDown("down")) {
            turn(-9);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-9);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(9);
        }
    }
    public void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("right") && direction != 2) {
            direction = 0;
        }
        if (Greenfoot.isKeyDown("up") && direction != 3) {
            direction = 1;
        }
        if (Greenfoot.isKeyDown("left") && direction != 0) {
            direction = 2;
        }
        if (Greenfoot.isKeyDown("down") && direction != 1) {
            direction = 3;
        }
    }
    
    public void checkEdgeCollision()
    {
        if (getX()  <= 0 || getX() >= getWorld().getWidth() - 1 || getY() <= 0 || getY() >= getWorld().getHeight() -1) {
            Greenfoot.stop();
        }
    }
}
        