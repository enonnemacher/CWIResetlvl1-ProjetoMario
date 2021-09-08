package application;

public class Luigi extends Personagem {

    public Luigi(String nome, int idade, double altura) {
        super(nome, idade, altura);
    }

    public void voar(){
        System.out.println("Luigi está voando");
    }

    @Override
    public void crescer(){
        this.altura *= 1.75;
    }
}
