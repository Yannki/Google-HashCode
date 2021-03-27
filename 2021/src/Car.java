import java.util.ArrayList;

public class Car {
    static int globalCarID = 0;
    static int carBonusPoints;
    int carID;
    ArrayList<String> roadList;

    public Car(int carID, ArrayList<String> roadList) {
        this.carID = carID;
        this.roadList = roadList;
    }

    public ArrayList<String> getRoadList() {
        return roadList;
    }

    public void removeRoad() {
        roadList.remove(0);
    }

    public boolean isEmpty() {
        return roadList.size() < 1;
    }
}