package ru.netology.MovieTheaterPoster;

public class MovieTheaterPoster {
    private int id;
    private String movieTitle;
    private String releaseData;
    private String genreMovie;
    private int lastFilm = 5;


    public MovieTheaterPoster() {
        this.id = id;
        this.movieTitle = movieTitle;
        this.releaseData = releaseData;
        this.genreMovie = genreMovie;
        this.lastFilm = lastFilm;
    }

    public MovieTheaterPoster(int id, String movieTitle, String releaseData, String genreMovie,int lastFilm) {
        this.id = id;
        this.movieTitle = movieTitle;
        this.releaseData = releaseData;
        this.genreMovie = genreMovie;
        this.lastFilm = lastFilm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getReleaseData() {
        return releaseData;
    }

    public void setReleaseData(String releaseData) {
        this.releaseData = releaseData;
    }

    public String getGenreMovie() {
        return genreMovie;
    }

    public void setGenreMovie(String genreMovie) {
        this.genreMovie = genreMovie;
    }

    public int getLastFilm() {
        return lastFilm;
    }

    public void setLastFilm(int lastFilm) {
        this.lastFilm = lastFilm;
    }


}
