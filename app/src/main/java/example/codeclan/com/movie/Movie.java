package example.codeclan.com.movie;

/**
 * Created by user on 17/04/2017.
 */

public class Movie {
    private String title;
    private String genre;
    private int currentRanking;

    public Movie(String title, String genre, int currentRanking){
        this.title = title;
        this.genre = genre;
        this.currentRanking = currentRanking;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getRanking() {
        return currentRanking;
    }

    public String toString(){
        return "Title: " + title + ", Genre: " + genre + ", Current Ranking: " + currentRanking;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public void setGenre(String newGenre) {
        this.genre = newGenre;
    }

    public void setRanking(int newRanking) {
        this.currentRanking = newRanking;
    }
}
