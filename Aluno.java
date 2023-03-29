import java.util.Date;

public class Aluno extends Pessoa {

    public String matricula;

    public Aluno(String nome, String CPF, Date dataNasc) {
        super(nome, CPF, dataNasc);
        this.matricula = matricula;
    }

    public double tirarCopias(int qtd) {
        return 0.07 * (double) qtd;
    }
}

