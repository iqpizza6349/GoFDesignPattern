package me.iqpizza6349.creational.abstractfactory.car;

import me.iqpizza6349.creational.abstractfactory.carpart.carparts.Handle;
import me.iqpizza6349.creational.abstractfactory.carpart.carparts.Wheel;

public class Car {
    private Handle handle;
    private Wheel wheel;

    public Car(Handle handle, Wheel wheel) {
        this.handle = handle;
        this.wheel = wheel;
    }

    public void setHandle(Handle handle) {
        this.handle = handle;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}
