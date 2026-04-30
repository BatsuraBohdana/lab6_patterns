package org.example;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;

public class NetworkBookDataSource implements BookDataSource {

    @Inject
    public NetworkBookDataSource() {}

    @Override
    public List<Book> fetchBooks() {
        return Arrays.asList(
                new Book(3, "The Silent Patient", "Alex Michaelides"),
                new Book(4, "Gone Girl", "Gillian Flynn")
        );
    }
}