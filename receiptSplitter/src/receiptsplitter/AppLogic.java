/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receiptsplitter;

import java.math.BigDecimal;
import java.text.ParseException;


/**
 *
 * @author Michal
 */
public class AppLogic {
    
    
    
    
    
     public Data setPeople(Message msg, Input in, Data data, User user) {

        msg.askForPeople();

        in.setUserInput(in.input.next());

        in.checkInput(msg, in, data, user);

        System.out.println(" checking - " + data.getPeople()); //debug
       
       
         

        return data;
    }

     
    public Data setReceipts(Message msg, Input in, Data data, User user) {

        // bring this method to input class like setPeople did
        msg.askForReceipts();
                
        try {

            in.setUserInput(in.input.next());
            BigDecimal bd1 = new BigDecimal(in.getUserInput());
            BigDecimal bd2 = bd1.setScale(2); // return big decimal with rounding to 2 zeros after decimal "0.00"

            System.out.println(bd2.toString()); //debug

        } catch (NumberFormatException e) {

            msg.invalidFormat();
            in.setNotNumber(true);

        } catch (ArithmeticException e) {

            System.out.println("Error. Your input can have maximum 2 places after decimal. For ex. 10.05 not 10.005");
            in.setNotNumber(true);
        }
        
              
        while (in.isNotNumber()) {

            in.setNotNumber(false);

            try {
                
           in.setUserInput(in.input.next());
           BigDecimal bd1 = new BigDecimal(in.getUserInput());
           BigDecimal bd2 =  bd1.setScale(2); // return big decimal with rounding to 2 zeros after decimal "0.00"
           
                                  
           System.out.println(bd2.toString()); //debug
       
            } catch (NumberFormatException e) {
                
                msg.invalidFormat();
                in.setNotNumber(true);
         

            }catch (ArithmeticException e) {

            System.out.println("Your input must be in format similar to this : 10.99");
            in.setNotNumber(true);
        }

        }

      

        return data;
    }
       
       
    public Data setNames(Message msg, Data data) {

        if (data.getPeople() <= 1) {

            System.out.println("You dont have to split the receipts as there is only 1 person ;)");
        } else {

            for (int x = 0; x < data.getPeople(); x++) {

                User clone = new User();

                clone.setName(" set the name here ");

                data.users.put(x, clone);

            }

        }

        return data;
    }
    
    
    
      public Message setReceipts(Message msg, Data data) {

        if (data.getPeople() <= 1) {

            System.out.println("You dont have to set Receipts as there is only 1 person ;)");
        } else {

            for (int x = 0; x < data.getPeople(); x++) {

                User clone = data.users.get(x);

                clone.receipts.add(new BigDecimal("10.00")); // add each receipt of each user here
                      
                data.users.put(x, clone);

            }

        }

        return msg;
    }
      
      
      
      
      
      
      
      
      
      
    
    
    
    
    
    
    
    
    
    
    
}
