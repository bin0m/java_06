import javax.swing.*;

public class PrimeNumbers {
    JList<String> primesList;
    JSpinner toValue;
    JButton findAllPrimes;
    JSpinner fromValue;
    JPanel mainPanel;

    public PrimeNumbers() {
        fromValue.setValue(2000000000);
        toValue.setValue(2100000000);

        // Список чисел
        DefaultListModel<String> primes = new DefaultListModel<>();
        primesList.setModel(primes);

        findAllPrimes.addActionListener(actionEvent -> new Thread(() -> {
            int from = (int) fromValue.getValue();
            int to = (int) toValue.getValue();
            System.out.println("Поиск простых чисел в диапазоне " + from + "..." + to);

            for (int p = from; p <= to; p++) {
                if (isPrime(p)) {
                    final int prime = p;
                    SwingUtilities.invokeLater(() -> {
                        // Действия между событиями Swing
                        primes.addElement(Integer.toString(prime));
                    });
                }
            }
        }).start());
    }

    public static void main(String[] args) {
        // Создаём форму
        JFrame frame = new JFrame("Поиск простых чисел");
        // Задаём содержимое формы
        frame.setContentPane(new PrimeNumbers().mainPanel);
        // Выравниваем компоненты
        frame.pack();
        // При закрытии окна закрываем и программу,
        // иначе она останется висеть в процессах
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Показываем форму
        frame.setVisible(true);
    }

    /**
     * @param p целое число
     * @return является ли простым?
     */
    boolean isPrime(long p) {
        if (p <= 1)
            return false;
        for (int i = 2; i * i <= p; i++)
            if (p % i == 0) return false;
        return true;
    }
}
