public class Main {
    public static void main(String[] args) {

        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        Machine[] machine = {truck, bulldozer, excavator};
        for(Machine unit : machine) {
            unit.doWork();
            unit.stopWork();
        }
    }
}
