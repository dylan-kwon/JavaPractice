package object;

public class ObjectMethod {
    public static void main(String[] args) {

        Model modelA = new Model(0, 100);
        Model modelB = new Model(0, 200);

        // toString
        System.out.println("modelA.toString = " + modelA.toString());
        System.out.println("modelB.toString = " + modelB.toString());
        System.out.println();

        // equals
        System.out.println("equals = " + modelA.equals(modelB));
        System.out.println();

        // clone
        try {
            Model cloneModel = modelA.clone();
            System.out.println("cloneModel.toString = " + cloneModel.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
