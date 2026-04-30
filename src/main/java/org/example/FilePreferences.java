package org.example;
import javax.inject.Inject;

public class FilePreferences {
    @Inject
    public FilePreferences() {}

    public boolean isCacheEnabled() {
        return true;
    }
}