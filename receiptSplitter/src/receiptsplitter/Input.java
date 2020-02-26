/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receiptsplitter;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Michal
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
