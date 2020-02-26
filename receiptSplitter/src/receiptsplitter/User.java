/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receiptsplitter;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author Michal
 */
public class User {
    
    private String name;
    ArrayList <BigDecimal> receipts = new ArrayList(); 
    private double receiptSum;
    
    
    
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getReceiptSum() {
        return receiptSum;
    }

    public void setReceiptSum(double receiptSum) {
        this.receiptSum = receiptSum;
    }
    
    
    
    
    
    
    
    
    
    
    
}
