public class Car extends Transport {


    public Car(String modelName, int wheelCount) {
        super(modelName, wheelCount);

    }

@Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у " + getModelName());
    }
@Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у " + getModelName());

    }
}
