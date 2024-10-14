public class main {
    public static void main(String[] args) {
        Engine e1 = new DieselEngine(100, 15);
        // Crearea primei mașini cu un motor Diesel
        Car car1 = Car.getInstance(e1, "Red");
        car1.startCar(); // Pornește mașina

        car1.stopCar(); // Oprește mașina

        // Resetarea instanței pentru a crea o nouă mașină
        Car.resetInstance();

        Engine e2 = new ElectricEngine(50, 12);
        // Crearea unei a doua mașini cu un motor electric
        Car car2 = Car.getInstance(e2, "Blue");

        for (int i = 0; i < 5; i++) {
            car2.startCar(); // Pornește mașina electrică
            car2.stopCar(); // Oprește mașina electrică
        }
    }
}
