abstract class Car {
    private String brand;
    private String model;
    private String color;
    private int weight;
    private int performance;
    private int id;
    private static int count;

    public Car(String brand, String model, String color, int weight, int performance) {
        count++;
        this.setBrand(brand);
        this.setModel(model);
        this.setColor(color);
        this.setWeight(weight);
        this.setPerformance(performance);
        this.id = count;
    }

    public int getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.equals("")){
            this.color = "-";
        } else {
            System.out.println("nok");
            this.color = color;
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.equals("")){
            this.brand  = "-";
        } else {
            System.out.println("nok");
            this.brand  = brand;
        }
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
