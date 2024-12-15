package by.teachmeskills.robot.clothes.jacket;

public class CalvinKleinJacket implements IJacket {


    @Override
    public void putOn() {
        System.out.println("In Calvin Klein jacket.");
    }

    @Override
    public void takeOff() {
        System.out.println("Without Calvin Klein jacket.");
    }
}
