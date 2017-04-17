package example.codeclan.com.movie;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by user on 17/04/2017.
 */

public class RankingsTest {

    Rankings rankings;

    @Before
    public void before(){
        rankings = new Rankings();
    }

    @Test
    public void rankingHasTenSpacesTest(){
        Rankings topTen = new Rankings();
        assertNotNull(topTen);
    }

    @Test
    public void addToRankingsTest(){
        Movie movie = new Movie ("Shawshank Redemption", "Drama", 1);
        rankings.addToRankings(movie);
        assertEquals("Shawshank Redemption", rankings.getMovieByRanking(1).getTitle());
    }

    @Test
    public void addMultipleToRankingsTest(){
        Movie movie = new Movie ("Shawshank Redemption", "Drama", 1);
        Movie movie2 = new Movie ("The Godfather", "Crime", 2);
        Movie movie3 = new Movie ("The Dark Knight", "Action", 3);
        Movie movie4 = new Movie ("The Godfather II", "Crime", 4);
        Movie movie5 = new Movie ("Schindler's List", "Drama", 5);
        rankings.addToRankings(movie);
        rankings.addToRankings(movie2);
        rankings.addToRankings(movie3);
        rankings.addToRankings(movie4);
        rankings.addToRankings(movie5);
        assertEquals("The Dark Knight", rankings.getMovieByRanking(3).getTitle());
    }

    @Test
    public void addToEndOfList(){
        Movie movie = new Movie ("Shawshank Redemption", "Drama", 1);
        Movie movie2 = new Movie ("The Godfather", "Crime", 2);
        Movie movie3 = new Movie ("The Dark Knight", "Action", 3);
        Movie movie4 = new Movie ("The Godfather II", "Crime", 4);
        Movie movie5 = new Movie ("Schindler's List", "Drama", 5);
        Movie movie6 = new Movie ("Pulp Fiction", "Crime", 6);
        Movie movie7 = new Movie ("The Lord Of The Rings: Return of the King", "Advernture", 7);
        Movie movie8 = new Movie ("The Good, the Bad and the Ugly", "Western", 8);
        Movie movie9 = new Movie ("12 Angry Men", "Crime", 9);
        Movie movie10 = new Movie ("The Lord Of The Rings: The Fellowship of the Ring", "Adventure", 10);
        Movie movie11 = new Movie ("Die Hard", "Action", 10);
        rankings.addToRankings(movie);
        rankings.addToRankings(movie2);
        rankings.addToRankings(movie3);
        rankings.addToRankings(movie4);
        rankings.addToRankings(movie5);
        rankings.addToRankings(movie6);
        rankings.addToRankings(movie7);
        rankings.addToRankings(movie8);
        rankings.addToRankings(movie9);
        rankings.addToRankings(movie10);
        rankings.addToRankings(movie11);
        assertEquals("Die Hard", rankings.getMovieByRanking(10).getTitle());
    }

    @Test
    public void getMovieByTitleTest(){
        Movie movie = new Movie ("Shawshank Redemption", "Drama", 1);
        Movie movie2 = new Movie ("The Godfather", "Crime", 2);
        rankings.addToRankings(movie);
        rankings.addToRankings(movie2);
        assertEquals(movie2, rankings.getMovieByTitle("The Godfather"));
    }

    @Test
    public void moveUpRankingTest(){
        Movie movie = new Movie ("Shawshank Redemption", "Drama", 1);
        Movie movie2 = new Movie ("The Godfather", "Crime", 2);
        rankings.addToRankings(movie);
        rankings.addToRankings(movie2);
        rankings.moveUpRanking(movie2);
        assertEquals(movie2,rankings.getMovieByRanking(1));
    }

    @Test
    public void moveUpRankingTest2(){
        Movie movie = new Movie ("Shawshank Redemption", "Drama", 1);
        Movie movie2 = new Movie ("The Godfather", "Crime", 2);
        Movie movie3 = new Movie ("The Dark Knight", "Action", 3);
        Movie movie4 = new Movie ("The Godfather II", "Crime", 4);
        Movie movie5 = new Movie ("Schindler's List", "Drama", 5);
        Movie movie6 = new Movie ("Pulp Fiction", "Crime", 6);
        rankings.addToRankings(movie);
        rankings.addToRankings(movie2);
        rankings.addToRankings(movie3);
        rankings.addToRankings(movie4);
        rankings.addToRankings(movie5);
        rankings.addToRankings(movie6);
        rankings.moveUpRanking(movie5);
        assertEquals(movie5,rankings.getMovieByRanking(4));
        assertEquals(movie4,rankings.getMovieByRanking(5));
    }

    @Test
    public void moveDownRankingTest(){
        Movie movie = new Movie ("Shawshank Redemption", "Drama", 1);
        Movie movie2 = new Movie ("The Godfather", "Crime", 2);
        Movie movie3 = new Movie ("The Dark Knight", "Action", 3);
        Movie movie4 = new Movie ("The Godfather II", "Crime", 4);
        Movie movie5 = new Movie ("Schindler's List", "Drama", 5);
        Movie movie6 = new Movie ("Pulp Fiction", "Crime", 6);
        rankings.addToRankings(movie);
        rankings.addToRankings(movie2);
        rankings.addToRankings(movie3);
        rankings.addToRankings(movie4);
        rankings.addToRankings(movie5);
        rankings.addToRankings(movie6);
        rankings.moveDownRanking(movie5);
        assertEquals(movie5,rankings.getMovieByRanking(6));
        assertEquals(movie6,rankings.getMovieByRanking(5));
    }
}
