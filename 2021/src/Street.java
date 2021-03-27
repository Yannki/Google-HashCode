public class Street {
    String name;
    int startInter;
    int endInter;
    int length;
    int counter;

    static int timeOfSim;
    static int junctCount;

    public Street(int startInter, int endInter, String name, int length) {
        this.name = name;
        this.startInter = startInter;
        this.endInter = endInter;
        this.length = length;
        this.counter = 0;
    }

    public void inc() {
        this.counter++;
    }

    public String getName() {
        return name;
    }
}