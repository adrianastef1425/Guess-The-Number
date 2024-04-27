package laboratoria.primerproyecto;


import java.util.List;
import java.util.Scanner;

abstract class Player {
    private String name;
    protected List<Integer> guesses;

    public abstract int makeGuess();

    public String getName(){
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        return name;
    }

    public List<Integer> getGuesses(){
        return guesses;
    }
}