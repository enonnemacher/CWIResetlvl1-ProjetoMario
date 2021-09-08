package application;

public class Mario extends Personagem {

    private Yoshi yoshi; //Adiciona um atributo do tipo Yoshi

    public Mario(String nome, int idade, double altura) {
        super(nome, idade, altura);
    }

    public void montarNoYoshi(Yoshi yoshi){
        this.yoshi = yoshi;
    }

    // Verifica se o mario está ou não montado no yoshi
    public void montado(){
        if(this.yoshi != null){
            System.out.println("Mario está montado no yoshi");
        } else {
            System.out.println("Mario não está montado no yoshi");
        }
    }

    @Override
    public void crescer(){
        this.altura *= 1.5;
    }

}
