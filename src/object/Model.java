package object;

public class Model implements Cloneable{

    private int id;
    private int value;

    public Model(int id, int value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Model clone() throws CloneNotSupportedException {
        return (Model) super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize의 override는 비권장이다");
    }

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Model model = (Model) o;

        return id == model.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
