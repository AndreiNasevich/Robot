package by.teachmeskills.robot.clothes.jacket;

public class TommyJeansJacket implements IJacket{


    @Override
    public void putOn() {
        System.out.println("In TommyJeans jacket.");
    }

    @Override
    public void takeOff() {
        System.out.println("Without TommyJeans jacket.");
    }
}

