import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import Classes.Actor;
import Classes.Movie;
import Classes.Character;

public class Main{

    public static void printAll(Collection<Movie> movies){
        movies.forEach(System.out::println);
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

        Actor actor1 = new Actor("Ford","Harrison");

        Collection<Character> characters = new ArrayList<Character>();

        Character character1 = new Character("Solo","Han");
        Character character2 = new Character("Jones","Indiana");

        characters.add(character1);
        characters.add(character2);

        actor1.setCharacters(characters);

        Collection<Actor> actors = new ArrayList<Actor>();
        actors.add(actor1);

        movie1.setActors(actors);
        movie2.setActors(actors);
        movie3.setActors(actors);

        Collection<Movie> movies = new ArrayList<Movie>();

        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);

        printAll(movies);
    }
}