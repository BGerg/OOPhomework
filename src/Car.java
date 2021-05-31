abstract class Car {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private String brand;
    private String model;
    private String color;
    private float weight;
    private int performance;

    public Car(int id, String brand, String model, String color, float weight, int performance) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.weight = weight;
        this.performance = performance;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + " Model: " + this.model
                + " Color: " + this.color + " Weight " + this.weight
                + " Performance: " + this.performance;


    }

}
