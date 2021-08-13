package br.com.abc.javacore;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante Peter = new Estudante();
        Peter.nome = "Peter";
        Peter.idade = 41;
        Peter.matricula = "13579";
        Peter.cidade = "BH";
        Peter.Estado = "MG";
        Peter.País = "Brasil";

        System.out.println(Peter.nome);
        System.out.println(Peter.idade);
        System.out.println(Peter.matricula);
        System.out.println(Peter.cidade);
        System.out.println(Peter.Estado);
        System.out.println(Peter.País);


    }
}
