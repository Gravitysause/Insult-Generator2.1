package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile extends CreateFile {
    public String insult() {
        int insult = randomLine();

        try {
            String line = Files.readAllLines(Paths.get(LOC)).get(insult);
            return line;
        } catch(IOException e) {
            return "Error finding insult";
        }
    }

    // finds the total number of insults
    public static long getInsultsLines() {
        long line;
        try {
            line = Files.lines(Paths.get(LOC)).count();
            return line - 1;
        } catch(IOException e) {
            e.printStackTrace();
            return 1;
        }
    }

    private static int randomLine() {
        int line = (int)(Math.random() * getInsultsLines() + 1);

        return line;
    }
}
