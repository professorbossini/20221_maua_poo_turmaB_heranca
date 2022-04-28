public class TesteStatic {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Maria";

        p.falar();

        Pessoa.falar();



        double raizDeDois = Math.sqrt(2);
    }
}
