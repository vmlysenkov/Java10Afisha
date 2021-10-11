package ru.netology;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ManagerFilmTest {


    @Test
    void getLastFilms() {

        ManagerFilm test = new ManagerFilm(5);
        Item film1 = new Item(8, "Venom2", "action", "urlEighthFilm");
        Item film2 = new Item(7, "numberOne", "cartoon", "urlSeventhFilm");
        Item film3 = new Item(6, "trollsWorldTour", "cartoon", "urlSixthFilm");
        Item film4 = new Item(5, "invisibleMan", "thriller", "urlFifthFilm");
        Item film5 = new Item(4, "gentlemen", "thriller", "urlForthFilm");


        test.addFilm(film1);
        test.addFilm(film2);
        test.addFilm(film3);
        test.addFilm(film4);
        test.addFilm(film5);


        Item[] actualResult = test.getLastFilms();

        Item[] expectedResult = test.findAll();

        Arrays.equals(actualResult, expectedResult);

    }


}
