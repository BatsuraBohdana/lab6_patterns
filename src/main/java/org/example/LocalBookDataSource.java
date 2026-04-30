package org.example;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;

public class LocalBookDataSource implements BookDataSource {

    @Inject
    public LocalBookDataSource() {}

    @Override
    public List<Book> fetchBooks() {
        return Arrays.asList(
                new Book(1, "The Mirror Visitor", "Christelle Dabos"),
                new Book(2, "Six of Crows", "Leigh Bardugo")
        );
    }
}