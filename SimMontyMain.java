public class SimMontyMain {
    //you can embed the main method any where you want!
    public static void main(String[] args){
        SimMontyMain m = new SimMontyMain();
        m.runSimulation(100000); 
    }

    private int myWinTotal;


    //implement this method
    public void runSimulation (int numGames) {
        SimMonty m = new SimMonty();
        int countRuns = 0;
        myWinTotal = 0;
        int strategy = 0; // 1 stay, 2 switch, 3 random
     //you write this...
        for(int i = 0; i <= 2; i++)
            while(countRuns < numGames){
                strategy = i;
                myWinTotal += m.playGame(strategy);
                countRuns++;
            
            
            }
         //stop here...
            System.out.println((myWinTotal * 1.0)/numGames);
            myWinTotal = 0;
            countRuns = 0;

    }
    
    
}      
