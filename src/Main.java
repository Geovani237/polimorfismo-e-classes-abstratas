import br.github.impostos.GestorDeImpostos;
import br.github.impostos.PessoaFisica;

public class Main {
    public static void main(String[] args) {

        var gestorImpostos = new GestorDeImpostos();

        var joao = new PessoaFisica("Joao", 45_000);
        var maria = new PessoaFisica("Maria", 180_000);

        gestorImpostos.adicionar(joao);
        gestorImpostos.adicionar(maria);

        System.out.printf("Total de impostos: %.2f", gestorImpostos.getValorTotalImpostos());
    }
}