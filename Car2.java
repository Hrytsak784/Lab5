class Car2 extends Car {

    // Вкладений клас
    class AdditionalInfo {
        void printCarInfo() {
            // Використовую методи та змінні зовнішнього класу Car
            System.out.println("Додаткова інформація про автомобіль:");
            System.out.println("Марка: " + getBrand());
            System.out.println("Рік випуску: " + getYear());
            System.out.println("Пробіг: " + getMileage());
        }
    }
    public Car2(String brand, int year, int mileage) {
        super(brand, year);
        setMileage(mileage);
    }

    // Додатковий метод вкладеного класу
    public void printAdditionalInfo() {
        AdditionalInfo additionalInfo = new AdditionalInfo();
        additionalInfo.printCarInfo();
    }
}