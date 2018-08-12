/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework6;

/**
 *
 * @author safordog
 */
public class MyThread implements Runnable {
    private int count;
    
    public MyThread(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1; i++) {
            System.out.println("Thread " + count + ": " 
                    + (new Factorial().getFactorial(count)));
        }
    }
    
}
