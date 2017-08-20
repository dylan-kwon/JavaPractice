package patterns.Singleton;

public class Model {

    private Model() {
        // Singletone Pattern
    }

    private static class Singleton {
        private static final Model instance = new Model();
    }

    public static Model getInstance() {
        return Singleton.instance;
    }

}
