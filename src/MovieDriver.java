import com.sun.tools.javac.util.Name;

import java.io.*;
import java.util.*;

/**
 * Description: This driver is to test the Movie class and SetHelper class.
 * Created by Casey Morris on 1/22/15.
 */
public class MovieDriver {

    public static void main(String[] args)
    {
        System.out.println("Welcome to Moviefone");

        Set<Movie> library = new HashSet<Movie>(); // HashSet or TreeSet
        Set<Movie> favorites = new HashSet<Movie>();
        Set<Movie> watched = new HashSet<Movie>();
        Set<Movie> recentlyWatched = new HashSet<Movie>();
        Set<Movie> comedies = new HashSet<Movie>();
        Set<Movie> dramas = new HashSet<Movie>();
        Set<Movie> action = new HashSet<Movie>();

        Movie m1 = new Movie("Seven Samurai",1954);
        Movie m2 = new Movie("Spirited Away",2001);
        Movie m3 = new Movie("Amélie",2001);
        Movie m4 = new Movie("Toy Story 3",2010);
        Movie m5 = new Movie("Taxi Driver",1976);

        library.add(m1);
        library.add(m2);
        library.add(m3);
        library.add(m4);
        library.add(m5);

        watched.add(m1);
        watched.add(m2);
        watched.add(m2);

        recentlyWatched.add(m1);
        recentlyWatched.add(m3);

        favorites.add(m3);
        favorites.add(m1);
        favorites.add(m4);

        comedies.add(m4);

        System.out.println("Library contains " + library);
        System.out.println("Favorites contains " + favorites);

        SetHelper helper = new SetHelper();

        Set<Movie> watchedDramas = new HashSet<Movie>(watched);
        watchedDramas.retainAll(favorites);

        //What movies have I not watched?
        Set<Movie> unwatched = helper.difference(library, watched);

        //Which of my favorite movies are comedies?
        Set<Movie> favoriteComedies = helper.intersect(favorites,comedies);

        //Which comedies have I not watched yet?
        Set<Movie> unwatchedComedies = helper.intersect(comedies, unwatched);

        //Are there any action-comedy movies I haven’t seen yet?
        Set<Movie> actionComedies = helper.intersect(action, comedies);

        System.out.println(watchedDramas);

        favorites.clear();

        /*
        Map<Movie, Integer> watchedCount = new HashMap<Movie, Integer>();
        watchedCount.put(m3,5);
        watchedCount.put(m2,2);
        watchedCount.put(m1,2);
        //watchedCount.put(m1,8); // Can't do this only one item in the set

        //View Map
        System.out.println("Key: " + watchedCount.keySet()+ " " + "Value" + watchedCount.values());
        */

        // A map that associates number of views of a movie
        Map<Movie, Integer> movieViews = new HashMap<Movie, Integer>();

        // Example of putting two views of movie m1
        movieViews.put(m1,2);
        movieViews.put(m2,6);
        movieViews.put(m3,3);

        Queue<Movie> playList = new LinkedList<Movie>();

        // adds movie m1 to the end of playList
        playList.add(m1);
        playList.add(m2);
        playList.add(m3);

        // peek at the first movie in the playList
        Movie firstToPlay = playList.element();

        System.out.println("First movie to play: "+ firstToPlay);

        // removes the first movie in the playList
        System.out.println("Remove: "+ playList.remove());

        // peek at the first movie in the playList
        firstToPlay = playList.element();
        System.out.println("First movie to play: "+ firstToPlay);

        // removes the second movie which is now the first in the playList
        System.out.println("Remove: "+ playList.remove());

        // peek at the first movie in the playList
        firstToPlay = playList.element();
        System.out.println("First movie to play: "+ firstToPlay);





    }
}
