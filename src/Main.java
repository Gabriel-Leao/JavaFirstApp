public class Main {
    public static void main(String[] args) {
        String movieName = "Laranja Mecânica";
        String synopsis = "O jovem Alex passa as noites com uma gangue de amigos briguentos. Depois que é preso, se submete a uma técnica de modificação de comportamento para poder ganhar sua liberdade.";
        int movieReleaseYear = 1971;
        double movieGrade = 9.9;
        double movieAverageGrade = (movieGrade + 8 + 8.5) / 3;


        System.out.println("Esse é o Screen Match");

        System.out.printf("Filme: %s\nSinopse: %s\nAno de lançamento: %d\nNota: %.1f%n", movieName, synopsis, movieReleaseYear, movieAverageGrade);
    }
}