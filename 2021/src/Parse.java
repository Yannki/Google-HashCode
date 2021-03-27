import javafx.util.Pair;

import java.io.File;  // Import the File class
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.FileNotFoundException;
import java.util.stream.Collectors;

public class Parse {

    public static Pair<Street[], Car[]> parseJunctions(String filename)
            throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        String currentLine[] = (scanner.nextLine().split(" "));
        Street.timeOfSim = Integer.parseInt(currentLine[0]);
        Street.junctCount = Integer.parseInt(currentLine[1]);
        Street[] streets = new Street[Integer.parseInt(currentLine[2])];
        Car[] cars = new Car[Integer.parseInt(currentLine[3])];
        Car.carBonusPoints = Integer.parseInt(currentLine[4]);


        for (int i = 0; i < streets.length; i++) {
            currentLine = (scanner.nextLine().split(" "));
            Street temp = new Street(Integer.parseInt(currentLine[0]),
                    Integer.parseInt(currentLine[1]), currentLine[2],
                    Integer.parseInt(currentLine[3]));
            streets[i] = temp;
        }

        for (int i = 0; i < cars.length; i++) {
            currentLine = (scanner.nextLine().split(" "));
            ArrayList<String> roadList = new ArrayList<String>();
            for (int j = 1; j < currentLine.length; j++) {
                roadList.add(currentLine[j]);
            }
            Car temp = new Car(Car.globalCarID, roadList);
            Car.globalCarID++;
            cars[i] = temp;
        }

        Pair<Street[], Car[]> res = new Pair<>(streets, cars);
        return res;
    }
}