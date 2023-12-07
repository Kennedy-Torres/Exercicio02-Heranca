package Questao03.Teste;

import Questao03.dominio.Vendedor;

public class ProgramaTesteVendedor {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();

        vendedor.setNome("Valmir");
        vendedor.setEndereco("QND 5 quadra 11 ");
        vendedor.setTelefone("(61) 96644-2238");
        vendedor.setCodigoSetor(715);
        vendedor.setSalarioBase(3500.0);
        vendedor.setImposto(0.15);
        vendedor.setValorVendas(75); // comissao tirada em cima do valorVendas = 75 * 0.3 = 22.5 -> feito direto no getComissao
        vendedor.setComissao(0.3);

        System.out.println("Dados sobre o "+vendedor.getClass().getSimpleName()+"\nNome: "+
                vendedor.getNome()+"\nEndereço: "+ vendedor.getEndereco()+"\nTelefone: "+ vendedor.getTelefone()+
                "\nCódigo do setor: "+ vendedor.getCodigoSetor()+"\nSalário vendedor = SalárioEmpregadoUsual + comissão"+
                "\nSalário final = ("+ vendedor.getSalarioBase()+" - ( "+ vendedor.getSalarioBase()+" * "+
                vendedor.getImposto()+") ) + "+vendedor.getComissao()+ " = "+ vendedor.calcularSalario());
    }
}
