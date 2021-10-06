package ru.netology;

public class FilmRepository {
    private Item[] items = new Item[0];

    public void addFilm(Item item) {
        int length = items.length + 1;
        Item[] tmp = new Item[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

}
