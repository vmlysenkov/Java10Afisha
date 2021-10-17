package ru.netology;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ManagerFilmTest {

    @Test
    void shouldGetLastFilmsWithLimit() {
        ManagerFilm film = new ManagerFilm();
        film.findAll();
        film.addFilm(film.first);
        film.addFilm(film.second);
        film.addFilm(film.third);
        film.addFilm(film.forth);
        film.addFilm(film.fifth);

        Item[] actualResult = film.getLastFilms();
        Item first = new Item(1, "bloodshot", "thriller", "urlFirstFilm");
        Item second = new Item(2, "forward", "cartoon", "urlSecondFilm");
        Item third = new Item(3, "hotelBelgrad", "comedy", "urlThirdFilm");
        Item forth = new Item(4, "gentlemen", "thriller", "urlForthFilm");
        Item fifth = new Item(5, "invisibleMan", "thriller", "urlFifthFilm");
        Item sixth = new Item(6, "trollsWorldTour", "cartoon", "urlSixthFilm");
        Item seventh = new Item(7, "numberOne", "cartoon", "urlSeventhFilm");
        Item eighth = new Item(8, "Venom2", "action", "urlEighthFilm");

        ManagerFilm repo = new ManagerFilm(5);
        repo.addFilm(first);
        repo.addFilm(second);
        repo.addFilm(third);
        repo.addFilm(forth);
        repo.addFilm(fifth);

        Item[] expectedResult = {fifth, forth, third, second, first};

        assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    void shouldGetLastFilmsWithoutLimit() {
        ManagerFilm film = new ManagerFilm();
        film.findAll();
        film.addFilm(film.first);
        film.addFilm(film.second);
        film.addFilm(film.third);
        film.addFilm(film.forth);
        film.addFilm(film.fifth);
        film.addFilm(film.sixth);
        film.addFilm(film.seventh);
        film.addFilm(film.eighth);

        Item[] actualResult = film.getLastFilms();
        Item first = new Item(1, "bloodshot", "thriller", "urlFirstFilm");
        Item second = new Item(2, "forward", "cartoon", "urlSecondFilm");
        Item third = new Item(3, "hotelBelgrad", "comedy", "urlThirdFilm");
        Item forth = new Item(4, "gentlemen", "thriller", "urlForthFilm");
        Item fifth = new Item(5, "invisibleMan", "thriller", "urlFifthFilm");
        Item sixth = new Item(6, "trollsWorldTour", "cartoon", "urlSixthFilm");
        Item seventh = new Item(7, "numberOne", "cartoon", "urlSeventhFilm");
        Item eighth = new Item(8, "Venom2", "action", "urlEighthFilm");

        ManagerFilm repo = new ManagerFilm();
        repo.addFilm(first);
        repo.addFilm(second);
        repo.addFilm(third);
        repo.addFilm(forth);
        repo.addFilm(fifth);
        repo.addFilm(sixth);
        repo.addFilm(seventh);
        repo.addFilm(eighth);


        Item[] expectedResult = {eighth, seventh, sixth, fifth, forth, third, second, first};

        assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    void shouldFindAll() {
        ManagerFilm film = new ManagerFilm();
        film.findAll();
        film.addFilm(film.first);
        film.addFilm(film.second);
        film.addFilm(film.third);
        film.addFilm(film.forth);
        film.addFilm(film.fifth);
        film.addFilm(film.sixth);
        film.addFilm(film.seventh);
        film.addFilm(film.eighth);

        Item[] actualResult = film.findAll();

        Item first = new Item(1, "bloodshot", "thriller", "urlFirstFilm");
        Item second = new Item(2, "forward", "cartoon", "urlSecondFilm");
        Item third = new Item(3, "hotelBelgrad", "comedy", "urlThirdFilm");
        Item forth = new Item(4, "gentlemen", "thriller", "urlForthFilm");
        Item fifth = new Item(5, "invisibleMan", "thriller", "urlFifthFilm");
        Item sixth = new Item(6, "trollsWorldTour", "cartoon", "urlSixthFilm");
        Item seventh = new Item(7, "numberOne", "cartoon", "urlSeventhFilm");
        Item eighth = new Item(8, "Venom2", "action", "urlEighthFilm");

        Item[] expectedResult = {first, second, third, forth, fifth, sixth, seventh, eighth};
        assertArrayEquals(actualResult, expectedResult);

    }
}


