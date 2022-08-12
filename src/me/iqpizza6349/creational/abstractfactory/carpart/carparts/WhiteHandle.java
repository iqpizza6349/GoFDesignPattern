package me.iqpizza6349.creational.abstractfactory.carpart.carparts;

import me.iqpizza6349.creational.abstractfactory.carpart.carparts.Handle;

public class WhiteHandle extends Handle {

    @Override
    protected void handle() {
        System.out.println("자동차 handle");
    }
}
