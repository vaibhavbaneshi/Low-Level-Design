package Inheritance;

class Car {
    protected String brand;
    protected String model;
    protected String currentSpeed;

    protected Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    protected void currentSpeed(int currentSpeed) {
        System.out.println("Current speed of the car is : " + currentSpeed);
    }
}

class ManualCar extends Car {

    private int currentGear;

    ManualCar(String brand, String model)  {
        super(brand, model);
        System.out.println("Manual Car Brand : " + brand + " and Model : " + model);
    }

    public void currentGearPrint(int gear) {
        this.currentGear = gear;
        System.out.println(currentGear);
    }
}


public class Inheritance {
    public static void main(String[] args) {
        ManualCar obj = new ManualCar("Tata", "Curvv");
        obj.currentGearPrint(5);
    }
}
