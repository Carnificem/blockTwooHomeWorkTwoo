public abstract class Transport implements Info {
    private String modelName;
    private int wheelCount;


    public Transport(String modelName, int wheelCount) {
        this.modelName = modelName;
        this.wheelCount = wheelCount;
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

    public void checkEngine() {
        System.out.println("Проверяем двигатель у " + getModelName());
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп у " + getModelName());

    }

    public void updateTyre() {
        System.out.println("Меняем покрышку у " + getModelName());

    }

}
