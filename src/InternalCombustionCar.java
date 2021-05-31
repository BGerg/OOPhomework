public class InternalCombustionCar extends Car{
    int fuelTankCapacity;
    String fuelType;

    public InternalCombustionCar(String brand, String model,
                                 String color, float weight,
                                 int performance, int fuelTankCapacity,
                                 String fuelType) {
        super(brand, model, color, weight, performance);
        this.fuelTankCapacity = fuelTankCapacity;
        this.fuelType = fuelType;
    }


    public int getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(int fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }


    @Override
    public String toString() {
        return "InternalCombustionCar" +
                " Id: " + getId() +
                " Brand: " + getBrand() +
                " Model: " + getModel() +
                " Color: " + getColor() +
                " Weight: " + getWeight() +
                " Performance: " + getPerformance() +
                " Fuel tank capacity:" + fuelTankCapacity +
                " Fuel type:'" + fuelType + '\'' +
                '}';
    }
}
