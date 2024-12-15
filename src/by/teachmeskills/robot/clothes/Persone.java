package by.teachmeskills.robot.clothes;

import by.teachmeskills.robot.clothes.jacket.IJacket;
import by.teachmeskills.robot.clothes.pants.IPants;
import by.teachmeskills.robot.clothes.shoes.IShoes;

public class Persone {
    private String name;
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public Persone(String name, IJacket jacket, IPants pants, IShoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public void dressUp () {
        System.out.println(name + " dressed up.");
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    public void undress () {
        System.out.println(name + " took off.");
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }
}


