public class Main {
    public static void main(String[] args) {

        Truck truck = new Truck();
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();

        Machine[] machine = {truck, bulldozer, excavator};
        for(Machine unit : machine) {
            unit.doWork();
            unit.stopWork();
        }
    }
}
