package loop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double averageRating = 0;
        double rating = 0;
        int i = 0;

        while (rating != -1) {
            System.out.print("Digite a nota do filme: ");
            rating = input.nextDouble();
            if (rating != -1) {
                averageRating += rating;
                i++;
            }
        }

        input.close();

        System.out.printf("A média das notas é %.1f\n", averageRating / i);
    }
}
