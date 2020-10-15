package utils;

import Entidades.*;
import com.sun.tools.jconsole.JConsoleContext;

import java.util.*;


public class CriarPersonagens {

    private Personagens personagens;


    public static Queue<Personagens> embaralhar() {

        Queue<Personagens> alvo = new LinkedList<>();

        Porco porcoBigode = new Porco("Porco bigode", Constantes.PORCO_BIGODE);
        alvo.add(porcoBigode);

        Pau pau = new Pau("pau", 0);
        alvo.add(pau);

        Pedra pedra = new Pedra();
        alvo.add(pedra);


        //Collections.shuffle(alvo);

        return alvo;

    }

    public static Queue<Personagens> embaralhaBird() {
        Queue<Personagens> bird = new LinkedList<>();

        Passarinho birdAmarelo = new Passarinho("Passaro Amarelo", Constantes.PASSARINHO_AMARELO);
        bird.add(birdAmarelo);

        Passarinho birdVermelho = new Passarinho("Passaro Vermelho", Constantes.PASSARINHO_VERMELHO);
        bird.add(birdVermelho);

        Passarinho birdBranco = new Passarinho("Passaro Branco", Constantes.PASSARINHO_BRANCO);
        bird.add(birdBranco);

        bird.add(birdAmarelo);

        bird.add(birdVermelho);

        bird.add(birdBranco);

        //Collections.shuffle(bird);

        return bird;
    }

}
