/**
 * Description: Class contains the basic elements of a movie and provides
 * methods to retrieve these elements.
 * Created by Casey Morris on 1/22/15.
 */
public class Movie {
    // has things (fields, instance variables)
    private String name;
    private int year;


    // can do things (methods, behaviors)

    /**
     * Description: Constructor that requires name and year of movie
     * @param name
     * @param year
     */
    public Movie(String name, int year)
    {
        this.name = name;
        this.year = year;
    }

    /**
     * Description: Getter that returns the name of movie
     * @return name of movie requested
     */
    public String getName()
    {
        return name;
    }

    /**
     * Description: Getter that return the year of movie
     * @return year of movie
     */
    public int getYear()
    {
        return year;
    }

    /**
     * Description: Makes a more user friendly way to output data for movie
     * @return Movie to console
     */
    public String toString()
    {
        String result = this.name + " ("+ this.year + ")";
        return result;
    }

    /**
     * Description: Compares to movies by name and year
     * @param otherMovie data type is movie
     * @return boolean whether two movies are the same
     */
    public boolean equals(Movie otherMovie)
    {
        if (this.name.equals(otherMovie.name) && this.year == otherMovie.year)
        {
            return true;
        }

        return false;
    }
}
