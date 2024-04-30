package laboratoria.primerproyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Player {
    private String name;

    protected List<Integer> guesses;

    protected List<String> lowOrHigh;

    public Player() {//constructor de player
        guesses = new ArrayList<>();
        lowOrHigh = new ArrayList<>();
        name = null;//no es necesario
    }
    public abstract int makeGuess();

    public abstract String getName();

    public abstract List<Integer> getGuesses();

    public abstract List<String> getLowOrHigh();
}