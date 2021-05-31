import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class DataHandler {
    ArrayList<ElectricCar> electricCars = new ArrayList<>();
    ArrayList<InternalCombustionCar> classicCars = new ArrayList<>();
    HashSet<Integer> ids = new HashSet<>();
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
            System.out.println("Enter custom ID:");
            int id = scan.nextInt();
            System.out.println("Enter brand:");
            String brand = check_brand_correct();
            System.out.println("Enter model name:");
            String model = scan.nextLine();
            System.out.println("Enter color:");
            String color = scan.nextLine();
            System.out.println("Enter weight(kg):");
            int weight = scan.nextInt();
            System.out.println("Enter performance (Hp):");
            int performance = scan.nextInt();
            System.out.println("Enter range(km):");
            int range= scan.nextInt();
            System.out.println("Enter capacity of battery(kWh):");
            int battery = scan.nextInt();
            scan.nextLine();

            this.electricCars.add(new ElectricCar( id , brand, model, color,
                                                weight, performance, range,
                                                battery));
        } else if (carType.equalsIgnoreCase("classic")) {
            System.out.println("Enter custom ID:");
            int id = scan.nextInt();
            System.out.println("Enter brand:");
            String brand = check_brand_correct();
            System.out.println("Enter model name:");
            String model = scan.nextLine();
            System.out.println("Enter color:");
            String color = scan.nextLine();
            System.out.println("Enter weight(kg):");
            int weight = scan.nextInt();
            System.out.println("Enter performance (Hp):");
            int performance = scan.nextInt();
            System.out.println("Enter fuel tank capacity(L):");
            int fuelTankCapacity = scan.nextInt();
            System.out.println("Enter fuel type:");
            String fuelType = scan.nextLine();

            this.classicCars.add(new InternalCombustionCar( id , brand, model,
                                                            color, weight,
                                                            performance,
                                                            fuelTankCapacity,
                                                            fuelType));
        }
    }

    public String check_brand_correct(){
        Brands[] allBrand = Brands.values();
        String brand = null;
        boolean correct = true;
        scan.nextLine();
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
