package org.example;
import javax.inject.Inject;

public class DatabaseConnection {
    @Inject
    public DatabaseConnection() {}

    public void connect() {
        System.out.println("Connected to local database...");
    }
}