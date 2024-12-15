package by.teachmeskills.robot.hands;

public class ToshibaHand implements IHand {


    private int price;

    public  ToshibaHand(int price) {
        this.price = price;
    }

    public  ToshibaHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Гордо поднимаю Руку Тошиба");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
