package ru.netology.MovieTheaterPoster.Manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.MovieTheaterPoster.MovieTheaterPoster;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    MovieTheaterPoster item1 = new MovieTheaterPoster(1, "Всех побьем", "23/11/23", "Боевик",5);
    MovieTheaterPoster item2 = new MovieTheaterPoster(2, "Всех полюбим", "24/11/23", "Эротика", 5);
    MovieTheaterPoster item3 = new MovieTheaterPoster(3, "Всех убьем", "25/11/23", "Триллер",5);

    MovieTheaterPoster item4 = new MovieTheaterPoster(4, "Всех найдем", "26/11/23", "Детектив",5);
    MovieTheaterPoster item5 = new MovieTheaterPoster(5, "Всех поженим", "27/11/23", "Мелодрамма",5);
    MovieTheaterPoster item6 = new MovieTheaterPoster(6, "Всем расскажим", "28/11/23", "Документальный фильм",5);
    MovieTheaterPoster item7 = new MovieTheaterPoster(7, "Всех обманим", "29/11/23", "Предвыборная речь депутата",5);

    @Test
    public void addingMovie(){
        MovieManager repo = new MovieManager();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);

        MovieTheaterPoster[] expected = {item1, item2, item3, item4, item5};
        MovieTheaterPoster[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void recentMovieNormal(){
        MovieManager repo = new MovieManager();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.save(item6);
        repo.save(item7);
        repo.save(item1);
        repo.save(item2);
        repo.findLast(item1.getLastFilm());

        MovieTheaterPoster[] expected = {item2, item1, item7, item6, item5};
        MovieTheaterPoster[] actual = repo.findLast(5);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void recentMovieThree(){
        MovieManager repo = new MovieManager();
        MovieTheaterPoster post = new MovieTheaterPoster();
        post.setLastFilm(3);
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.save(item6);
        repo.save(item7);
        repo.save(item1);
        repo.save(item2);
        repo.findLast(item1.getLastFilm());

        MovieTheaterPoster[] expected = {item2, item1, item7,};
        MovieTheaterPoster[] actual = repo.findLast(3);

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void recentMovieSeven(){
        MovieManager repo = new MovieManager();
        MovieTheaterPoster post = new MovieTheaterPoster();
        post.setLastFilm(7);
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.save(item6);
        repo.save(item7);
        repo.save(item1);
        repo.save(item2);
        repo.findLast(item1.getLastFilm());

        MovieTheaterPoster[] expected = {item2, item1, item7,item6, item5, item4, item3};
        MovieTheaterPoster[] actual = repo.findLast(7);

        Assertions.assertArrayEquals(expected, actual);

    }
}
