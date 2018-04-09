package object;

public class A extends Model {

    public A(int id, int value) {
        super(id, value);
    }

    @Override
    public int getValue() {
        return 100000;
    }
}
