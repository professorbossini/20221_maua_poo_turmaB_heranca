public class TesteHeranca1 {
    public static void main(String[] args) {
        //variável de referência
        AlunoDeGraduacao aluno;
        aluno = new AlunoDeGraduacao();
        aluno.nome = "Ana";
        aluno.idade = 22;
        System.out.printf("Me chamo %s e tenho %d anos\n", aluno.nome, aluno.idade);

        aluno.falar();
    }
}
