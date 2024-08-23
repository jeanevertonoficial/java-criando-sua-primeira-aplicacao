public class ContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        while (true) {
            System.out.println("*******************************************************\n");
            System.out.println("Dados iniciais do cliente:");
            System.out.println("Nome: " + conta.getNome("Jean Everton"));
            System.out.println("Tipo de conta: Corrente");
            System.out.println("Saldo inicial: R$ " + conta.getSaldo(conta.saldo));
            System.out.println("*******************************************************\n");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Depósito");
            System.out.println("2. Saque");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Sair");
            System.out.println("*******************************************************\n");
            System.out.println("Digite o número da opção desejada:");
            int opcao = Integer.parseInt(System.console().readLine());
            if (opcao == 1) {
                System.out.println("Digite o valor do depósito:");
                double valorDeposito = Double.parseDouble(System.console().readLine());
                conta.depositar(valorDeposito);
            } else if (opcao == 2) {
                System.out.println("Digite o valor do saque:");
                double valorSaque = Double.parseDouble(System.console().readLine());
                conta.sacar(valorSaque);
            } else if (opcao == 3) {
                System.out.println("Saldo atual: R$" + conta.getSaldo(conta.saldo));
            } else if (opcao == 4) {
                System.out.println("Encerrando o programa...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + ".");
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;

            System.out.println("Saque de R$" + valor + ".");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public double getSaldo(double saldo) {
        return saldo;
    }

    public String getNome(String nome) {
        return nome;
    }
}
