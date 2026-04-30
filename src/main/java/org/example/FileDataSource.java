package org.example;
import javax.inject.Inject;
import java.util.Collections;
import java.util.List;

public class FileDataSource {
    private final FileSystemAccess fileSystem;
    private final FilePreferences preferences;

    @Inject
    public FileDataSource(FileSystemAccess fileSystem, FilePreferences preferences) {
        this.fileSystem = fileSystem;
        this.preferences = preferences;
    }

    public List<Book> getCachedBooks() {
        if (preferences.isCacheEnabled()) {
            fileSystem.readLocalFile();
            return Collections.singletonList(new Book(301, "Fahrenheit 451", "Ray Bradbury"));
        }
        return Collections.emptyList();
    }
}