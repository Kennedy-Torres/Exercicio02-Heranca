package Questao04.Dominio;

public class Renner extends Empresa{
    private String modelo;
    private String tamanho;

    public Renner() {}

    public Renner(String setor, String cnpj, String email, double receitaAnual, String modelo, String tamanho) {
        super(setor, cnpj, email, receitaAnual);
        this.modelo = modelo;
        this.tamanho = tamanho;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("""
                +--------------------------------------+
                | Informações específicas da Empresa   |
                +--------------------------------------+""");
        System.out.println("Modelo: "+modelo+"\nTamanho: "+tamanho);
    }

}
