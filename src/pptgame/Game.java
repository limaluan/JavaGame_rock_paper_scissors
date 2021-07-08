package pptgame;
import java.util.Random;

public class Game {
    //Gera um número para a máquina
    public static int gerarNum(){
        Random gerador = new Random();
        int num = gerador.nextInt(3);
        return num;
    }

    //Inicia uma Partida com a escolha
    public static int start(int esc, int num){
        //Condição de Vitória
        if (esc == 0 && num == 2 || esc == 2 && num == 1 || esc == 1 && num == 0){
            System.out.println("DEBUG:");
            System.out.println("Jogador Escolheu: " + esc);
            System.out.println("Máquina Escolheu: " + num);
            System.out.println("Jogador venceu!");
            return 1;
        }
        //Condição de Empate
        else if (esc == num){
            System.out.println("DEBUG: EMPATE");
            System.out.println("Jogador Escolheu: " + esc);
            System.out.println("Máquina Escolheu: " + num);
            return 2;
        }
        //Condição de Derrota
        else{
            System.out.println("DEBUG:");
            System.out.println("Jogador Escolheu: " + esc);
            System.out.println("Máquina Escolheu: " + num);
            System.out.println("Jogador Perdeu!");
            return 3;
        }
    }
}

