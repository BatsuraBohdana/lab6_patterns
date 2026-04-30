package org.example;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class AppBookRepository implements BookRepository {

    private final NetworkDataSource networkDataSource;
    private final DatabaseDataSource databaseDataSource;
    private final FileDataSource fileDataSource;

    @Inject
    public AppBookRepository(
            NetworkDataSource networkDataSource,
            DatabaseDataSource databaseDataSource,
            FileDataSource fileDataSource) {
        this.networkDataSource = networkDataSource;
        this.databaseDataSource = databaseDataSource;
        this.fileDataSource = fileDataSource;
    }

    @Override
    public List<Book> allBooks() {

        System.out.println("Fetching from Network...");
        List<Book> all = new ArrayList<>(networkDataSource.getBooksFromApi());

        System.out.println("Fetching from Database...");
        all.addAll(databaseDataSource.getBooksFromDb());

        System.out.println("Fetching from Local Files...");
        all.addAll(fileDataSource.getCachedBooks());

        return all;
    }
}