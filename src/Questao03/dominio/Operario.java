package Questao03.dominio;

public class Operario extends Empregado{
    private double valorProducao; // valor monetário dos artigos de fato produzidos pelo operário
    private double comissao; // porcent do valorProducao  -> adicionado ao vencimento base do operário

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + getComissao(); // empregado usual + comissao
    }

//    public double getValorProducao() {
//        return valorProducao;
//    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao * valorProducao; // comissao tirada em cima do valorProducao
    }

    public void setComissao(double comissao) {
        this.comissao = comissao; // porcentagem que vai ser usada em cima do valorProducao
    }
}
