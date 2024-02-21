import java.math.BigDecimal;
import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("Vamos criar a sua conta");
        System.out.println("============================");
        System.out.print("Digite o seu nome: ");
        String name = input.next();
        System.out.print("Digite o valor que depositara na conta: ");
        BigDecimal balance = input.nextBigDecimal();

        System.out.println("\n============================");
        System.out.println("Dados iniciais do cliente:\n");
        System.out.printf("Nome: %s\n", name);
        System.out.println("Conta: Corrente");
        System.out.printf("Saldo inicial: R$ %.2f\n", balance);
        System.out.println("============================");

        short opt = 0;

        while (opt != 4) {
            System.out.println("\nOperações\n");

            System.out.println("1- Consultar saldo\n2- Receber valor\n3- Transferir valor\n4- Sair\n");
            System.out.print("Digite a opção desejada: ");
            opt = input.nextShort();

            if (opt == 1) {
                showBalance(balance);
            } else if (opt == 2) {
                System.out.print("\nDigite o valor a ser recebido: R$ ");
                BigDecimal receiveValue = input.nextBigDecimal();
                balance = receiveMoney(receiveValue, balance);
                System.out.printf("Novo saldo R$ %.2f\n", balance);
            } else if (opt == 3) {
                System.out.print("\nDigite o valor a ser transferido: R$ ");
                BigDecimal transferValue = input.nextBigDecimal();
                balance = transferMoney(transferValue, balance);
                System.out.printf("Novo saldo R$ %.2f\n", balance);
            } else if (opt == 4) {
                System.out.println("\n============================");
                System.out.println("Saindo, até mais!");
                System.out.println("============================");
            } else {
                System.out.println("Opção inválida");
            }
        }
        input.close();
    }

    public static void showBalance(BigDecimal currentBalance) {
        System.out.printf("O saldo atual é R$ %.2f\n", currentBalance);
    }

    public static BigDecimal transferMoney(BigDecimal transferValue, BigDecimal currentBalance) {
        if (currentBalance.compareTo(transferValue) < 0) {
            System.out.println("Saldo insuficiente\n");
            return currentBalance;
        }
        else return currentBalance.subtract(transferValue);
    }

    public static BigDecimal receiveMoney(BigDecimal receiveValue, BigDecimal currentBalance) {
        return currentBalance.add(receiveValue);
    }
}
