package org.example;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    BookRepository provideBookRepository(AppBookRepository repository) {
        return repository;
    }
}