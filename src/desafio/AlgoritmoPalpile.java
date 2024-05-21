package desafio;

import java.util.Random;
import java.util.Scanner;

public class AlgoritmoPalpile {
    /**
     * <h1> Teamcubation - Sequencia Lógica - Intensivo Java</h1>
     * Exercício: Algoritmo Palpile
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   18/05/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativa = 0;
        int palpite = 0;

        System.out.println("Tente adivinhar o número entre 1 e 100");

        while (palpite != numeroSecreto){
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativa++;
            if (palpite < numeroSecreto){
                System.out.println("Muito baixo!");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto!");
            }else{
                System.out.println("Parabéns! Você adivinhou em " + tentativa + " tentativas");
            }
        }

    }
}
