package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ManagerFilmTest {
    private Item[] items = new Item[0];
    private Item first = new Item(1, "bloodshot", "thriller", "urlFirstFilm");
    private Item second = new Item(2, "forward", "cartoon", "urlSecondFilm");
    private Item third = new Item(3, "hotelBelgrad", "comedy", "urlThirdFilm");
    private Item forth = new Item(4, "gentlemen", "thriller", "urlForthFilm");
    private Item fifth = new Item(5, "invisibleMan", "thriller", "urlFifthFilm");
    private Item sixth = new Item(6, "trollsWorldTour", "cartoon", "urlSixthFilm");
    private Item seventh = new Item(7, "numberOne", "cartoon", "urlSeventhFilm");
    private Item eighth = new Item(8, "Venom2", "action", "urlEighthFilm");


    @Test
    void shouldGetLastFilmsEqualToLimit() {
        ManagerFilm film = new ManagerFilm();
        film.addFilm(first);
        film.addFilm(second);
        film.addFilm(third);
        film.addFilm(forth);
        film.addFilm(fifth);
        film.addFilm(sixth);
        film.addFilm(seventh);
        film.addFilm(eighth);
        Item[] actualResult = film.getLastFilms();
        Item[] expectedResult = {eighth, seventh, sixth, fifth, forth, third, second, first};
        assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    void shouldGetLastFilmsLessThenLimit() {
        ManagerFilm film = new ManagerFilm(8);
        film.addFilm(first);
        film.addFilm(second);
        film.addFilm(third);
        film.addFilm(forth);
        film.addFilm(fifth);
        Item[] actualResult = film.getLastFilms();
        Item[] expectedResult = {fifth, forth, third, second, first};
        assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    void shouldGetLastFilmsMoreThenLimit() {
        ManagerFilm film = new ManagerFilm(4);
        film.addFilm(first);
        film.addFilm(second);
        film.addFilm(third);
        film.addFilm(forth);
        film.addFilm(fifth);
        Item[] actualResult = film.getLastFilms();
        Item[] expectedResult = {fifth, forth, third, second};
        assertArrayEquals(actualResult, expectedResult);
    }
}

