package io;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStreamExample {
    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader("src/io/input.txt");
            FileWriter fileWriter = new FileWriter("src/io/output.txt");

            int charData;
            while((charData = fileReader.read())!=-1){
                fileWriter.write(charData);
            }

            fileReader.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
