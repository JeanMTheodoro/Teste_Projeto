package Entidades;

public abstract class Personagens {


    private String name;
    private int score;

    public Personagens(String nome, int score) {
        this.name = nome;
        this.score = score;
    }


    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
