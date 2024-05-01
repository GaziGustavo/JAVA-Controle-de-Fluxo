package desafio.controlefluxo; // Define o pacote

// Exceção personalizada para condições especiais
public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
