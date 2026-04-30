package org.example;

import java.util.List;

public interface BookDataSource {
    List<Book> fetchBooks();
}