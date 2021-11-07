package receiptsplitter;

import java.math.BigDecimal;
import java.util.ArrayList;

/* I am working on an application Receipt Splitter which will allow user to choose currency from the list and split all expenses equally between everyone 
* or split them by fixed amount. The application is in progress and will be finished soon.
*
* @author Michal Switala
* Copyright © 2021 belongs solely to Michal Switala. 
* You can reach me out on : https://github.com/michaelPro89
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
