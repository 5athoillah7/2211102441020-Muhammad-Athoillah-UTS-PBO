import greenfoot.*; 

public class Food extends Actor
{
    public Food() {
    GreenfootImage gambar = new GreenfootImage(20, 20);
    gambar.fill();
    setImage("apple1.png");
    }
    
    public void Food() {
        getWorld().addObject(new Food(),Greenfoot.getRandomNumber(getWorld().getWidth()),Greenfoot.getRandomNumber(getWorld().getWidth()));
        getWorld().removeObject(this);
    }
}