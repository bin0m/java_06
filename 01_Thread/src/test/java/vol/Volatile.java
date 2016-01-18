package vol;

import org.junit.Test;

/**
 * Демонстрация volatile
 */
public class Volatile {
    /**
     * a
     */
    @Test
    public void testVolatile() {
        for (int i = 0; i < 1000; i++) {
            Thread t1 = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    TestVolatile.one();
                    TestVolatile.two();
                }
            });
            t1.start();
        }
    }

    static class TestVolatile {
        static volatile int i = 0, j = 0;

        static void one() {
            i++;
            j++;
        }

        static void two() {
            int lj = j, li = i;
            if (lj - li > 100) {
                System.out.println("i=" + li + " j=" + lj);
            }
        }
    }
}
