public class ElectricCar extends Car {
    private int range;
    private int batteryCapacity;

    public ElectricCar(String brand, String model, String color,
                       float weight, int performance, int range,
                       int batteryCapacity) {

        super(brand, model, color, weight, performance);
        this.range = range;
        this.batteryCapacity = batteryCapacity;

    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }



    @Override
    public String toString() {
        return "ElectricCar " + "Id: " + getId() +
                " Brand: " + getBrand() +
                " Model: " + getModel() +
                " Color: " + getColor() +
                " Weight: " + getWeight() +
                " Performance: " + getPerformance() +
                " Range: " + getRange() +
                " Battery capacity: " + getBatteryCapacity() +
                "";
    }
}
