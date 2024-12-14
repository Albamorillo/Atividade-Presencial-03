public class Professor extends Pessoa {

    private double salario;

    // Construtor
    public Professor(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    // Getter e Setter para o salário
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
