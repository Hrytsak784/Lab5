
    class ElectricCar extends Car {
        // Перевизначений метод
        void startEngine() {
            System.out.println("Автомобіль з електродвигуном запущено.");
        }

        // Перевантажений метод
        void startEngine(String chargingType) {
            System.out.println("Автомобіль з електродвигуном запущено (Тип зарядження: " + chargingType + ").");
        }
}
