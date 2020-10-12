package utils;

import Entidades.*;
import com.sun.tools.jconsole.JConsoleContext;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class CriarPersonagens {

    private Personagens personagens;


    public static List<Personagens> embaralhar() {

        List<Personagens>alvo = new ArrayList<>();

        Porco porcoComum = new Porco("Porco comun", Constantes.PORCO_COMUN);
        alvo.add(porcoComum);

        Porco porcoBigode = new Porco("Porco bigode", Constantes.PORCO_BIGODE);
        alvo.add(porcoBigode);

        Pau pau = new Pau("pau", 0);
        alvo.add(pau);

        Pedra pedra = new Pedra();
        alvo.add(pedra);

        Collections.shuffle(alvo);

        return alvo;

    }

    public static List<Personagens> embaralhaBird() {
        List<Personagens> bird = new ArrayList<>();

        Passarinho birdAmarelo = new Passarinho("Passaro Amarelo", Constantes.PASSARINHO_AMARELO);
        bird.add(birdAmarelo);

        Passarinho birdVermelho = new Passarinho("Passaro Vermelho", Constantes.PASSARINHO_VERMELHO);
        bird.add(birdVermelho);

        Passarinho birdBranco = new Passarinho("Passaro Branco", Constantes.PASSARINHO_BRANCO);
        bird.add(birdBranco);

        Collections.shuffle(bird);

        return bird;
    }

}
