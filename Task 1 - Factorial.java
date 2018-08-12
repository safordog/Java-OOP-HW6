/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework6;

import java.math.BigInteger;

/**
 *
 * @author safordog
 */
public class Factorial {
    
    public Factorial() {
        
    }
    
    public BigInteger getFactorial(int num) {
        BigInteger bNum = BigInteger.ONE;
        for (int i = 1; i <= num; ++i) { 
            bNum = bNum.multiply(BigInteger.valueOf(i));
        }
        return bNum;
        }
    
}
