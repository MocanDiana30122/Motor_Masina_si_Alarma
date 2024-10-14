public class DieselEngine extends Engine {
    private int fuelLevel;

    public DieselEngine(int power, int fuelLevel) {
        super(power);
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void startEngine() {
        if (fuelLevel > 0) {
            super.startEngine();
            fuelLevel--;
            System.out.println("Diesel engine is started.");
        } else {
            System.out.println("Engine cannot be started. No fuel.");
        }
    }

    @Override
    public String toString() {
        return "DieselEngine [fuelLevel=" + fuelLevel + ", " + super.toString() + "]";
    }
}
