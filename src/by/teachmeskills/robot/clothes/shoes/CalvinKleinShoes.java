package by.teachmeskills.robot.clothes.shoes;

public class CalvinKleinShoes implements IShoes {

    @Override
    public void putOn() {
        System.out.println("In Calvin Klein shoes.");
    }

    @Override
    public void takeOff() {
        System.out.println("Whithout Calvin Klein shoes.");
    }
}
