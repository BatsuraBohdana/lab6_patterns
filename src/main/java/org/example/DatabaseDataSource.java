package org.example;
import javax.inject.Inject;
import java.util.Collections;
import java.util.List;

public class DatabaseDataSource {
    private final Database database;
    private final ResultSetConverter converter;

    @Inject
    public DatabaseDataSource(Database database, ResultSetConverter converter) {
        this.database = database;
        this.converter = converter;
    }

    public List<Book> getBooksFromDb() {
        String data = database.executeQuery();
        Book book = converter.convert();
        return Collections.singletonList(book);
    }
}