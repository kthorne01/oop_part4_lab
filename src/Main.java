// Base class
class Vehicle {
    private String brand; // Accessible only within this class

    // Constructor
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Generic method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle brand: " + brand);
    }
}

// Car class extends Vehicle
class Car extends Vehicle {
    private String carType;

    public Car(String brand, String carType) {
        super(brand);
        this.carType = carType;
    }

    // Overriding the displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Car Type: " + carType);
    }
}

// Bike class extends Vehicle
class Bike extends Vehicle {
    private boolean hasBasket;

    public Bike(String brand, boolean hasBasket) {
        super(brand);
        this.hasBasket = hasBasket;
    }

    // Overriding the displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Has Basket: " + hasBasket);
    }
}

// Truck class extends Vehicle
class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(String brand, int loadCapacity) {
        super(brand);
        this.loadCapacity = loadCapacity;
    }

    // Overriding the displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

// Bus class extends Vehicle
class Bus extends Vehicle {
    private int passengerCapacity;

    public Bus(String brand, int passengerCapacity) {
        super(brand);
        this.passengerCapacity = passengerCapacity;
    }

    // Overriding the displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Passenger Capacity: " + passengerCapacity);
    }
}

// Main class to demonstrate
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Sedan");
        Bike bike = new Bike("Schwinn", true);
        Truck truck = new Truck("Ford", 10);
        Bus bus = new Bus("Mercedes", 50);

        car.displayDetails();
        bike.displayDetails();
        truck.displayDetails();
        bus.displayDetails();
    }
}

