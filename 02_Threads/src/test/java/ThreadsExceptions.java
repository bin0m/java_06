public class ThreadsExceptions {

    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = Thread.currentThread();
        new Thread(() -> {
            try {
                throw new IllegalArgumentException("Exception in thread");
            } catch (Throwable e) {
                mainThread.interrupt();
            }
        }).start();
        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
            Thread.sleep(100);
        }
    }

}
