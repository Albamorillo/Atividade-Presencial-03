import java.util.ArrayList;

public class Turma {
    private final String nome;
    private final ArrayList<Aluno> alunos;
    private Professor professor;

    // Construtor
    public Turma(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    // Métodos
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarProfessor(Professor professor) {
        this.professor = professor;
    }

    public void visualizarTurma() {
        System.out.println("Turma: " + nome);
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Alunos:");
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome() + ", nota: " + aluno.getNota());
        }
    }
    }
