package org.example;

import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    BookRepository bookRepository();
}