public class Engine {
    private boolean status;
    private int power;

    public Engine(int power) {
        this.power = power;
        this.status = false; // Motorul este oprit implicit
    }

    public void startEngine() {
        if (!status) {
            status = true;
            System.out.println("Engine started with power: " + power);
        } else {
            System.out.println("Engine is already running.");
        }
    }

    public void stopEngine() {
        if (status) {
            status = false;
            System.out.println("Engine stopped.");
        } else {
            System.out.println("Engine is already stopped.");
        }
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Engine [power=" + power + ", status=" + (status ? "Running" : "Stopped") + "]";
    }
}
