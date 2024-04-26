public abstract class Transport implements Info {
    private String modelName;
    private int wheelCount;


    public Transport(String modelName, int wheelCount) {
        this.modelName = modelName;
        this.wheelCount = wheelCount;
    }

    public Transport() {

    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }
@Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у " + getModelName());
    }

public void serve(){
    System.out.println("Обслуживаем "+getModelName());
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
