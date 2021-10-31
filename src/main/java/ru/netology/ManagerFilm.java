package ru.netology;

import java.util.Arrays;
import java.util.Objects;

public class ManagerFilm {
    private int filmLimit = 8;
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

//    public Item[] findAll() {
//        return items;
//    }

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
}
