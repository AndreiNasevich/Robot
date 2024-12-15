package by.teachmeskills.robot.clothes.pants;

public class TommyJeansPants implements IPants {

    @Override
    public void putOn() {
        System.out.println("In TommyJeans pants.");
    }

    @Override
    public void takeOff() {
        System.out.println("Without TommyJeans pants.");
    }
}
