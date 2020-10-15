package Aplicação;

import Entidades.Personagens;
import Interfaces.CarregarPersonagens;
import utils.CriarPersonagens;

import java.util.LinkedList;
import java.util.Queue;

public class Main implements CarregarPersonagens {


    public static void main(String[] args) {
        System.out.println("Hello, final project!");

        boolean lifeGame = false;
        int contador = 0;
        int scoreForca = 0;
        Queue<Personagens> filaAlvo = new LinkedList<>();
        filaAlvo.addAll(recuperarDadosAlvo());

        Queue<Personagens> filaBird = new LinkedList<>();
        filaBird.addAll(recuperarDadosBird());


        do {

            scoreForca = filaAlvo.peek().getScore() - filaBird.peek().getScore();
            filaBird.remove();

            if (scoreForca <= 0) {

                filaAlvo.remove();
                if (filaAlvo.size() == 0 && filaBird.size() > 0) {
                    lifeGame = true;
                    System.out.println("passaro ganhou");
                } else if (filaBird.size() == 0 && filaAlvo.size() > 0) {
                    lifeGame = true;
                    System.out.println("passaro perdeu");
                }
            } else {
                filaAlvo.peek().setScore(scoreForca);
            }




        } while (lifeGame != true);


    }


    private static Queue<Personagens> recuperarDadosBird() {
        return CriarPersonagens.embaralhaBird();
    }


    private static Queue<Personagens> recuperarDadosAlvo() {
        return (CriarPersonagens.embaralhar());
    }


    @Override
    public void CarregarPersonagens(String menssage) {
        System.out.println(menssage);
    }
}
