package controller;
import view.AlunoView;
import model.Aluno;


public class AlunoController {

private Aluno aluno;
private AlunoView alunoView;


 public AlunoController(Aluno aluno, AlunoView alunoView) {
     this.aluno = aluno;
     this.alunoView = alunoView;

 }
 public void AtualizarNome(String nome){
     aluno.setNome(nome);
 }

 public void AtualizarCurso (String curso){
     aluno.setCurso(curso);
 }

 public void ExibirAluno(){
     alunoView.mostrarAluno(aluno);


 }

}
