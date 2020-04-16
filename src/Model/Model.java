package Model;

import java.io.FileWriter;
import java.io.IOException;

public class Model {
    public String text;
    FileWriter writer;

    public void logger(String text) {
        this.text = text;
        try {
            writer.write(text + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Model(String path) {
        try {
            this.writer = new FileWriter(path, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
