package application;

import java.util.Random;

public class Jogo {

    private Personagem jogador1;
    private Personagem jogador2;

    public void jogadores(Personagem jogador1, Personagem jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    public void jogar() {
        Random numero = new Random();
        int numeroJogadas1 = numero.nextInt(30); // numeroJogadas recebe um número aleatório até 30
        int numeroJogadas2 = numero.nextInt(30); // numeroJogadas recebe um número aleatório até 30

        for (int i = 0; i <= numeroJogadas1; i++) {
            jogador1.ganharMoedas();
        }
        for (int i = 0; i <= numeroJogadas2; i++) {
            jogador2.ganharMoedas();
        }

        System.out.println("Resultado do jogador 1");
        jogador1.imprimeCaracteristicas();
        System.out.println("Resultado do jogador 2");
        jogador2.imprimeCaracteristicas();
    }
}
