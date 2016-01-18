/**
 * Использование ядер
 */
public class Cores {

    public static void main(String[] args) {
        class HardTask implements Runnable {
            @Override
            public void run() {
                while (true) ; // nothing
            }
        }
        Thread[] threads = new Thread[4];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new HardTask());
            threads[i].start();
        }
    }
}
