package receiptsplitter;
/* I am working on an application Receipt Splitter which will allow user to choose currency from the list and split all expenses equally between everyone 
* or split them by fixed amount. The application is in progress and will be finished soon.
*
* @author Michal Switala
* Copyright © 2021 belongs solely to Michal Switala. 
* You can reach me out on : https://github.com/michaelPro89
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
