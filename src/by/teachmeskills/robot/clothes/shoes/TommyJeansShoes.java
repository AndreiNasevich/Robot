package by.teachmeskills.robot.clothes.shoes;

public class TommyJeansShoes implements IShoes {


    @Override
    public void putOn() {
        System.out.println("In TommyJeans shoes.");

    }

    @Override
    public void takeOff() {
        System.out.println("Without TommyJeans shoes.");

    }
}
