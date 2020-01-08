package hello;

import java.io.File;

public class Picture {

    private String path;
    private File file;

    public Picture(File file, String path) {
        this.path = path;
    }

    public String getpath() {
        return path;
    }

    public File getPicture() {
        return file;
    }
}