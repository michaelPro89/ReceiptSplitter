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
