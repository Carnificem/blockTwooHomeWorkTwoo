public interface Info {
    String getModelName();

    void setModelName(String modelName);

    public int getWheelCount();

    default void setWheelCount(int wheelCount) {

    }
}

