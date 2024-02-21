package loop;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double averageRating = 0;
        double rating;

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a nota do filme: ");
            rating = input.nextDouble();
            averageRating += rating;
        }
        input.close();

        System.out.printf("Média do filme %.1f", averageRating / 3);
    }
}
