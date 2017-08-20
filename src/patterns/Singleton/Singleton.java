package patterns.Singleton;

import java.util.ArrayList;

public class Singleton {

    public static void main(String[] args) {
        Singleton singleton = new Singleton();
        singleton.startThread();
    }

    private void startThread() {
        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            threads.add(new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Model.getInstance().hashCode());
                }
            }));
        }

        for (Thread thread : threads) {
            thread.start();
        }
    }
}
