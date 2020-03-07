package ex3;

public class Notas_Alunos {

    public static void main(String[] args) {
        Aluno aprovacao = new Aluno("Adriano",8.5);

        String nomeDoAluno = aprovacao.nome;
        System.out.println("Nome: "+nomeDoAluno);

        double notaDoAluno = aprovacao.nota;
        System.out.println("Note: " + notaDoAluno);

        boolean maiorOuIgual = aprovacao.maiorOuIgual();
        System.out.println("Approved: " + maiorOuIgual);

        
    }
}
