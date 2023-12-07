package Questao04.Dominio;

public class Nike extends Empresa {
    private String linhaProducao;
    private String modelo;
    private int tamanho;

    public Nike() {}

    public Nike(String setor, String cnpj, String email, double receitaAnual, String linhaProducao, String modelo, int tamanho) {
        super(setor, cnpj, email, receitaAnual);
        this.linhaProducao = linhaProducao;
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
        System.out.println("Linha de Producao: "+linhaProducao +"\nModelo: "+modelo+
                "\nTamanho: "+tamanho);
    }

}
