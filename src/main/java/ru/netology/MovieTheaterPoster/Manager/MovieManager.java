package ru.netology.MovieTheaterPoster.Manager;

import ru.netology.MovieTheaterPoster.MovieTheaterPoster;

public class MovieManager {
    private MovieTheaterPoster[] items = new MovieTheaterPoster[0];

    public void save(MovieTheaterPoster item) {
        MovieTheaterPoster[] tmp = new MovieTheaterPoster[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public MovieTheaterPoster[] findAll() {
        return items;
    }

    public MovieTheaterPoster[] findLast(int lastFilm) {
        MovieTheaterPoster[] tmp = new MovieTheaterPoster[items.length];
        int fact;
        if (tmp.length < lastFilm){
            fact = tmp.length;
        } else {
            fact = lastFilm;
        }
        MovieTheaterPoster[] mas = new MovieTheaterPoster[fact];
        for (int i = 0; i < mas.length; i++){
            mas [i] = items [items.length - (i + 1)];
        }
        return mas;

    }

}
