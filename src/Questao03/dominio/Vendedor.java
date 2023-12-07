package Questao03.dominio;

public class Vendedor extends Empregado{
    private double valorVendas; // valor monetário dos artigos vendidos
    private double comissao; // porcent do valor vendas -> adicionado ao vencimento base do vendedor


    @Override
    public double calcularSalario() {
        return super.calcularSalario() + getComissao(); // empregado usual + comissao
    }

//    public double getValorVendas() {
//        return valorVendas;
//    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao * valorVendas; // comissao tirada em cima do valorVendas
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
