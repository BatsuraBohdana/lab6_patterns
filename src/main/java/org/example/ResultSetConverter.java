package org.example;
import javax.inject.Inject;

public class ResultSetConverter {
    @Inject
    public ResultSetConverter() {}

    public Book convert() {
        return new Book(201, "The Memory Police", "Yoko Ogawa");
    }
}