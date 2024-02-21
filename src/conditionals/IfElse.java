package conditionals;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o ano de lançamento do filme: ");
        short releaseYear = input.nextShort();
        System.out.print("Digite se está incluído no plano: ");
        boolean isIncluded = input.nextBoolean();
        System.out.print("Digite o seu plano: ");
        String subscription = input.next();
        input.close();

        if (releaseYear >= 2015) {
            System.out.println("Filme recente");
        } else if (releaseYear >= 2000) {
            System.out.println("Esse filme já pode tomar uma");
        } else {
            System.out.println("Esse filme é antigo");
        }

        if (isIncluded || subscription.equalsIgnoreCase("plus")) {
            System.out.println("Você pode assistir ao filme");
        }
    }
}
