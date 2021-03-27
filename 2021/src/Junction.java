import javafx.util.Pair;
import java.util.ArrayList;

public class Junction {
    int id;
    ArrayList<Street> inStreets;
    ArrayList<Street> outStreets;

    public Junction(int id, ArrayList<Street> inStreets,
                    ArrayList<Street> outStreets) {
        this.id = id;
        this.inStreets = inStreets;
        this.outStreets = outStreets;
    }

    public int getId() {
        return this.id;
    }

    public ArrayList<Street> getInStreets() {
        return inStreets;
    }

    public void setInStreets(ArrayList<Street> inStreets) {
        this.inStreets = inStreets;
    }

    public ArrayList<Street> getOutStreets() {
        return outStreets;
    }

    public void setOutStreets(ArrayList<Street> outStreets) {
        this.outStreets = outStreets;
    }
}
