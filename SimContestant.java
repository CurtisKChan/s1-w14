import java.util.*;

public class SimContestant {
    
    private int myInitialGuess;
    private Random myRandoms;
    
    public SimContestant (Random randoms) {
        myRandoms = randoms;
    }
    
    // The contestant makes his/her first guess.
    public int guess1 ( ) {
        myInitialGuess = (int)(Math.random()*3)+1;//do this ...;
        return myInitialGuess;
    }
    
    //The contestant sticks, switches, or randomly 
    //sticks or switches. You find the percentages
    public int guess2 (int openedDoor, int strategy) {
        if(strategy == 0){
            return myInitialGuess;
        }
        else if(strategy == 1){
            return 6 - myInitialGuess - openedDoor;
            }
        else{
            int rand =(int)(Math.random()*3)+1;
            if(rand == openedDoor)
                rand = (int)(Math.random()*3)+1;
            return rand;
        }
    }
}
