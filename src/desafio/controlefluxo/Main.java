package desafio.controlefluxo; // Define o pacote

import java.util.Scanner; // Importação necessária para receber a entrada do usuário

// Classe principal para iniciar o programa
public class Main {
    /**
     * Método principal para receber parâmetros e iniciar a contagem.
     */
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in); // Scanner para entrada de dados

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt(); // Recebe o primeiro parâmetro

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt(); // Recebe o segundo parâmetro

        try {
            Contador.contar(parametroUm, parametroDois); // Chama método para contar
        } catch (ParametrosInvalidosException e) { // Captura exceção se lançada
            System.out.println(e.getMessage()); // Imprime mensagem da exceção
        } finally {
            terminal.close(); // Fecha o recurso Scanner
        }
    }
}
