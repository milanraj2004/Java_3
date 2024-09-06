class Car {
    String brand;
    int year;

    // Constructor
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Year of Manufacture: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2020); // Creating an object
        myCar.displayInfo(); // Displaying car information
    }
}
