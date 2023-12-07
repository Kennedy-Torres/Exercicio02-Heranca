package Questao03.dominio;

public class Administrador extends Empregado{
    private double ajudaDeCusto;

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto; // empregado usual + ajudaDeCusto
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
}
