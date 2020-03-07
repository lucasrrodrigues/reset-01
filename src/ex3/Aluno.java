package ex3;

public class Aluno {

    String nome;
    double nota;

    boolean maiorOuIgual(){
        return nota >= 7.0;

    }

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }
}
