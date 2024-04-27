package laboratoria.primerproyecto;

import java.util.Scanner;

public class HumanPlayer extends Player{
    public int makeGuess() {
        Scanner input = new Scanner(System.in);  //Crea un objeto para el input(escanea)
        return input.nextInt();
    }
}