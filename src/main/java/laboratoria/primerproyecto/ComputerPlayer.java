package laboratoria.primerproyecto;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ComputerPlayer extends Player{
    private java.util.Random random;
    private int max;
    private int min;

    //Player humanPlayer = new HumanPlayer();

    public ComputerPlayer() {//constructor de computerplayer
        super();
        max = 100;
        min = 0;
    }

    @Override
    public int makeGuess() {
        int inputComputer = 0;
        if(lowOrHigh.isEmpty()){
            random = new java.util.Random();
            inputComputer = random.nextInt(100);
            System.out.println(inputComputer);

        }else if(!lowOrHigh.isEmpty() && lowOrHigh.get(lowOrHigh.size()-1) == "low"){
            if(guesses.get(guesses.size()-1) > min){
                min = guesses.get(guesses.size()-1);
            }
            inputComputer = random.nextInt(max - min + 1) + min + 1;
            System.out.println(inputComputer);
        }else if(!lowOrHigh.isEmpty() && lowOrHigh.get(lowOrHigh.size()-1) == "high"){
            if(guesses.get(guesses.size()-1) < max){
                max = guesses.get(guesses.size()-1);
            }
            inputComputer = random.nextInt(max - min + 1) + min -1;
            System.out.println(inputComputer);
        }

        return  inputComputer;
    }

    @Override
    public String getName() {
        String name = "computadora";
        return name;
        //return super.getName();
    }

    @Override
    public List<Integer> getGuesses() {
        return guesses;
    }

    @Override
    public List<String> getLowOrHigh(){
        return lowOrHigh;
    }
}
