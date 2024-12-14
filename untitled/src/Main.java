//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criando objetos
        Professor professor = new Professor("João", 40, 5000);
        Aluno aluno1 = new Aluno("Maria", 18, 9.5);
        Aluno aluno2 = new Aluno("Pedro", 17, 8.0);
        Aluno aluno3 = new Aluno("Ana", 19, 7.5);

        // Criando a turma
        Turma turma = new Turma("Programação");
        turma.adicionarProfessor(professor);
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.adicionarAluno(aluno3);

        // Visualizando a turma
        turma.visualizarTurma();
    }
}