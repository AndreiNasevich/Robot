package by.teachmeskills.robot.spares.hands;

public class SonyHand implements IHand {

    private int price;

    public  SonyHand(int price) {
        this.price = price;
    }

    public  SonyHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Гордо поднимаю Руку Сони");
    }

    @Override
    public int getPrice() {
        return price;
    }

}
