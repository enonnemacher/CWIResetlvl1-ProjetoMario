package application;

public class Yoshi extends Personagem {

    private int quantidadeFrutas;
    private int velocidade;

    public Yoshi(String nome, int idade, double altura) {
        super(nome, idade, altura);
        this.quantidadeFrutas = 0;
        this.velocidade = 10;
    }

    public int getVelocidade() {
        return velocidade;
    }

    // Verifica a quantidade de frutas que o yoshi come, a cada 2, a velocidade dobra de valor
    public void comerFruta(){
        this.quantidadeFrutas++;
        if (this.quantidadeFrutas % 2 == 0){
            this.velocidade *= 2;
        }
    }

    public void crescer() {
        this.altura *= 1.1;
    }
}
