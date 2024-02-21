package conditionals;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o ano de lançamento do filme: ");
        short day = input.nextShort();
        input.close();
        String dayName = switch (day) {
            case 1 -> "domingo";
            case 2 -> "segunda-feira";
            case 3 -> "terça-feira";
            case 4 -> "quarta-feira";
            case 5 -> "quinta-feira";
            case 6 -> "sexta-feira";
            case 7 -> "sábado";
            default -> "Dia inválido";
        };

        System.out.printf("O dia %d é %s", day, dayName);
    }
}
