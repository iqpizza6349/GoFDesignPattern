package me.iqpizza6349.creational.abstractfactory.car.factory;

import me.iqpizza6349.creational.abstractfactory.car.Car;
import me.iqpizza6349.creational.abstractfactory.carpart.CarPartsFactory;

public class WhiteCarFactory extends CarFactory {

    public WhiteCarFactory(CarPartsFactory carPartsFactory) {
        super(carPartsFactory);
    }

    @Override
    protected Car createCar() {
        return new Car(carPartsFactory.createHandle(), carPartsFactory.createWheel());
    }
}
