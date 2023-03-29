import java.util.Date;

public class TestaEscola {
    public static void main(String[] args) {

        //OBJETO PROFESSOR1
        Professor prof = new Professor("Guilherme Sônego", "383.566.768-86", new Date());
        System.out.println("Veja como os Atributos foram preenchidos Professor 01\n\nNome: "+prof.nome);
        System.out.println("CPF: " + prof.CPF);
        System.out.println("Data de Nascimento: " + prof.dataNasc.toString());
        //OBJETO PROFESSOR 2
        Professor prof2 = new Professor("Karoline Souza e Silva", "999.999.999-99",  new Date(), "quimica",5900.25);
        System.out.printf("\n\nVeja Como os Atributos foram preenchidos Professor 02\nNome: %s\nCPF: %S\nData de Nascimento: %s\nDisciplina: %s\nSalário: %.2f\n", prof2.nome, prof2.CPF, prof2.dataNasc, prof2.disciplina, prof2.salario);

        //OBJETO ALUNO
        Aluno aluno1 = new Aluno("Guilherme Sônego", "383.566.768-86", new Date());
        System.out.println("Veja como os Atributos foram preenchidos para Aluno\n\nNome: "+prof.nome);
        System.out.println("CPF: " + aluno1.CPF);
        System.out.println("Data de Nascimento: " + aluno1.dataNasc.toString());


        //MÉTODO "TIRAR CÓPIAS 01"
        double copias = prof.tirarCopias(10); //double cópias é variável local, lembrar disso.
        System.out.printf("Quantidade de cópias Professor: %.2f",copias);


    }
}