package Aplicação;

import Entidades.Pau;
import Entidades.Pedra;
import Entidades.Personagens;
import Entidades.Porco;
import Interfaces.CarregarPersonagens;
import utils.CriarPersonagens;

import java.util.ArrayList;
import java.util.List;

public class Main implements CarregarPersonagens {


    public static void main(String[] args) {
        System.out.println("Hello, final project!");

        List<Personagens> alvo = new ArrayList<>();
        alvo.addAll(recuperarDadosAlvo());


    }

    private static List<Personagens> recuperarDadosAlvo() {

        return (CriarPersonagens.embaralhar());

    }


    @Override
    public void CarregarPersonagens(String menssage) {
        System.out.println(menssage);
    }
}
