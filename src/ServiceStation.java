public class ServiceStation {
    public void check(Car car) {
        car.serve();
        for (int i = 0; i < car.getWheelCount(); i++)
            car.updateTyre();
        car.checkEngine();
    }
    public void check(Bicycle bicycle) {
        bicycle.serve();
        for (int i = 0; i < bicycle.getWheelCount(); i++) {
            bicycle.updateTyre();
        }
    }
    public void check(Truck truck) {
        truck.serve();
        for (int i = 0; i < truck.getWheelCount(); i++) {
            truck.updateTyre();

        }
        truck.checkEngine();
        truck.checkTrailer();
    }
}


