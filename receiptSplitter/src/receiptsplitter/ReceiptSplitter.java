/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receiptsplitter;

/**
 *
 * @author Michal
 */


public class ReceiptSplitter {

  
    
    
    
    
    
    
    
    
    
      public static void main(String[] args) {

        AppLogic log = new AppLogic();
        Message msg = new Message();
        Input in = new Input();
        Data data = new Data();
        User user = new User();

        data = log.setPeople(msg, in, data, user);
        data = log.setReceipts(msg, in, data, user);

    }

}
