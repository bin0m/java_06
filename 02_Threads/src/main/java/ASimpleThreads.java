import java.util.Scanner;

/**
 * Простой пример на потоки
 */
public class ASimpleThreads {

    public static void main(String[] args) {
        // Первый поток
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Начало потока 1");
                // Длинный цикл
                for (int cnt = 0; cnt < 10; ++cnt) {
                    System.out.println("Поток1: cnt = " + cnt);
                    System.out.println("Имя потока: " + Thread.currentThread().getName());
                    try {
                        // Пауза: 1 секунда
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                System.out.println("Окончание потока 1");
            }
        });
        // Ввод строчек
        Thread thread2 = new Thread(() -> {
            System.out.println("Начало потока 2");
            Scanner scanner = new Scanner(System.in);
            String result = scanner.nextLine();
            System.out.println("result = " + result);
            System.out.println("Окончание потока 2");
        });
        System.out.println("Запускаем поток 1");
        thread1.start();
        System.out.println("Запускаем поток 2");
        thread2.start();

        System.out.println("Основной поток называется: " + Thread.currentThread().getName());
    }
}
