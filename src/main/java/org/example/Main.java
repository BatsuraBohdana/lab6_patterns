package org.example;

public class Main {
    public static void main(String[] args) {

        AppComponent appComponent = DaggerAppComponent.create();

        BookRepository bookRepository = appComponent.bookRepository();
        var allBooks = bookRepository.allBooks();

        System.out.println("--- Library Catalog ---");
        allBooks.forEach(book -> System.out.println(book.toString()));
    }
}