package receiptsplitter;

import java.util.HashMap;
/* I am working on an application Receipt Splitter which will allow user to choose currency from the list and split all expenses equally between everyone 
* or split them by fixed amount. The application is in progress and will be finished soon.
*
* @author Michal Switala
* Copyright © 2021 belongs solely to Michal Switala. 
* You can reach me out on : https://github.com/michaelPro89
*/

public class Data {
    
    
    
    private int people;
    HashMap <Integer, User> users = new HashMap();
  
    
    
    
    
    
    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }
    
    
        
    
    
}
