package by.teachmeskills.robot.spares.legs;

public class ToshibaLeg implements ILeg {


    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {
    }

    @Override
    public void step() {
        System.out.println("Танцуем с Тошиба");
    }

    @Override
    public int getPrice() {
        return price;
    }
}