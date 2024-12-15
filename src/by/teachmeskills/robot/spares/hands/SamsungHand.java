package by.teachmeskills.robot.spares.hands;

public class SamsungHand implements IHand {

    private int price;

    public  SamsungHand(int price) {
        this.price = price;
    }

    public  SamsungHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Гордо поднимаю Руку Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}