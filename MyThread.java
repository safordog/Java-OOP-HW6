/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework6a;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author safordog
 */
public class MyThread implements Runnable {
    
    public MyThread() {
        
    }

    @Override
    public void run() {
        int count = new File("folder/").listFiles().length;
        for (;;) {
            int check = new File("folder/").listFiles().length;
            if (count < check) {
                System.out.println("Created new file! " + check);
                break;
            } else if (count > check) {
                System.out.println("Deleted file! " + check);
                break;
            } else {
                System.out.println("...");
            }
             try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Thread t = new Thread(new MyThread());
        t.start();
    }
    
}
