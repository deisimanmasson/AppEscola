import java.util.Date;

public class Pessoa {

    //ATRIBUTOS
    public String nome;
    public String CPF;
    public Date dataNasc;

    //MÉTODO CONSTRUTOR
    public Pessoa (String nome, String CPF, Date dataNasc) {
    this.nome = nome;
    this.CPF = CPF;
    this.dataNasc = dataNasc;
    }

    // MÉTODOS
    public double tirarCopias (int qtd){
        return 0.10 * (double)qtd;
    }
}

