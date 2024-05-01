package desafio.controlefluxo; // Define o pacote

// Classe para contagem e validação
public class Contador {
    /**
     * Método para contar e imprimir a sequência de números.
     *
     * @param parametroUm   Primeiro número para contagem.
     * @param parametroDois Segundo número para contagem.
     * @throws ParametrosInvalidosException se o segundo parâmetro for menor que o primeiro.
     */

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) { // Verifica se o primeiro parâmetro é maior que o segundo
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm; // Calcula a quantidade de iterações
        for (int i = 1; i <= contagem; i++) { // Imprime a contagem
            System.out.println("Imprimindo o número " + i);
        }
    }
}
