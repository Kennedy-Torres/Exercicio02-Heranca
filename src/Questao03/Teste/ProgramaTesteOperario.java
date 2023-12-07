package Questao03.Teste;

import Questao03.dominio.Operario;

public class ProgramaTesteOperario {
    public static void main(String[] args) {
        Operario op = new Operario();

        op.setNome("Sebastião");
        op.setEndereco("QNG 23 bloco D casa 5");
        op.setTelefone("(61) 95662-3488");
        op.setCodigoSetor(345);
        op.setSalarioBase(4500.0);
        op.setImposto(0.15);
        op.setValorProducao(70.0); // comissão = 70 * 0,3 = 21 -> calculo feito no getComissao
        op.setComissao(0.3);

        System.out.println("Dados sobre o "+op.getClass().getSimpleName()+"\nNome: "+
                op.getNome()+"\nEndereço: "+ op.getEndereco()+"\nTelefone: "+ op.getTelefone()+
                "\nCódigo do setor: "+ op.getCodigoSetor()+"\nSalário operário = SalárioEmpregadoUsual + comissão"+
                "\nSalário final = "+ op.getSalarioBase()+" - ( "+ op.getSalarioBase()+" * "+
                op.getImposto()+") + "+ op.getComissao()+" = "+ op.calcularSalario());
    }
}
