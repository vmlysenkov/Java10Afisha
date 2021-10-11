package ru.netology;

import java.util.Arrays;

public class ManagerFilm {
    private int filmLimit = 10;
    private Item[] items = new Item[0];

    // Пустой конструктор
    public ManagerFilm() {
    }

    // Конструктор с параметрами
    public ManagerFilm(int filmLimit) {
        this.filmLimit = filmLimit;
    }

    public void addFilm(Item item) {
        int length = items.length + 1;
        Item[] tmp = new Item[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Item[] findAll() {
        return items;
    }

    public Item[] getLastFilms() {
        int resultLength;
        if (items.length < filmLimit) {
            resultLength = items.length;
        } else {
            resultLength = filmLimit;
        }
        Item[] itemsUpsideDown = new Item[resultLength];
        for (int i = 0; i < itemsUpsideDown.length; i++) {
            int index = items.length - i - 1;
            itemsUpsideDown[i] = items[index];
        }
        return itemsUpsideDown;
    }

    public static void main(String[] args) {
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

        repo.findAll();

        repo.getLastFilms();
    }
}
