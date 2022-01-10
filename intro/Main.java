import java.util.Scanner;
import Classes.Movie;
import Classes.Character;

public class Main{

    public static void printAll(Movie[] all){
        for(int i = 0; i < all.length; i++ ){
            System.out.println(all[i]);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Movie movie1 = new Movie("A new hope", 1977, 4, 8000000, 323000000);
        Movie movie2 = new Movie("The empire strikes back", 1980, 5, 10000000, 400000000);

        System.out.println("Veuillez saisir les informations du film que vous souhaitez rentrer");
        System.out.println("---");

        System.out.println("Titre :");
        String title = sc.nextLine();

        System.out.println("Année :");
        String year = sc.nextLine();

        System.out.println("Épisode numéro :");
        String episodeNumber = sc.nextLine();

        System.out.println("Coût :");
        String cost = sc.nextLine();

        System.out.println("Recette :");
        String recipe = sc.nextLine();

        Movie movie3 = new Movie(title, Integer.parseInt(year), Integer.parseInt(episodeNumber), Float.parseFloat(cost), Float.parseFloat(recipe));

        Character character1 = new Character("Skywalker","Anakin");

        Movie[] movies = {movie1,movie2,movie3};
        printAll(movies);
    }
}