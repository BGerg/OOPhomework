import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataHandler {
    ArrayList<ElectricCar> electricCars = new ArrayList<>();
    ArrayList<InternalCombustionCar> classicCars = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    enum Brands {
        Toyota, Ford, Honda,
        Chevrolet, Mercedes,
        Jeep, BMW, Volkswagen,
    }

    public void addNewCar() throws IOException {
        System.out.println("Write type of the new car:");
        String carType = scan.nextLine();
        System.out.println("Enter some necessary data to an electric car");

        if (carType.equalsIgnoreCase("electric")) {
            System.out.println("Enter brand:");
            String brand = checkBrandCorrectness();
            System.out.println("Enter model name:");
            String model = scan.nextLine();
            System.out.println("Enter color:");
            String color = scan.nextLine();
            System.out.println("Enter weight(kg):");
            int weight = checkIsNumber();
            System.out.println("Enter performance (Hp):");
            int performance = checkIsNumber();
            System.out.println("Enter range(km):");
            int range = checkIsNumber();
            System.out.println("Enter capacity of battery(kWh):");
            int batteryCapacity = checkIsNumber();

            this.electricCars.add(new ElectricCar(brand, model, color,
                                                weight, performance, range,
                                                batteryCapacity));
        } else if (carType.equalsIgnoreCase("classic")) {
            System.out.println("Enter brand:");
            String brand = checkBrandCorrectness();
            System.out.println("Enter model name:");
            String model = scan.nextLine();
            System.out.println("Enter color:");
            String color = scan.nextLine();
            System.out.println("Enter weight(kg):");
            int weight = checkIsNumber();
            System.out.println("Enter performance (Hp):");
            int performance = checkIsNumber();
            System.out.println("Enter fuel tank capacity(L):");
            int fuelTankCapacity = checkIsNumber();
            System.out.println("Enter fuel type:");
            String fuelType = scan.nextLine();

            this.classicCars.add(new InternalCombustionCar( brand, model,
                                                            color, weight,
                                                            performance,
                                                            fuelTankCapacity,
                                                            fuelType));
        }
    }

    public int checkIsNumber(){
        String temp;
        boolean correct = true;
        int result = 0;
        while(correct) {
            temp = scan.nextLine();
            try {
                result = Integer.parseInt(temp);
                correct = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid parameter! Enter again:");
            }

        }
        return result;
    }
    public String checkBrandCorrectness(){
        Brands[] allBrand = Brands.values();
        String brand = null;
        boolean correct = true;
        while(correct) {
            brand = scan.nextLine();
            for (Brands b : allBrand) {
                if (b.name().equalsIgnoreCase(brand)) {
                    correct = false;
                }
            }
            if (correct == true) {
                System.out.println("Unknown brand!\nEnter brand:");
            }
        }

        return brand;
    }

    public void printElectricCars(){
        for(ElectricCar eCars:electricCars) {
            System.out.println(eCars);
        }
    }

    public void printClassicCars(){
        for(InternalCombustionCar cCars:classicCars) {
            System.out.println(cCars);
        }
    }

    public void printAllCars(){
        printClassicCars();
        printElectricCars();
    }

    public void deleteCar() {
        System.out.println("Which ID's car do you want to delete?");
        int id = scan.nextInt();
        for (ElectricCar eCars : electricCars) {
            if (eCars.getId() == id) {
                electricCars.remove(eCars);
            }
        }
        }

    public void printType(){
        System.out.println("Which brand do you want to list?");
        String brandName = scan.nextLine();
        for(ElectricCar eCars:electricCars) {
            if (eCars.getBrand().equalsIgnoreCase(brandName)) {
                System.out.println(eCars);
            }
        }
    }

    @Override
    public String toString() {
        return "none";
    }
}
