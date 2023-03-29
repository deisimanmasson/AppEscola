import java.util.Date;

public class Professor extends Pessoa {

    public String disciplina;
    public double salario;

    public Professor (String nome, String CPF, Date dataNasc) {
        super(nome, CPF, dataNasc);
    }
    public Professor (String nome, String CPF, Date dataNasc, String disciplina, double salario) {
        super(nome, CPF, dataNasc);
        this.disciplina = disciplina;
        this.salario = salario;
    }
}
