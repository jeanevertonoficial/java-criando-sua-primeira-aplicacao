//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world and welcome!");
//        Soma.soma();

        double media = (8.5 + 6.6 + 7.5) / 3;
        int anoLancamento = 2022;
        String sinopse;

        int classificacao = (int) (media/2);

        sinopse = """
                O Filme é uma história de amor entre um homem e uma mulher,
                que vivem em um mundo pós-apocalíptico.
                Ano de lançamento: %s
                Média das notas: %s
                """.formatted(anoLancamento, classificacao);

        System.out.println(sinopse);

        int temperatura = 30;
        String mensagem = "O dia está com a temperatura de %s graus".formatted(temperatura);
        int fahrenheit = (int) (temperatura * 1.8 + 32);
        System.out.println(mensagem + " e em fahrenheit é " + fahrenheit);
//        System.out.println(classificacao);

    }
}