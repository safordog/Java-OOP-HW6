/*
 * Создайте сто потоков, которые будут вычислять факториал
 * числа, равного номеру этого потока, и выводить результат на
 * экран.
 */
package homework6;

/**
 *
 * @author safordog
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 100; i++) {
            new Thread(new MyThread(i)).start();
        }
    }
    
}
