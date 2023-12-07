package Questao03.Teste;

import Questao03.dominio.Administrador;

public class ProgramaTesteAdministrador {
    public static void main(String[] args) {
        Administrador adm = new Administrador();

        adm.setNome("Anabella");
        adm.setEndereco("QNL 11 bloco G casa 9");
        adm.setTelefone("(61) 99522-8604");
        adm.setCodigoSetor(105);
        adm.setSalarioBase(6500.0);
        adm.setImposto(0.15); // SalarioEmpregadoUsual = 6500 - (6500 * 0.15)
        adm.setAjudaDeCusto(350.75);

        System.out.println("Dados sobre o "+adm.getClass().getSimpleName()+"\nNome: "+
                adm.getNome()+"\nEndereço: "+ adm.getEndereco()+"\nTelefone: "+adm.getTelefone()+
                "\nCódigo do setor: "+ adm.getCodigoSetor()+"\nSalário adm = SalárioEmpregadoUsual + ajudaDeCusto"+
                "\nSalário final = ( "+adm.getSalarioBase()+" - ("+adm.getSalarioBase()+ " * "+ adm.getImposto()+") ) + "+
                adm.getAjudaDeCusto()+" = "+adm.calcularSalario());

    }
}
