package laboratoria.primerproyecto;

import java.util.List;
import java.util.Scanner;

public class HumanPlayer extends Player{

    public HumanPlayer() {//constructor de humanplayer
        super();//llama al constructor padre(player)// Player();
    }

    @Override//indica a la clases que es un metodo sobreescrito del padre
    public int makeGuess() {
        Scanner input = new Scanner(System.in);  //Crea un objeto para el input(escanea)
        return input.nextInt();
    }

    @Override
    public String getName() {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
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