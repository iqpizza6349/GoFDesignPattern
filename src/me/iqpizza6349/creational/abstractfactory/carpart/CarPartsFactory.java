package me.iqpizza6349.creational.abstractfactory.carpart;

import me.iqpizza6349.creational.abstractfactory.carpart.carparts.Handle;
import me.iqpizza6349.creational.abstractfactory.carpart.carparts.Wheel;

public interface CarPartsFactory {
    Handle createHandle();
    Wheel createWheel();
}
