/*
 * Реализуйте программу, которая с периодичностью 1 сек,
 * будет проверять состояние заданного каталога. Если в этом
 * каталоге появится новый файл или исчезнет существующий,
 * то выведется сообщение об этом событии. Программа
 * должна работать в параллельном потоке выполнения.
 */
package homework6a;

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
        Thread t = new Thread(new MyThread());
        t.start();
    }
    
}
