package Questao03.Teste;

import Questao03.dominio.Fornecedor;

public class ItemDTesteFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor();

        fornecedor.setNome("Mário");
        fornecedor.setEndereco("QNJ 24 Bloco 4 Casa 5");
        fornecedor.setTelefone("(61) 99874-5728");
        fornecedor.setValorCredito(300.45);
        fornecedor.setValorDivida(25.45);
        fornecedor.obterSaldo();

        System.out.println("Dados sobre o "+fornecedor.getClass().getSimpleName()+
                "\nNome: "+fornecedor.getNome()+
                "\nEndereço: "+fornecedor.getEndereco()+"\nTelefone: "+
                fornecedor.getTelefone()+"\nSaldo= Crédito - Divida => Saldo= ("+
                fornecedor.getValorCredito()+") - ("+ fornecedor.getValorDivida()+
                ") = "+ fornecedor.obterSaldo());
    }
}
