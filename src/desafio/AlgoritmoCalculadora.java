package desafio;

import java.util.Scanner;

public class AlgoritmoCalculadora {
    /**
     * <h1> Teamcubation - Sequencia Lógica - Intensivo Java</h1>
     * Exercício: Algoritmo Calculadora
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   18/05/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();


        System.out.print("Escolha a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        double resultado=0;
        switch (operacao){
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 == 0){
                    System.out.println("Divisão por zero não é permitida.");
                    return;
                }else{
                    resultado = num1 / num2;
                }
                break;
            default:
                System.out.println("Operação inválida");
                break;

        }

        System.out.println("Resultado: " + resultado);


    }
}
