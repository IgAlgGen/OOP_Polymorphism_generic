package Transport;

import Drivers.License_B;

public class Car extends Transport<License_B> {

    public Car(String mark, String model, double engineVolume, License_B driverInfo) {
        super(mark, model, engineVolume, driverInfo);
    }

    public void startMoving() {
        System.out.println("Транспортное средство "+ getMark()+ " "+ getModel()+ " начало движение.");
    }

    public void finishMoving() {
        System.out.println("Транспортное средство "+ getMark()+ " "+ getModel()+ " закончило движение.");
    }

    @Override
    public void pitStop() {
        System.out.println("Время пит-стоп ");
    }

    @Override
    public void bestTimeLap() {
        System.out.println("Лучший круг ");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость ");
    }
}
