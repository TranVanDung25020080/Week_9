package bai94.code;

import java.nio.file.Paths;

public class PathManager {
    public String getConfigFile(String directory, String filename) {
        return Paths.get(directory, filename).toString();
    }
}
