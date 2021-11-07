package receiptsplitter;

import java.util.InputMismatchException;
import java.util.Scanner;
/* I am working on an application Receipt Splitter which will allow user to choose currency from the list and split all expenses equally between everyone 
* or split them by fixed amount. The application is in progress and will be finished soon.
*
* @author Michal Switala
* Copyright © 2021 belongs solely to Michal Switala. 
* You can reach me out on : https://github.com/michaelPro89
*/
public class Input {
    
    
    Scanner input = new Scanner(System.in);
    
    private String userInput;
    private boolean notNumber;

    
    
       public boolean isNotNumber() {
        return notNumber;
    }

    public void setNotNumber(boolean isNumber) {
        this.notNumber = isNumber;
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }
    
    
    public void checkInput(Message msg, Input in, Data data, User user) {

        try {

            data.setPeople(Integer.parseInt(getUserInput()));

            System.out.println(data.getPeople()); //debug

        } catch (NumberFormatException e) {

            msg.incorrectInput();
            setNotNumber(true);

        }

        while (isNotNumber()) {

           setNotNumber(false);
            //in.checkInput create method in input class so we invoke method
            try {

                setUserInput(input.next());
                data.setPeople(Integer.parseInt(getUserInput()));

            } catch (NumberFormatException e) {

                msg.incorrectInput();
                setNotNumber(true);

            }

        }

     
    }

    
    
    
    
    
    
    
    
    
    
    
    
}
