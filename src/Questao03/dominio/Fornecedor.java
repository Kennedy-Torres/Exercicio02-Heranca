package Questao03.dominio;

public class Fornecedor extends Pessoa{
    private double valorCredito; // crédito máx. atribuido ao fornecedor
    private double valorDivida; // montante da divida para com o fornecedor

    public double obterSaldo(){
        return valorCredito - valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
}
