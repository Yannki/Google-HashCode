import javafx.util.Pair;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "c";

        Pair<Street[], Car[]> temp = Parse.parseJunctions(filename + ".txt");
        Car cars[] = temp.getValue();
        Street streets[] = temp.getKey();

        Junction[] junctions = new Junction[Street.junctCount];

        for (int i = 0; i < junctions.length; i++) {
            junctions[i] = new Junction(i, new ArrayList<Street>(), new ArrayList<Street>());
        }

        for (int i = 0; i < streets.length; i++) {
            junctions[streets[i].endInter].inStreets.add(streets[i]);
            junctions[streets[i].startInter].outStreets.add(streets[i]);
        }

//		HashMap<String, Street> streetNames = new HashMap<String, Street>();
//		for (int i = 0; i < streets.length; i++) {
//			streetNames.put(streets[i].name, streets[i]);
//
//		}

//		HashMap<String,Street> nameToStreet = new HashMap<>(); TODO
//
//		for (Car car: cars) {
//			ArrayList<String> roads = car.getRoadList();
//
//			for (int i = 0; i < roads.size() - 1; i++) {
//				nameToStreet.get(roads.get(i)).inc();
//			}
//		}

        try {
            File myObj = new File("Solution" + filename + ".txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("Solution" + filename + ".txt");

            myWriter.write(Street.junctCount + "\n");

            for (int i = 0; i < Street.junctCount; i++) {
                ArrayList<Street> juncStreets = junctions[i].getInStreets();
                myWriter.write(junctions[i].id + "\n" + juncStreets.size() + "\n");

                for (Street street : juncStreets) {
                    myWriter.write(street.getName() + " 1\n");
                }
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
