package ru.netology;

public class Main {
    public static void main(String[] args) {
        Item first = new Item(1, "bloodshot", "thriller", "urlFirstFilm");
        Item second = new Item(2, "forward", "cartoon", "urlSecondFilm");
        Item third = new Item(3, "hotelBelgrad", "comedy", "urlThirdFilm");
        Item forth = new Item(4, "gentlemen", "thriller", "urlForthFilm");
        Item fifth = new Item(5, "invisibleMan", "thriller", "urlFifthFilm");
        Item sixth = new Item(6, "trollsWorldTour", "cartoon", "urlSixthFilm");
        Item seventh = new Item(7, "numberOne", "cartoon", "urlSeventhFilm");
        Item eighth = new Item(8, "Venom2", "action", "urlEighthFilm");

        FilmRepository repo = new FilmRepository();
        repo.addFilm(first);
        repo.addFilm(second);
        repo.addFilm(third);
        repo.addFilm(forth);
        repo.addFilm(fifth);
        repo.addFilm(sixth);
        repo.addFilm(seventh);
        repo.addFilm(eighth);
    }
}
