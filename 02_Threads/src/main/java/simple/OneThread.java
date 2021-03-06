package simple;

/**
 * 1. Одновременность выполнения
 * (многопоточность).
 * 2. Разделение ресурсов (память).
 * <p>
 * Процесс - Process -
 * У каждого процесса своя область памяти,
 * к которой нет доступа у других процессов.
 * Пример: Word.exe - у него своя область памяти
 * и другие процессы не имеют к ней доступа.
 * <p>
 * Поток - Stream
 * Поток выполнения
 * Поток ввода-вывода
 * Нить - Thread - для отличия от потока ввода-вывода
 * При этом в рускоязычной литературе
 * сайтах/форумах переводят как Поток
 * В каждом Thread есть свой стек,
 * при этом статические поля и
 * heap (куча) едины.
 * Все Thread выполняются в одной JVM
 * т.е. один поток может менять память
 * другого потока.
 * <p>
 * Потоки (нити) нужны для параллельного выполнения
 * различный операций.
 * Пример:
 * Интерфейс - с ним постоянно работает пользователь
 * и он не должен подвисать на время выполнения
 * "долгих" операций.
 * "Долгие" вычисления - выполняются в отдельном потоке
 * и отправляют время от времени данные о
 * ходе вычислений в поток Интерфейса.
 * Пример 2:
 * Серверное приложение.
 * Для каждого "нового" клиента создаётся новый поток,
 * в котором происходит вся обработка его запросов.
 * И есть основной поток, который постоянно ждёт
 * новые подключения от пользователя.
 */
public class OneThread {
    public static void main(String[] args) {
        // Основной начальный поток "main"
        System.out.println(
                Thread.currentThread().getName());
        System.out.println("Thread.activeCount() = " +
                Thread.activeCount());
    }
}
