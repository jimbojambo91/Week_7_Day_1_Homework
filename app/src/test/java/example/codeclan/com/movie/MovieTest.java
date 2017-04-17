package example.codeclan.com.movie;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 17/04/2017.
 */

public class MovieTest {

    Movie movie;

    @Before
    public void before(){
        movie = new Movie("The Shawshank Redemption", "Drama", 1);
    }

    @Test
    public void testMovieSetUp(){
        assertEquals("The Shawshank Redemption", movie.getTitle());
        assertEquals("Drama", movie.getGenre());
        assertEquals(1, movie.getRanking());
    }

    @Test
    public void testSetTitle(){
        movie.setTitle("Lord of the Rings");
        assertEquals("Lord of the Rings", movie.getTitle());
    }

    @Test
    public void testSetGenre(){
        movie.setGenre("Comedy");
        assertEquals("Comedy", movie.getGenre());
    }

    @Test
    public void testSetRanking(){
        movie.setRanking(2);
        assertEquals(2, movie.getRanking());
    }

    @Test
    public void testToString(){
        String result = "Title: The Shawshank Redemption, Genre: Drama, Current Ranking: 1";
        assertEquals(result, movie.toString());
    }
}
