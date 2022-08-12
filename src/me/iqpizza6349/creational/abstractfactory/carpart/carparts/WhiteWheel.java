package me.iqpizza6349.creational.abstractfactory.carpart.carparts;

import me.iqpizza6349.creational.abstractfactory.carpart.carparts.Wheel;

public class WhiteWheel extends Wheel {

    @Override
    protected void move() {
        System.out.println("바퀴 움직이기");
    }
}
