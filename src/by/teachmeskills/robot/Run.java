package by.teachmeskills.robot;

import by.teachmeskills.robot.clothes.Persone;
import by.teachmeskills.robot.clothes.jacket.TommyJeansJacket;
import by.teachmeskills.robot.clothes.pants.CalvinKleinPants;
import by.teachmeskills.robot.clothes.pants.TommyJeansPants;
import by.teachmeskills.robot.clothes.shoes.TommyJeansShoes;
import by.teachmeskills.robot.spares.hands.SamsungHand;
import by.teachmeskills.robot.spares.hands.SonyHand;
import by.teachmeskills.robot.spares.hands.ToshibaHand;
import by.teachmeskills.robot.spares.heads.SamsungHead;
import by.teachmeskills.robot.spares.heads.SonyHead;
import by.teachmeskills.robot.spares.heads.ToshibaHead;
import by.teachmeskills.robot.spares.legs.SamsungLeg;
import by.teachmeskills.robot.spares.legs.SonyLeg;
import by.teachmeskills.robot.spares.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

//
//        SamsungHand samsungHand = new SamsungHand(100);
//        ToshibaHand toshibaHand = new ToshibaHand(200);
//        SonyHand sonyHand = new SonyHand(300);
//
//        SamsungHead samsungHead = new SamsungHead(100);
//        ToshibaHead toshibaHead = new ToshibaHead(200);
//        SonyHead sonyHead = new SonyHead(300);
//
//        SamsungLeg samsungLeg = new SamsungLeg(100);
//        ToshibaLeg toshibaLeg = new ToshibaLeg(10000000);
//        SonyLeg sonyLeg = new SonyLeg(300);
//
//
//
//        Robot samsungRobot = new Robot(samsungHead, toshibaHand, sonyLeg);
//        Robot toshibaRobot = new Robot(toshibaHead, sonyHand, samsungLeg);
//        Robot sonyRobot = new Robot(sonyHead, samsungHand, toshibaLeg);
//
//        samsungRobot.action();
//        toshibaRobot.action();
//        sonyRobot.action();
//
//
//        if (samsungRobot.getPrice() > toshibaRobot.getPrice() && samsungRobot.getPrice() > sonyRobot.getPrice()) {
//            System.out.println("Samsung robot is the most expensive");
//        } else if (toshibaRobot.getPrice() > samsungRobot.getPrice() && toshibaRobot.getPrice() > sonyRobot.getPrice()) {
//            System.out.println("Toshiba robot is the most expensive");
//        } else if (sonyRobot.getPrice() > samsungRobot.getPrice() && sonyRobot.getPrice() > toshibaRobot.getPrice()) {
//            System.out.println("Sony robot is the most expensive");
//        } else {
//            System.out.println("All robots have the same price");
//        }

        Persone persone = new Persone("Ivan", new TommyJeansJacket(), new CalvinKleinPants(), new TommyJeansShoes());
        persone.dressUp();
        persone.undress();

    }
}
