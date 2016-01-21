import javax.swing.*;

public class PrimeNumbers {
    private JList primesList;
    private JSpinner spinner1;
    private JButton findAllPrimes;
    private JSpinner spinner2;

    public PrimeNumbers() {
        findAllPrimes.addActionListener(actionEvent -> new Thread(() -> {
            // Поиск простых чисел

            SwingUtilities.invokeLater(() -> {
                // Действия между событиями Swing
            });
        }).start());
    }


}
