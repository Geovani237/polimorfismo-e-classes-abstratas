import br.github.impostos.EmpresaLucroReal;
import br.github.impostos.EmpresaSimples;
import br.github.impostos.GestorDeImpostos;
import br.github.impostos.PessoaFisica;

public class Main {
    public static void main(String[] args) {

        var gestorImpostos = new GestorDeImpostos();

        var joao = new PessoaFisica("Joao", 45_500);
        var maria = new PessoaFisica("Maria", 180_000);

        var barDoZe = new EmpresaSimples("Bar do Zé", 250_000, 160_000);
        var codeConsultoria = new EmpresaLucroReal("Code Consultoria", 8_000_000, 6_000_000);

        gestorImpostos.adicionar(joao);
        gestorImpostos.adicionar(maria);
        gestorImpostos.adicionar(barDoZe);
        gestorImpostos.adicionar(codeConsultoria);

        System.out.printf("Total de impostos: %.2f", gestorImpostos.getValorTotalImpostos());
    }
}