package application;

/* Aplicação do módulo de orientação a objetos da CWI Reset level 1
* Autor: Ederson Rafael Nonnemacher */

public class Program {

    public static void main(String[] args) {

        /// Criando o personagem Mario
        Mario mario = new Mario("Mario", 40, 1.60);

        // Criando o personagem Luigi
        Luigi luigi = new Luigi("Luigi", 37, 1.80);

        // Criando o personagem Yoshi
        Yoshi yoshi = new Yoshi("Yoshi", 94, 0.85);

        // Teste para verificar altura do Mario após o crescimento
        mario.imprimeCaracteristicas();
        mario.crescer();
        mario.imprimeCaracteristicas();

        // Teste para verificar altura do luigi após o crescimento
        luigi.imprimeCaracteristicas();
        luigi.crescer();
        luigi.imprimeCaracteristicas();

        // Teste para verificar altura do yoshi após o crescimento
        yoshi.imprimeCaracteristicas();
        yoshi.crescer();
        yoshi.imprimeCaracteristicas();

        // Teste para verificar altura do salto padrão
        luigi.saltar();
        mario.saltar();
        yoshi.saltar();

        // Teste para verificar altura do salto sobre obstaculos
        luigi.saltar(2);
        mario.saltar(3);
        yoshi.saltar(10);

    }
}
