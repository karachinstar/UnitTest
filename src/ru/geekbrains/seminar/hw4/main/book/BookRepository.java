package ru.geekbrains.seminar.hw4.main.book;

import java.util.List;

public interface BookRepository {
    Book findById(String id);
    List<Book> findAll();
}
