package Questao04.Teste;

import Questao04.Dominio.Empresa;
import Questao04.Dominio.Nike;
import Questao04.Dominio.Redbull;
import Questao04.Dominio.Renner;

public class ProgramaTesteEmpresa {
    public static void main(String[] args) {
        // inicializando o construtor já com os dados para exemplo
        // Uma varíavel de referência mais genérica está apontando para um objeto mais específico
        Empresa empresa1 = new Nike("calçados", "59.546.515/0001-34", "atendimento@lojanike.com", 450100.510, "Basquete","Air Jordan",44 );
        Empresa empresa2 = new Renner("Roupas/acessórios", "92.754.738/0001-62", "startups@lojasrenner.com.br", 125400.600, "Camisa Polo", "M");
        Empresa empresa3 = new Redbull("Esporte","02.946.761/0006-70","contato@redbullshop.com.br",145000000.0, "Fernanda Maciel", 15000.0, "ultramaratonista");

        System.out.println("+---------------------------------+\n" +
                           "|      1# Empresa - "+empresa1.getClass().getSimpleName()+ "          |");
        empresa1.imprimirDados();
        System.out.println("=======================================================================================");
        System.out.println("+---------------------------------+\n" +
                "|       2# Empresa - "+empresa2.getClass().getSimpleName()+"       |");
        empresa2.imprimirDados();
        System.out.println("=======================================================================================");
        System.out.println("+---------------------------------+\n" +
                "|      3# Empresa - "+empresa3.getClass().getSimpleName()+"       |");
        empresa3.imprimirDados();

    }
}
