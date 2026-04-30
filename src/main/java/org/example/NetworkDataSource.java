package org.example;
import javax.inject.Inject;
import java.util.Collections;
import java.util.List;

public class NetworkDataSource {
    private final HttpClient httpClient;

    @Inject
    public NetworkDataSource(HttpClient httpClient, JsonConverter jsonConverter) {
        this.httpClient = httpClient;
    }

    public List<Book> getBooksFromApi() {
        httpClient.fetchRawData();
        return Collections.singletonList(new Book(101, "Ninth House", "Leigh Bardugo"));
    }
}