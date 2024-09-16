package Bonus;

public class Movie {
    private final String title;
    private final String director;
    private final int releaseYear;
    private final String genre;

    public Movie(String title, String director, int releaseYear, String genre) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }

    public void printInfo() {
        System.out.println("Movie: " + title + "\nDirector: " + director + "\nRelease Date: " + releaseYear + "\nGenre: " + genre);
    }
}
