package me.iqpizza6349.creational.abstractfactory.car.factory;

import me.iqpizza6349.creational.abstractfactory.car.Car;
import me.iqpizza6349.creational.abstractfactory.carpart.CarPartsFactory;

public abstract class CarFactory {

    protected final CarPartsFactory carPartsFactory;

    public CarFactory(CarPartsFactory carPartsFactory) {
        this.carPartsFactory = carPartsFactory;
    }

    protected abstract Car createCar();
}
