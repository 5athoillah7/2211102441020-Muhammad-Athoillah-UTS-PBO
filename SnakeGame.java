import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class SnakeGame extends World
{
    private Snake snake;
    private Food food;
    private int score;
    
    public SnakeGame()
    {    
        super(600, 600, 1);
        snake = new Snake();
        food = new Food();
        addObject(snake, getWidth() / 2, getHeight() /2);
        addObject(food, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        score = 0;
    }
    
    public void act()
    {
        snake.move(10);
        checkCollision();
    }
    
    public void checkCollision()
    {
        {
            removeObject(food);
            addObject(food, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
            score++;
        }
    }
}
