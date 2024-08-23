import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {

//        Scanner leitura = new Scanner(System.in);
//
//        double mediaAvaliacao = 0;
//        double nota = 0;
//        int totalDeNotas = 0;
//
//        while (nota != -1) {
//            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar ");
//            nota += leitura.nextDouble();
//            if (nota != -1) {
//                mediaAvaliacao += nota;
//                totalDeNotas++;
//            }
//        }
//
//        System.out.println("Média de avaliações: " + mediaAvaliacao / totalDeNotas);

//        Programa();
//        Programa2();

        Programa3Adivinhacao();
    }

    // Exercicio 1°
    // Alice estava praticando seus conhecimentos sobre a estrutura de repetição while e teve a ideia de fazer
    // um programa que apresentasse os números de 1 a 10. Assim,
    // ela escreveu o seguinte trecho de código:

    public static void Programa() {
        int contador = 1;

        while (contador <= 10) {
            // solução 1 - contador++;
            contador++;

            System.out.println(contador);
        }
    }


    // Exercicio 2°
    // Agora que Alice está ficando craque em laços, decidiu desafiar seu amigo Bernardo a transformar o código a seguir,
    // que utiliza um laço while, em um código que utiliza o for.
    // Código com while:

    public static void Programa2() {
//        int contador = 1;
//
//        while (contador <= 10) {
//            System.out.println(contador);
//            contador++;
//        }

        for(int contador = 1; contador <= 10; contador++) {
            System.out.println(contador);
        }
    }

    public static void Programa3Adivinhacao() {
        Scanner leitura = new Scanner(System.in);
        int tentativas = 0;
        int numeroSecreto = 0;
        int palpite = 0;

        while (tentativas <= 5) {
            System.out.println("Tente adivinhar o número secreto!");
            numeroSecreto = (int) (Math.random() * 100);
            palpite = leitura.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número secreto!");
                break;
            } else {
                System.out.println("Ainda não acertou, Tente novamente.");
            }

            tentativas++;

            if (tentativas == 5) {
                System.out.println("Você não acertou o número secreto!");
            }
        }

    }
}
