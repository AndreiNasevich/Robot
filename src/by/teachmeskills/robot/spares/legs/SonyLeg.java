package by.teachmeskills.robot.spares.legs;

public class SonyLeg implements ILeg {

    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {
    }

    @Override
    public void step() {
        System.out.println("Идем назад с Сони");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
