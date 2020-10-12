package utils;

import Entidades.Pau;
import Entidades.Pedra;
import Entidades.Personagens;
import Entidades.Porco;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class CriarPersonagens {

    private Personagens personagens;


    public static List<Personagens> embaralhar() {

        List<Personagens>alvo = new ArrayList<>();

        Porco porcoComum = new Porco("Porco comun", 60);
        alvo.add(porcoComum);

        Porco porcoBigode = new Porco("Porco bigode", 40);
        alvo.add(porcoBigode);

        Pau pau = new Pau("pau", 0);
        alvo.add(pau);

        Pedra pedra = new Pedra();
        alvo.add(pedra);

        Collections.shuffle(alvo);

        return alvo;

    }


}
