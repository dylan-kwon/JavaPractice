package generic;

public class Model<T> {

    private T mValue;

    public T getValue() {
        return mValue;
    }

    public void setValue(T value) {
        mValue = value;
    }

}
