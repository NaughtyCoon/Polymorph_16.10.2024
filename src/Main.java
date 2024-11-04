public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Garage garage = new Garage();

        garage.operateVehicle(car);
        garage.operateVehicle(bicycle);
        garage.operateVehicle(boat);
    }
}