package ALi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Movie {
    String Name;
    String Type;
    double Rating;
    String Star;

    public Movie() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of Movie");
        this.Name = scan.nextLine();
        System.out.println("Enter the Type of the movie");
        this.Type = scan.nextLine();
        System.out.println("Enter the rating of the movie out of 10");
        this.Rating = scan.nextDouble();
        System.out.println("Enter one of the movie star in it");
        this.Star = scan.next();
    }


    public static ArrayList<Movie> returnActionMovies(ArrayList<Movie> movies) {
        ArrayList<Movie> action = new ArrayList<>();
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).Type.equalsIgnoreCase("action")) {
                action.add(movies.get(i));
            }
        }
        return action;
    }

    public static ArrayList<Movie> returnActor_Actress(ArrayList<Movie> movies, String player) {
        ArrayList<Movie> player1 = new ArrayList<>();
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).Star.equalsIgnoreCase(player)) {
                player1.add(movies.get(i));
            }
        }
        return player1;
    }

    public static ArrayList<String> returnStar(ArrayList<Movie> movies) {
        ArrayList<String> stars = new ArrayList<>();
        for (int i = 0; i < movies.size(); i++) {
            stars.add(movies.get(i).Star);
        }
        return stars;

    }

    public static void movieSuggestion(ArrayList<Movie> movies, String Type) {
        ArrayList<Movie> suggestion = new ArrayList<>();
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).Type.equalsIgnoreCase(Type)) {
                suggestion.add(movies.get(i));
            }
        }
        Movie temp = null;
        double tempRating = 0;

        for (int i = 0; i < suggestion.size(); i++) {
            if (suggestion.get(i).Rating > tempRating) {
                temp = suggestion.get(i);
                tempRating = suggestion.get(i).Rating;
            }
        }
//        for (Movie each:suggestion){
//            if (each.Rating > tempRating){
//                temp=each;
//                tempRating=each.Rating;
//            }
//        }
        System.out.println(" We recommend this movie based on your choice :  Name: " + temp.Name +
                " Type: " + temp.Type + " Rating: " +
                temp.Rating + " Star: " + temp.Star);
    }


    public String toString() {
        return "The name: " + Name + "\nThe Type: " + Type + "\n" + "The rating" + Rating + "\nThe movie star: " + Star;
    }

}
class Main {
    public static void main(String[] args) {
        ArrayList<Movie>movies=new ArrayList<>();
        Movie obj=new Movie();
        Movie obj2=new Movie();

        movies.addAll(Arrays.asList(obj,obj2));
        Movie.movieSuggestion(movies,"Action");

    }

}


