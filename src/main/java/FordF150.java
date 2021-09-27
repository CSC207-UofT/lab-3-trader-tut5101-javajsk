/*
 * This file defines a class named FordF150.
 * This class implements the Drivable and Tradable interfaces.
 */
public class FordF150 implements Drivable, Tradable{
    private int maxSpeed;

    public FordF150() {
        this.maxSpeed = 130;
    }

    /**
     *Increase this FordF150's maximum speed by 5
     */
    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 5;
    }

    /**
     *Decrease this FordF150's maximum speed by 5
     */
    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 5;
    }

    /**
     *Return the maximum speed of this FordF150
     */
    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     *Return the price of this FordF150
     */
    @Override
    public int getPrice() {
        return 34000;
    }
}
