package by.teachmeskills.robot.spares.legs;

public class SamsungLeg implements ILeg {

    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg() {
    }

    @Override
    public void step() {
        System.out.println("Идем вперед");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
