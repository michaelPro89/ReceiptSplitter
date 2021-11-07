package receiptsplitter;
/* I am working on an application Receipt Splitter which will allow user to choose currency from the list and split all expenses equally between everyone 
* or split them by fixed amount. The application is in progress and will be finished soon.
*
* @author Michal Switala
* Copyright © 2021 belongs solely to Michal Switala. 
* You can reach me out on : https://github.com/michaelPro89
*/
public class Message {
    
    
     public void askForPeople() {

        System.out.println("Between how many people you want to split the receipts ? 2 people is the maximum at the moment.");

    }

    public void askForReceipts() {

        System.out.println("Now, enter of all your expenses one by one.");

    }

    public void incorrectInput() {

        System.out.println("Error. You must enter a number between 1 and 2.");
    }

      public void invalidFormat() {

        System.out.println("Error. Only number from 00.00 to 999.99 and this sign ' . ' is allowed inside input.");
    }
    
    
    
    
    
}
