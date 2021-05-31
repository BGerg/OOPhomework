import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ProgramHandler {

    public static void readAndHandleCommands() throws IOException {
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DataHandler dataHandler = new DataHandler();
        boolean isRunning = true;

        while (isRunning) {
            System.out.println(("Write your command:"));

            // Reading data using readLine
            String input = reader.readLine();


            if (input.equalsIgnoreCase("add")) {
                dataHandler.addNewCar();
            } else if (input.equalsIgnoreCase("delete")) {
                System.out.println("Delete");
            } else if (input.equalsIgnoreCase("print all")) {
                System.out.println("print all");
            } else if (input.equalsIgnoreCase("print electric")) {
                dataHandler.printElectricCars();
            } else if (input.equalsIgnoreCase("print classic")) {
                dataHandler.printClassicCars();
            } else if (input.equalsIgnoreCase("modificate")) {
                System.out.println("modificate");
            } else if (input.equalsIgnoreCase("print type")) {
                dataHandler.printType();
            } else if (input.equalsIgnoreCase("exit")){
                isRunning = false;
            } else {
                System.out.println("Invalid command");
            }

        }
    }

    @Override
    public String toString(){
        return "none";
    }
}
