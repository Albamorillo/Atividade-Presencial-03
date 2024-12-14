public class Aluno extends Pessoa {
    private double nota;

    // Construtor
    public Aluno(String nome, int idade, double nota) {
        super(nome, idade);
        this.nota = nota;
    }

    // Getter e Setter para a nota
    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
