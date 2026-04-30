package org.example;
import javax.inject.Inject;

public class Database {
    private final DatabaseConnection connection;

    @Inject
    public Database(DatabaseConnection connection) {
        this.connection = connection;
    }

    public String executeQuery() {
        connection.connect();
        return "Row data from DB";
    }
}