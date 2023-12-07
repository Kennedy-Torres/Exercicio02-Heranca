package Questao04.Dominio;

public class Redbull extends Empresa{
    private String atletas;
    private double salario;
    private String categoria;

    public Redbull(){}

    public Redbull(String setor, String cnpj, String email, double receitaAnual, String atletas, double salario, String categoria) {
        super(setor, cnpj, email, receitaAnual);
        this.atletas = atletas;
        this.salario = salario;
        this.categoria = categoria;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("""
                +--------------------------------------+
                | Informações específicas da Empresa   |
                +--------------------------------------+""");
        System.out.println("Atleta: "+atletas+"\nSalário: "+salario+"\nCategoria: "+categoria);
    }
}
