package Questao03.Teste;

import Questao03.dominio.Empregado;

public class ProgramaTesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado = new Empregado();

        empregado.setNome("Sérgio");
        empregado.setEndereco("Qi 16 lote 24");
        empregado.setTelefone("(61) 99254-5288");
        empregado.setCodigoSetor(345);
        empregado.setSalarioBase(4500.0);
        empregado.setImposto(0.15);

        System.out.println("Dados sobre o "+empregado.getClass().getSimpleName()+"\nNome: "+
                empregado.getNome()+"\nEndereço: "+ empregado.getEndereco()+"\nTelefone: "+ empregado.getTelefone()+
                "\nCódigo do setor: "+ empregado.getCodigoSetor()+"\nSalário empregado = salarioBase - (salarioBase*imposto)"+
                " => Salário final = "+ empregado.getSalarioBase()+" - ( "+ empregado.getSalarioBase()+" * "+
                empregado.getImposto()+") = "+ empregado.calcularSalario());


    }
}
