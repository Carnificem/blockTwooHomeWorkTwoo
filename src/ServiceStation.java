public class ServiceStation extends Transport {

    public ServiceStation(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    public ServiceStation() {
        super();
    }

    public void check(Transport transport) {
        if (transport != null) {
            System.out.println("Обслуживаем " + transport.getModelName());
            for (int i = 0; i < transport.getWheelCount(); i++) {
                transport.updateTyre();
            }
            if (transport instanceof Car) {
                transport.checkEngine();
            }
            if (transport instanceof Truck) {
                transport.checkEngine();
                transport.checkTrailer();
            }
        }
    }
}