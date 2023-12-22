public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Engine engine1 = new Engine();
        Transmission transmission1 = new Transmission();

        car1.setBrand("BMW");
        car1.setYear(2022);
        car1.setMileage(10000);

        engine1.setSpeed(150);
        transmission1.setGears(6);

        car1.doubleMileage();
        transmission1.increaseGearsTwice();

        car1.complexLogic(engine1, transmission1);

        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Mileage: " + car1.getMileage());
        System.out.println("Speed: " + engine1.getSpeed());
        System.out.println("Gears: " + transmission1.getGears());
        System.out.println();

        Car2 car2 = new Car2("Audi", 2022, 15000);

        // Виклик методу, що використовує вкладений клас
        car2.printAdditionalInfo();
        System.out.println();
        System.out.println("Автомобіль: Tesla model S");

        Car car = new Car();
        ElectricCar electricCar = new ElectricCar();
        electricCar.startEngine(); // Виклик перевизначеного методу
        electricCar.startEngine("Швидке"); // Виклик перевантаженого методу
    }
}