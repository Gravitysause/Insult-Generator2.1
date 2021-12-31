// Creates Insults.txt
// Chooses an insult from Insults.txt to output

package main;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    static final String LOC = "C:\\Users\\adria\\OneDrive\\Documents\\Java Projects\\InsultGeneratorBot2_1\\Text Files\\Insults.txt";

    static File fObj = new File(LOC);

    public void createFile() {
        try {
            //System.out.println("ask jason");
            if (fObj.createNewFile()) {
                System.out.println("File created: " + fObj.getName());
              } else {
                System.out.println("File already exists.");
              }
        } catch (IOException e) {
            System.out.println("Error creating file");
        }
    }
}