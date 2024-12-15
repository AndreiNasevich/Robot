package by.teachmeskills.robot.clothes.pants;

public class CalvinKleinPants implements IPants {

    @Override
    public void putOn() {
        System.out.println("In Calvin Klein pants.");
    }

    @Override
    public void takeOff() {
        System.out.println("Without Calvin Klein pants.");
    }
}
