public class CarAlarm {
    private boolean isActive;

    public CarAlarm() {
        this.isActive = false; // Alarma este dezactivată implicit
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
        System.out.println("Car alarm is now " + (isActive ? "active" : "inactive"));
    }

    @Override
    public String toString() {
        return "CarAlarm{" +
                "isActive=" + isActive +
                '}';
    }
}
