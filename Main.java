import controller.AlunoController;
import model.Aluno;
import view.AlunoView;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Aluno aluno = new Aluno(01,"Giovanni", "Administração");

        AlunoView alunoView = new AlunoView();

        AlunoController alunoController = new AlunoController(aluno, alunoView);


        alunoController.ExibirAluno();
        


    }
}