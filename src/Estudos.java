public class Estudos {
    public static void main(String[] strings) {

        int[] array = {10, 15, 34};

        for (int i = 0; i < array.length; i++) {
            System.out.println(i+1 + "° aluno nota: " + array[i]);
        }

        // Exercicio 1°
        // Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double media = (8.5 + 7.5) / 2;
        System.out.println("A média é: " + media);

        // Exercicio 2°
        // Declare uma variável do tipo double e uma variável do tipo int.
        // Faça o casting da variável double para int e imprima o resultado.
        double valor = 10.5;
        int valorInt = (int) valor;
        System.out.println("Valor inteiro: " + valorInt);

        // Exercicio 3°
        // Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
        // Atribua valores a essas variáveis e concatene-as em uma mensagem.
        char letra = 'a';
        String palavra = "Olá";
        String mensagem = palavra + " " + letra;
        System.out.println(mensagem);

        // Exercicio 4°
        // Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
        // Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
        double precoProduto = 10.5;
        int quantidade = 3;
        double valorTotal = precoProduto * quantidade;
        System.out.println("Valor total: " + valorTotal);

        // Exercicio 5°
        // Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
        // Considere que o valor de 1 dólar é equivalente a 4.94 reais.
        // Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
        double valorEmDolares = 5;
        double valorEmReais = valorEmDolares * 4.94;
        System.out.println("Valor em reais: " + valorEmReais);

        // Exercicio 6°
        // Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável,
        // representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e
        // atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais,
        // aplique-o ao preço original e imprima o novo preço com desconto.
        double precooOriginal = 56.98;
        double percentualDesconto = 10.0;
        double valorDesconto = precooOriginal * (percentualDesconto / 100);
        double precoFinal = precooOriginal - valorDesconto;
        System.out.println("Valor de 10% de desconto: " + valorDesconto);
        System.out.println("Valor final: " + precoFinal);
    }
}
