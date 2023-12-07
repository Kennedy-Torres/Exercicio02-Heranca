package Questao04.Dominio;

public class Empresa {
    private String setor;
    private String cnpj;
    private String email;
    private double receitaAnual;

    public Empresa(){}

    public Empresa(String setor, String cnpj, String email, double receitaAnual) {
        this();
        this.setor = setor;
        this.cnpj = cnpj;
        this.email = email;
        this.receitaAnual = receitaAnual;
    }

    public void imprimirDados(){
        System.out.println("""
                +---------------------------------+
                | Informações gerais da Empresa   |
                +---------------------------------+""");
        System.out.println(getClass().getSimpleName()+" {Setor: "+setor +" ,CNPJ: "+ cnpj+" ,EMAIL: "+email+" ,ReceitaAnual: "+ receitaAnual+" }");
    }

}
