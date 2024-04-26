public class ServiceStation {

    public ServiceStation() {

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