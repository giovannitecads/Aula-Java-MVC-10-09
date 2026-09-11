package view;

import model.Aluno;

public class AlunoView {

    public void mostrarAluno(Aluno aluno){
        System.out.println("==== DADOS DO ALUNO ====");
        System.out.println("ID: " + aluno.getId());
        System.out.println("NOME: " + aluno.getNome());
        System.out.println("CURSO: " + aluno.getCurso());

    }
}
