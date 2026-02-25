package br.github.impostos;

public class PessoaFisica extends Pessoa{

    public final double RECEITA_ANUAL_ISENCAO = 50000;
    public final double ALIQUOTA_IMPOSTO_RENDA = 0.20;
    private final double receitaAnul;

    public PessoaFisica(String nome, double receitaAnul) {
        super(nome);
        this.receitaAnul = receitaAnul;
    }

    public double getReceitaAnul() {
        return receitaAnul;
    }

    @Override
    public double calcularImpostos() {
        return ((getReceitaAnul() > RECEITA_ANUAL_ISENCAO) ?
                getReceitaAnul() * ALIQUOTA_IMPOSTO_RENDA : 0);
    }
}
