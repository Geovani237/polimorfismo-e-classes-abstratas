package br.github.impostos;

public class GestorDeImpostos {
    private double valorTotalImpostos;

    public void adicionar(Pessoa pessoa) {
        double impostos = pessoa.calcularImpostos();
        valorTotalImpostos += impostos;
        System.out.println("Impostos devidos de " + pessoa.getNome()  + " " + pessoa.calcularImpostos());
    }

    public double getValorTotalImpostos() {
        return valorTotalImpostos;
    }
}
