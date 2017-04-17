package example.codeclan.com.movie;

import java.lang.reflect.Array;

/**
 * Created by user on 17/04/2017.
 */

public class Rankings {
    private Movie[] topTen = new Movie[10];

    public void addToRankings(Movie movie){
        int position = (movie.getRanking()-1);
        topTen[position] = movie;
    }

    public Movie getMovieByRanking(int ranking) {
        return topTen[ranking - 1];
    }

    public Movie getMovieByTitle(String title) {
        for (Movie movie : topTen) {
            if (title.equals(movie.getTitle())) {
                return movie;
            }
        }
        return null;
    }

    public void moveUpRanking(Movie movie){
        int currentRanking = movie.getRanking();
        Movie aboveMovie = getMovieByRanking((currentRanking-1));
        movie.setRanking(currentRanking-1);
        aboveMovie.setRanking(currentRanking);
        addToRankings(movie);
        addToRankings(aboveMovie);

    }

    public void moveDownRanking(Movie movie){
        int currentRanking = movie.getRanking();
        Movie belowMovie = getMovieByRanking((currentRanking+1));
        movie.setRanking(currentRanking+1);
        belowMovie.setRanking(currentRanking);
        addToRankings(movie);
        addToRankings(belowMovie);

    }
}
