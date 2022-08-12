package me.iqpizza6349.creational.abstractfactory.carpart;

import me.iqpizza6349.creational.abstractfactory.carpart.carparts.Handle;
import me.iqpizza6349.creational.abstractfactory.carpart.carparts.Wheel;
import me.iqpizza6349.creational.abstractfactory.carpart.carparts.WhiteHandle;
import me.iqpizza6349.creational.abstractfactory.carpart.carparts.WhiteWheel;

public class WhiteCarPartsFactory implements CarPartsFactory {

    @Override
    public Handle createHandle() {
        return new WhiteHandle();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
