public class Truck extends Transport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }
@Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у " + getModelName());
    }
@Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп у " + getModelName());

    }
@Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у " + getModelName());

    }
}
