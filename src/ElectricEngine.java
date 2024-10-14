public class ElectricEngine extends Engine {
    private int batteryLevel;

    public ElectricEngine(int power, int batteryLevel) {
        super(power);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void startEngine() {
        if (batteryLevel > 0) {
            super.startEngine();
            batteryLevel--;
            System.out.println("Electric engine is started.");
        } else {
            System.out.println("Engine cannot be started. Battery is empty.");
        }
    }

    @Override
    public String toString() {
        return "ElectricEngine [batteryLevel=" + batteryLevel + ", " + super.toString() + "]";
    }
}
