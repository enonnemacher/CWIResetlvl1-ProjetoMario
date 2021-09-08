package application;

public abstract class Personagem {

    private String nome;
    protected double altura;
    private int idade;
    private int estamina;
    private int moedas = 0;
    private int vidas = 1;

    // Construtor padrão
    public Personagem(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.estamina = 100;
        this.moedas = 0;
        this.vidas = 1;
    }

    // Método para imprimir características
    public void imprimeCaracteristicas() {
        System.out.println("Me chamo " + this.nome
                + ", meço " + this.altura
                + " e tenho " + this.idade
                + " anos, minha estamina está em "
                + this.estamina + ", tenho "
                + this.moedas + " moedas e "
                + this.vidas + " vidas.");
    }

    // Método para imprimir poderes
    public void poderes() {
        System.out.println("Meus poderes são pular, correr, soltar casco de targatura");
    }

    // Método para perder estamina
    public void perderEstamina() {
        this.estamina = this.estamina - 10;
        if (this.estamina < 0) {
            this.estamina = 0;
        }
    }

    // Método para ganhar estamina
    public void ganharEstamina() {
        this.estamina = this.estamina + 5;
        if (this.estamina > 100) {
            this.estamina = 100;
        }
    }

    public abstract void crescer();

    public void revigorar() {
        this.estamina = 100;
    }

    // Metódo morrer do personagem, caso ainda tenha vidas, chama o metódo revigorar() que reinicia a estamina em 100
    public void morrer() {
        this.estamina = 0;
        this.vidas--;
        if (vidas < 0) {
            this.vidas = 0;
        } else {
            revigorar();
        }
    }

    // Método para adquirir moedas
    public void ganharMoedas() {
        this.moedas++;
        if (this.moedas % 10 == 0) {
            this.vidas += 1;
        }
    }

    // Método saltar
    public void saltar() {
        System.out.println("O " + this.nome + " pulou " + this.altura * 0.5);
    }

    // Sobrecarga do método saltar, onde o personagem salta uma altura 50% maior que o obstáculo
    public void saltar(double valor) {
        System.out.println("O personagem " + this.nome + " saltou " + valor * 1.5);
    }

}
