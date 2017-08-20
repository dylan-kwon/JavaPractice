package generic;

public class Generic {
    public static void main(String[] args) {
        Model<String> strModel = new Model<String>();
        strModel.setValue("StringModel");
        System.out.println(strModel.getValue());

        System.out.println();

        Model<Integer> intModel = new Model<Integer>();
        intModel.setValue(10);
        System.out.println(intModel.getValue());
    }
}
